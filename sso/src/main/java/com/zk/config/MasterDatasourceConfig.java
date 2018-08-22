package com.zk.config;

import com.baomidou.mybatisplus.extension.MybatisSqlSessionTemplate;
import com.baomidou.mybatisplus.extension.spring.MybatisSqlSessionFactoryBean;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;

import javax.sql.DataSource;

/**
 * @Description 事务管理器
 * @Author zengkai
 * @Date 2018/8/22 23:04
 */
@Configuration
// 精确到 mapper 目录，以便跟其他数据源隔离
@MapperScan(basePackages = "com.zk.mapper.master", sqlSessionFactoryRef = "sqlSessionFactory")
public class MasterDatasourceConfig {

    @Autowired
    @Qualifier("masterDataSource")
    private DataSource ds;

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        MybatisSqlSessionFactoryBean factoryBean = new MybatisSqlSessionFactoryBean();
        factoryBean.setDataSource(ds);
        //指定mapper xml目录
        ResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
        factoryBean.setMapperLocations(resolver.getResources("classpath:mapper/master/*.xml"));
        return factoryBean.getObject();

    }

    @Bean
    public MybatisSqlSessionTemplate sqlSessionTemplate() throws Exception {
        MybatisSqlSessionTemplate template = new MybatisSqlSessionTemplate(sqlSessionFactory()); // 使用上面配置的Factory
        return template;
    }

    //关于事务管理器，不管是JPA还是JDBC等都实现自接口 PlatformTransactionManager
    // 如果你添加的是 spring-boot-starter-jdbc 依赖，框架会默认注入 DataSourceTransactionManager 实例。
    //在Spring容器中，我们手工注解@Bean 将被优先加载，框架不会重新实例化其他的 PlatformTransactionManager 实现类。
    /*@Bean(name = "transactionManager")
    @Primary
    public DataSourceTransactionManager masterTransactionManager() {
        //MyBatis自动参与到spring事务管理中，无需额外配置，只要org.mybatis.spring.SqlSessionFactoryBean引用的数据源
        // 与DataSourceTransactionManager引用的数据源一致即可，否则事务管理会不起作用。
        return new DataSourceTransactionManager(ds);

    }*/
}
