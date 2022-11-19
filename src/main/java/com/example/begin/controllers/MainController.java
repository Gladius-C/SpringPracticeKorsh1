package com.example.begin.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.Console;

@Controller
public class MainController {
    /*@GetMapping("/bobr1")
    public String index(){
        return "home";
    }
    @GetMapping("/bobr2")
    public String about1(@RequestParam(name = "a", required = false, defaultValue = "бобры") String text, Model model){
        System.out.println(text);
        model.addAttribute("temp",text);
        return "about";
    }
    @PostMapping("/bobr2")
    public String about2(@RequestParam(name = "par") String par, Model model){
        model.addAttribute("temp",par);
        return "about";
    }*/
    @GetMapping("/")
    public String home(){


        return "bobr";
    }

    @GetMapping("/calculator")
    public String getCalculate(@RequestParam(name = "firstnumber") double firstNum,
                               @RequestParam(name = "secondnumber") double secondNum,
                               @RequestParam(name = "action") String act, Model model){
        double result = switch (act) {
            case "+" -> firstNum + secondNum;
            case "-" -> firstNum - secondNum;
            case "*" -> firstNum * secondNum;
            case "/" -> firstNum / secondNum;
            default -> 0;
        };
        model.addAttribute("temp",result);


        return "bobr";
    }

    @PostMapping("/calculator")
    public String postCalculate(@RequestParam(name = "firstnumber") double firstNum,
                                @RequestParam(name = "secondnumber") double secondNum,
                                @RequestParam(name = "action") String act, Model model){
        double result = switch (act) {
            case "+" -> firstNum + secondNum;
            case "-" -> firstNum - secondNum;
            case "*" -> firstNum * secondNum;
            case "/" -> firstNum / secondNum;
            default -> 0;
        };
        model.addAttribute("temp",result);
        return "bobr";
    }
}
