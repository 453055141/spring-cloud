package com.zk.config;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import java.util.Properties;

/**
 * @Description
 * @Author zengkai
 * @Date 2018/8/22 23:10
 */
@Slf4j
@Configuration
// 精确到 mapper 目录，以便跟其他数据源隔离
@MapperScan(basePackages = SlaveDatasourceConfig.PACKAGE, sqlSessionFactoryRef = "slaveSqlSessionFactory")
public class SlaveDatasourceConfig {

    // 精确到 master 目录，以便跟其他数据源隔离
    static final String PACKAGE = "com.zk.mapper.slave";
    static final String MAPPER_LOCATION = "classpath:mapper/slave/*.xml";


    //初始化数据库连接-事务
    @Bean(name = "slaveDataSource")
    public AtomikosDataSourceBean masterDataSource(Environment env) {
        AtomikosDataSourceBean atomikosDataSourceBean = new AtomikosDataSourceBean();
        atomikosDataSourceBean.setXaDataSourceClassName("com.alibaba.druid.pool.xa.DruidXADataSource");
        atomikosDataSourceBean.setUniqueResourceName("slave");
        atomikosDataSourceBean.setPoolSize(5);
        atomikosDataSourceBean.setReapTimeout(20000);
        Properties prop = build(env, "spring.datasource.druid.slave.");
        atomikosDataSourceBean.setXaProperties(prop);
        return atomikosDataSourceBean;
    }


    //创建Session -事务
    @Bean(name = "slaveSqlSessionFactory")
    public SqlSessionFactory masterSqlSessionFactory(@Qualifier("slaveDataSource") AtomikosDataSourceBean atomikosDataSourceBean) {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        SqlSessionFactory sqlSessionFactory = null;
        try {
            //单例
            sessionFactory.setDataSource(atomikosDataSourceBean);
            sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                    .getResources(SlaveDatasourceConfig.MAPPER_LOCATION));
            sqlSessionFactory = sessionFactory.getObject();
        } catch (Exception e) {
            log.error("数据库连接错误", e);
            e.printStackTrace();
        }

        return sqlSessionFactory;
    }

    private Properties build(Environment env, String prefix) {

        Properties prop = new Properties();
        prop.put("url", env.getProperty(prefix + "url"));
        prop.put("username", env.getProperty(prefix + "username"));
        prop.put("password", env.getProperty(prefix + "password"));
        prop.put("driverClassName", env.getProperty(prefix + "driverClassName", ""));
        prop.put("initialSize", env.getProperty(prefix + "initialSize", Integer.class));
        prop.put("maxActive", env.getProperty(prefix + "maxActive", Integer.class));
        prop.put("minIdle", env.getProperty(prefix + "minIdle", Integer.class));
        prop.put("maxWait", env.getProperty(prefix + "maxWait", Integer.class));
        prop.put("poolPreparedStatements", env.getProperty(prefix + "poolPreparedStatements", Boolean.class));

        prop.put("maxPoolPreparedStatementPerConnectionSize",
                env.getProperty(prefix + "maxPoolPreparedStatementPerConnectionSize", Integer.class));

        prop.put("maxPoolPreparedStatementPerConnectionSize",
                env.getProperty(prefix + "maxPoolPreparedStatementPerConnectionSize", Integer.class));
        prop.put("validationQuery", env.getProperty(prefix + "validationQuery"));
        prop.put("validationQueryTimeout", env.getProperty(prefix + "validationQueryTimeout", Integer.class));
        prop.put("testOnBorrow", env.getProperty(prefix + "testOnBorrow", Boolean.class));
        prop.put("testOnReturn", env.getProperty(prefix + "testOnReturn", Boolean.class));
        prop.put("testWhileIdle", env.getProperty(prefix + "testWhileIdle", Boolean.class));
        prop.put("timeBetweenEvictionRunsMillis",
                env.getProperty(prefix + "timeBetweenEvictionRunsMillis", Integer.class));
        prop.put("minEvictableIdleTimeMillis", env.getProperty(prefix + "minEvictableIdleTimeMillis", Integer.class));
        prop.put("filters", env.getProperty(prefix + "filters"));

        return prop;
    }

}
