package com.tai.get_pi_service.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class get_pi_resource {
    @RequestMapping("/getpi")
    public double getPi() {
        return Math.PI;
    }
}
