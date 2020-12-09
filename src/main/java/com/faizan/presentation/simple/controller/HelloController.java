package com.faizan.presentation.simple.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @Value("${main.heading}")
    String heading;
    @Value("${sub.heading}")
    String subHeading;
    @Value("${event.owner}")
    String company;

    @GetMapping("/")
    public String homePage(Model model) {

        //Populating Model
        model.addAttribute("heading", heading);
        model.addAttribute("subHeading", subHeading);
        model.addAttribute("company", company);

        //View
        return "landing_page";
    }
}
