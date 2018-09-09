//package com.zk.router;
//
//import com.zk.controller.CityHandler;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.MediaType;
//import org.springframework.web.reactive.function.server.RequestPredicates;
//import org.springframework.web.reactive.function.server.RouterFunction;
//import org.springframework.web.reactive.function.server.RouterFunctions;
//import org.springframework.web.reactive.function.server.ServerResponse;
//
///**
// * @Description
// * @Author zengkai
// * @Date 2018/8/27 22:36
// */
//@Configuration
//public class CityRouter {
//
//    @Bean
//    public RouterFunction<ServerResponse> routeCity(CityHandler cityHandler) {
//        return RouterFunctions
//                .route(RequestPredicates.GET("/hello")
//                                .and(RequestPredicates.accept(MediaType.TEXT_PLAIN)),
//                        cityHandler::helloCity);
//    }
//}
