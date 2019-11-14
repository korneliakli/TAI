package com.tai.get_e_service.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class get_e_resource {
    @RequestMapping("/gete")
    public double getE() {
        return Math.E;
    }
}
