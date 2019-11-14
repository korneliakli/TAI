package com.tai.get_epluspi_service.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class get_epluspi_resource {
    @RequestMapping("/getepluspi")
    double getEPi() {
        RestTemplate eTemplate = new RestTemplate();
        double e = eTemplate.getForObject("http://gete:8082/gete", double.class);
        RestTemplate piTemplate = new RestTemplate();
        double pi = piTemplate.getForObject("http://getpi:8081/getpi", double.class);
        return e + pi;
    }
}
