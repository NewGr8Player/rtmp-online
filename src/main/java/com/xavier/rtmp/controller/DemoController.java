package com.xavier.rtmp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class DemoController {

    @RequestMapping(path = {"","/index"})
    public ModelAndView index(ModelAndView modelAndView){
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping(path = {"/content"})
    public ModelAndView content(ModelAndView modelAndView){
        modelAndView.setViewName("content");
        return modelAndView;
    }
}
