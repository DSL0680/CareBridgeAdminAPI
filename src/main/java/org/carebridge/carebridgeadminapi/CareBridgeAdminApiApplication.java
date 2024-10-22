package org.carebridge.carebridgeadminapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(basePackages = {"org.carebridge.carebridgeadminapi.time.mapper"})
public class CareBridgeAdminApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(CareBridgeAdminApiApplication.class, args);
    }


}
