package DanielMRocha.AvaliaGadoQi.configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebCors implements WebMvcConfigurer {

    public void addCorsMapping(CorsRegistry reg){
        reg.addMapping("/**")
                .allowedOrigins("*")
                .allowedHeaders("*")
                .allowedMethods("GET,POST,OPTIONS")
                .allowCredentials(true);

    }
}
