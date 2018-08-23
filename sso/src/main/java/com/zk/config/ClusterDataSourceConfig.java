//package com.zk.config;
//
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.annotation.MapperScan;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.jta.atomikos.AtomikosDataSourceBean;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//
//import java.util.Properties;
//
//@Configuration
////@SpringBootApplication
//// 扫描 Mapper 接口并容器管理
//@MapperScan(basePackages = ClusterDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "clusterSqlSessionFactory")
//public class ClusterDataSourceConfig {
//
//    // 精确到 cluster 目录，以便跟其他数据源隔离
//    static final String PACKAGE = "com.zk.mapper.slave";
//    static final String MAPPER_LOCATION = "classpath:com/zk/mapper/clusterMapper/*.xml";
//
//
//    @Value("${cluster.datasource.url}")
//    private String url;
//
//    @Value("${cluster.datasource.username}")
//    private String user;
//
//    @Value("${cluster.datasource.password}")
//    private String password;
//
//    @Value("${cluster.datasource.driverClassName}")
//    private String driverClass;
//
////    @Bean(name = "clusterDataSource")
////    public DataSource clusterDataSource() {
////        DruidDataSource dataSource = new DruidDataSource();
////        dataSource.setDriverClassName(driverClass);
////        dataSource.setUrl(url);
////        dataSource.setUsername(user);
////        dataSource.setPassword(password);
////        return dataSource;
////    }
//
//    //初始化数据库连接-事务
//    @Bean(name = "clusterDataSource")
//    public AtomikosDataSourceBean masterDataSource() {
//        AtomikosDataSourceBean atomikosDataSourceBean = new AtomikosDataSourceBean();
//        atomikosDataSourceBean.setUniqueResourceName("clusterDataSource");
////        atomikosDataSourceBean.setXaDataSourceClassName("com.mysql.jdbc.jdbc2.optional.MysqlXADataSource");
//        atomikosDataSourceBean.setXaDataSourceClassName("com.alibaba.druid.pool.xa.DruidXADataSource");
//        Properties properties = new Properties();
//        properties.put("url",url);
//        properties.put("user",user);
//        properties.put("password",password);
//        atomikosDataSourceBean.setXaProperties(properties);
//        atomikosDataSourceBean.setPoolSize(3);
//        atomikosDataSourceBean.setReapTimeout(20000);
//        return atomikosDataSourceBean;
//    }
//
////    @Bean(name = "clusterTransactionManager")
////    public DataSourceTransactionManager clusterTransactionManager() {
////        return new DataSourceTransactionManager(clusterDataSource());
////    }
//
//    @Bean(name = "clusterSqlSessionFactory")
//    public SqlSessionFactory clusterSqlSessionFactory(@Qualifier("clusterDataSource") AtomikosDataSourceBean clusterDataSource)
//            throws Exception {
//        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
//        sessionFactory.setDataSource(clusterDataSource);
//        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
//                .getResources(ClusterDataSourceConfig.MAPPER_LOCATION));
//        return sessionFactory.getObject();
//    }
//}
