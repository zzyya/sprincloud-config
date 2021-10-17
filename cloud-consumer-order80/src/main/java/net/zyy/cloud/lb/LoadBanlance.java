package net.zyy.cloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

public interface LoadBanlance {
    ServiceInstance serviceInstance(List<ServiceInstance> serviceInstanceList);
}
