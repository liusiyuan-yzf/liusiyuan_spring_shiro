package com.liusiyuan.spring.controller;

import org.apache.shiro.SecurityUtils;  
import org.apache.shiro.authc.UsernamePasswordToken;  
import org.apache.shiro.subject.Subject;  
import org.springframework.stereotype.Controller;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.servlet.ModelAndView;  

import com.liusiyuan.spring.pojo.Role;
import com.liusiyuan.spring.pojo.User;
  
 
  
/** 
 * @author chenlf 
 *  
 *         2014-3-24 
 */  
@Controller  
public class LoginController {  
    @RequestMapping(value = "/login", method = RequestMethod.GET)  
    public ModelAndView login() {  
        return new ModelAndView("/login");  
    }  
  
    @RequestMapping(value = "/submit", method = RequestMethod.POST)  
    public ModelAndView submit(String username, String password) {  
        User user = new User("shiro", "123456");  
        user.setRole(new Role("member"));  
        try {  
            // 如果登陆成功  
            if (user.getName().equals(username) && user.getPassword().equals(password)) {  
                UsernamePasswordToken token = new UsernamePasswordToken(user.getName(), user  
                        .getPassword().toString());  
                Subject subject = SecurityUtils.getSubject();  
                subject.login(token);  
            }  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
  
        return new ModelAndView("redirect:/member/index.do");  
    }  
}  
