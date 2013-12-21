package org.sil.bridge.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndustryController {


    @RequestMapping(value = "/industry/profile")
    public String dashBoardPage(){
        return "/industry/profile";
    }
    @RequestMapping(value = "/industry/home")
    public String IndustryHomePage(){
        return "industry/home";
    }
    @RequestMapping(value = "/industry/register")
    public String industryRegisterPage(){
        return "industry/register";

    }
}