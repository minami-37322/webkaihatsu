package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/mail")
public class MailContoroller {

    @Autowired
    HttpSession session;

    @RequestMapping("")
    public String mail(){
        return "mail-pass";
    }

    @RequestMapping("/pass")
    public String input(String mailadd,String password){
       if("test@example.com".equals(mailadd) && "123".equals(password)){
        session.setAttribute("mail", mailadd);
        session.setAttribute("pass", password);
        return "mail-result.html";
    }else{
        return "mail-pass";
    }
    
    }

}
