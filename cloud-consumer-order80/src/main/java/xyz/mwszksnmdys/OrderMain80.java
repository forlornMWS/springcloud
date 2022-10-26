package xyz.mwszksnmdys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import xyz.mwszksnmdys.lb.MyLoadBalancer;

@SpringBootApplication
@EnableEurekaClient
@RibbonClient(name="mylb", configuration = {MyLoadBalancer.class})
public class OrderMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderMain80.class, args);
    }
}