package com.example.Backend.Config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // Ubah ini sesuai dengan pola URL yang Anda butuhkan
                .allowedOrigins("http://localhost:5173","https://tokopetani.vercel.app/", "https://tokopetani.netlify.app/")
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Tambahkan 'POST' di sini
                .allowedHeaders("*")
                .allowCredentials(true);
    }
}
