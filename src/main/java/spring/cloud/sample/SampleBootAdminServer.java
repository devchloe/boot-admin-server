package spring.cloud.sample;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

@SpringBootApplication
@EnableAdminServer
@EnableTurbine
public class SampleBootAdminServer {
    public static void main(String[] args) {
        SpringApplication.run(SampleBootAdminServer.class, args);
    }
}
