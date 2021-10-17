package net.zyy.cloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
//public class Config {
//    @Bean
//    public RouteLocator routeLocator(RouteLocatorBuilder routeLocatorBuilder){
//        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();
//        RouteLocator a = routes.route("net.zyy", r -> r.path("/guonei").uri("http://news.baidu.com/guonei")).build();
//        return a;
//    }
//}
