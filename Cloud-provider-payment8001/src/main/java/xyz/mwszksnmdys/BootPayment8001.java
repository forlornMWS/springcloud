package xyz.mwszksnmdys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication(scanBasePackages = {"xyz.mwszksnmdys"})
@EnableEurekaClient
public class BootPayment8001 {
    public static void main(String[] args) {
        SpringApplication.run(BootPayment8001.class, args);
    }
}
