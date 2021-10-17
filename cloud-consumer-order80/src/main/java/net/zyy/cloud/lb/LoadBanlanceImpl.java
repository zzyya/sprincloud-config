package net.zyy.cloud.lb;

import org.springframework.cloud.client.ServiceInstance;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
@RestController
public class LoadBanlanceImpl implements LoadBanlance {
    private AtomicInteger atomicInteger = new AtomicInteger(0);

    @Override
    public ServiceInstance serviceInstance(List<ServiceInstance> serviceInstanceList) {
        int index = getInNum() % serviceInstanceList.size();
        return serviceInstanceList.get(index);
    }

    private int getInNum() {
        int current;
        int next;
        do {
            current =atomicInteger.get();
            next = current >= 2147483647 ? 0 : current + 1;
        }while (!(this.atomicInteger.compareAndSet(current,next)));
        return next;

    }
}
