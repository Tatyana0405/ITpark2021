package lesson28;

import com.fasterxml.jackson.databind.ObjectMapper;
import lesson28.service.FoodService;
import lesson28.service.impl.PrintService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootRunner {
    public static void main(String[] args) {
        final ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringBootRunner.class, args);
        final FoodService foodService = applicationContext.getBean(FoodService.class);
        foodService.feed();
        final PrintService printService=applicationContext.getBean(PrintService.class);


    }

    @Bean
    public ObjectMapper objectMapper() {
        return new ObjectMapper();
    }
}
