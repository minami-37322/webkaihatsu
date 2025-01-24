package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller

@RequestMapping("/total")
public class TotalScopeController {
    
    @RequestMapping("")
     public String index(){
        return "request-scope-total-form";
     }

     @RequestMapping("/input-num")
     public String inputNum(String num1,String num2,Model model){
      model.addAttribute("number1", num1);
      model.addAttribute("number2", num2);
      return "result-total-scope";

     }
}
