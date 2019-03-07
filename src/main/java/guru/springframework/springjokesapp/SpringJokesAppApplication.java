package guru.springframework.springjokesapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
/* when we are using xml config we need ImportResource*/
@SpringBootApplication
@ImportResource("classpath:chuck-config.xml")
public class SpringJokesAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJokesAppApplication.class, args);
    }

}
