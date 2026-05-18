package com.nttdata.eurekaserver;

import org.junit.jupiter.api.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import static org.junit.jupiter.api.Assertions.assertTrue;

class EurekaServerApplicationTest {

    @Test
    void shouldBeAnnotatedAsSpringBootAndEurekaServer() {
        assertTrue(EurekaServerApplication.class.isAnnotationPresent(SpringBootApplication.class));
        assertTrue(EurekaServerApplication.class.isAnnotationPresent(EnableEurekaServer.class));
    }
}
