package co.com.hotel.api.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;
import org.springframework.web.reactive.config.CorsRegistry;

import java.util.Arrays;
import java.util.List;

@Configuration
public class CorsConfig {

    @Bean
    CorsWebFilter corsWebFilter(){
        var corsConfiguration = new CorsConfiguration();
        corsConfiguration.setAllowCredentials(false);
        corsConfiguration.setAllowedOrigins(List.of("http://localhost:4200"));
        corsConfiguration.setAllowedHeaders(List.of("*"));
        corsConfiguration.setAllowedMethods(List.of(HttpMethod.POST.toString()));

        var urlSource = new UrlBasedCorsConfigurationSource();
        urlSource.registerCorsConfiguration("/*", corsConfiguration);

        return new CorsWebFilter(urlSource);
    }
}
