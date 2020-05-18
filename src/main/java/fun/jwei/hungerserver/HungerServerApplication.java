package fun.jwei.hungerserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("fun.jwei.hungerserver.mapper")
public class HungerServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(HungerServerApplication.class, args);
    }

}
