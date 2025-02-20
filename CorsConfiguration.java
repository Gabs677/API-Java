package projeto.produto.configuration;

import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfiguration implements WebMvcConfigurer {
    
    @Override
    public void addCorsMappings(@NotNull CorsRegistry registry) {
        registry.addMapping("/**")
            .allowedOrigins("http://localhost:8080")
            .allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS", "HEAD");
    }
}
