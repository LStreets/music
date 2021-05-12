package com.music.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 跨域解决
 * @author laojie
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
//        所有请求都允许跨域
        registry.addMapping("/**")  //允许跨域的域名，可以用*表示允许任何域名使用
                .allowedOrigins("*")    //允许任何方法（post、get等）
                .allowedMethods("*")    //允许任何请求头
                .allowedHeaders("*")    //带上cookie信息
                .allowCredentials(true);
    }
}




