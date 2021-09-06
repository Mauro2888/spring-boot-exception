package com.example.springbootexception.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

    @RequestMapping("/add")
    public String add(){
        int num = 10/0;
        return "add";
    }

/*    @ExceptionHandler(value = {ArithmeticException.class})
    public ModelAndView handException(Exception e){
        ModelAndView view = new ModelAndView();
        view.addObject("exception",e.getMessage());
        view.setViewName("mathError");
        return view;
    }*/
}
