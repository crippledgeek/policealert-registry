package se.disabledsecurity.policealert.registry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PoliceAlertRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(PoliceAlertRegistryApplication.class, args);
    }

}
