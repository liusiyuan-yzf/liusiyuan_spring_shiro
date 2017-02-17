package com.liusiyuan.spring.controller;

import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.servlet.ModelAndView;  
  
/** 
 * @author chenlf 
 *  
 *         2014-3-24 
 */  
@Controller   
//会员中心要被拦截  
public class errorController {  
    // 拦截/index.htm 方法为GET的请求  
    @RequestMapping(value = "/error", method = RequestMethod.GET)  
    public ModelAndView index() {  
        ModelAndView view = new ModelAndView();  
        view.setViewName("/error");  
        return view;  
    }  
  
}  
