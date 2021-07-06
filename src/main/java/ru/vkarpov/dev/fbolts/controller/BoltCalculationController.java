package ru.vkarpov.dev.fbolts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BoltCalculationController {

    @RequestMapping(value = "/")
    public String boltCalculationController(){
        return "index";
    }
}
