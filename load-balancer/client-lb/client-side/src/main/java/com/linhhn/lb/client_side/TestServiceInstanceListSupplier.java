package com.linhhn.lb.client_side;

import org.springframework.cloud.client.DefaultServiceInstance;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import reactor.core.publisher.Flux;

import java.util.Arrays;
import java.util.List;

public class TestServiceInstanceListSupplier implements ServiceInstanceListSupplier {

    private final String serviceId;

    TestServiceInstanceListSupplier(String serviceId) {
        this.serviceId = serviceId;
    }

    @Override
    public String getServiceId() {
        return "";
    }

    @Override
    public Flux<List<ServiceInstance>> get() {
        return Flux.just(Arrays.asList(
                new DefaultServiceInstance(serviceId + "1", serviceId, "localhost", 8081, false),
                new DefaultServiceInstance(serviceId + "2", serviceId, "localhost", 8082, false)
        ));
    }
}
