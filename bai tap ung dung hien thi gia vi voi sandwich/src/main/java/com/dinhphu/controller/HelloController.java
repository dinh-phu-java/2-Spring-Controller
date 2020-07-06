package com.dinhphu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @RequestMapping("/processForm")
    public String processForm(@RequestParam String[] sandwich, Model model){
        model.addAttribute("sandwich",sandwich);
        return "sandwich-result";
    }
}
