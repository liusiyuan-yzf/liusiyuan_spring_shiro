    <%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    <!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
    <html>  
      <head>  
        <title>shir</title>  
      </head>  
        
      <body>  
        <h1>登录页面</h1>  
        <form action="/liusiyuan_spring_shiro/submit.do" commandName="user" method="post">
        	用户名：<input type="text" name="username"/>
        	密码：<input type="password" name="password"/>
        	<input type="submit"/>
         </form>
      </body>  
    </html>  