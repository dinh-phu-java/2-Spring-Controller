package com.dinhphu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @RequestMapping("/processForm")
    public String processForm(@RequestParam double firstOperand,
                              @RequestParam double secondOperand,
                              @RequestParam String operation, Model theModel){
        double result=0;
        switch(operation){
            case "+Additional":
                result=firstOperand+secondOperand;
                break;
            case "-Subtraction":
                result=firstOperand-secondOperand;
                break;
            case "*Multiplication":
                result = firstOperand*secondOperand;
                break;
            case "/Division":
                result  = firstOperand/secondOperand;
                break;
        }
        theModel.addAttribute("result",result);
        return "result";
    }
}
