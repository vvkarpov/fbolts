package ru.vkarpov.dev.fbolts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BoltCalculationController {

    @RequestMapping(value = "/calc")
    public String boltCalculationController(@RequestParam(name = "diameter_bolt") int diameterBolt,
                                            @RequestParam(name = "length_bolt") int straightPartLengthBolt,
                                            @RequestParam(name = "price_metal") double priceMetal,
                                            @RequestParam(name = "count_bolts") int countBolts,
                                            Model model) {


/*
        model.addAttribute("diameter_bolt", diameterBolt);
*/

        return "calc";
    }
}