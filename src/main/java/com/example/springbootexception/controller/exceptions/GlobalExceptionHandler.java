package com.example.springbootexception.controller.exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalExceptionHandler {


    @ExceptionHandler(value = {ArithmeticException.class})
    public ModelAndView handException(Exception e){
        ModelAndView view = new ModelAndView();
        view.addObject("exception",e.getMessage());
        view.setViewName("mathError");
        return view;
    }
}
