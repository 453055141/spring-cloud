//package com.zk.dbconfig;
//
//import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
//
///**
// * @Description
// * @Author zengkai
// * @Date 2018/8/22 13:54
// */
//public class DynamicDataSource extends AbstractRoutingDataSource {
//
//    /**
//     * @return java.lang.Object
//     * @Author zengkai
//     * @Description 取得当前使用哪个数据源
//     * @Date 2018/8/22 13:55
//     */
//    @Override
//    protected Object determineCurrentLookupKey() {
//        return DbContextHolder.getDbType();
//    }
//
//    public class DbContextHolder {
//        private static final ThreadLocal contextHolder = new ThreadLocal<>();
//
//        /**
//         * 设置数据源
//         *
//         * @param dbTypeEnum
//         */
//        public static void setDbType(DBTypeEnum dbTypeEnum) {
//            contextHolder.set(dbTypeEnum.getValue());
//        }
//
//        /**
//         * 取得当前数据源
//         *
//         * @return
//         */
//        public static String getDbType() {
//            return contextHolder.get();
//        }
//
//        /**
//         * 清除上下文数据
//         */
//        public static void clearDbType() {
//            contextHolder.remove();
//        }
//    }
//
//    public enum DBTypeEnum {
//        one("dataSource_one"), two("dataSource_two");
//        private String value;
//
//        DBTypeEnum(String value) {
//            this.value = value;
//        }
//
//        public String getValue() {
//            return value;
//        }
//    }
//}
