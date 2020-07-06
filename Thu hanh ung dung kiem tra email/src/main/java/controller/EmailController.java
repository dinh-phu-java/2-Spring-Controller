package controller;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;

@Controller
public class EmailController {
    private static Pattern pattern;
    private Matcher matcher;
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    public EmailController(){
        pattern=Pattern.compile(EMAIL_REGEX);
    }

    @RequestMapping("/home")
    public String goHome(){
        return "index";
    }

    @PostMapping("/validate")
    public String validateEmail(@RequestParam String email, Model model){

        boolean isValid=this.validate(email);
        if (!isValid){
            return "index";
        }
        return "success";
    }

    public boolean validate(String regex){
        matcher=pattern.matcher(regex);
        return matcher.matches();
    }
}
