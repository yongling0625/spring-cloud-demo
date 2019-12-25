package org.example;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "service-provider")
public interface HelloRemote {

    @GetMapping("/hello/{name}")
    String hello(@PathVariable(value = "name") String name);
}
