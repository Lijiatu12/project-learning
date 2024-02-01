package Servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.ServletSecurity;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



@WebServlet("/userServlet")
public  class UserServlet  extends HttpServlet {




    /* 创建一个javaweb项目，并且添加tomcat作为一个依赖
    重写service方法
   在service  定义业务处理代码
    在web.xml中配置servlet，对应的请求映射路径
     */





    /*
servlet-api.jar导入问题
无需携带jar包，因为tomcat已经提供了servlet-api.jar包


响应：
响应行：协议/版本号 状态码 状态码描述

content-type响应头问题
MiME类型响应头：告诉客户端本次响应体数据格式以及编码格式，方便客户端的解析

响应体数据格式：text/html  image/jpeg  text/plain



url-pattern
http://localhost:8080/项目名/请求路径  各个的基础功能

一个servlet可以配置多个url-pattern，但是一个url-pattern只能对应一个servlet

模糊匹配:   * 不包含jsp   /* 包含jsp     /a/*     *.action
精确匹配：/

     */




    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        // 1.获取请求的任何信息

        String username = request.getParameter("username");//获取请求参数



        // 2.处理请求
        String info = "YES";
        if ("atguigu".equals(username)) {
               info = "NO";
        }


        response.setHeader("content-type","text/html");//设置响应头

        // 3.响应处理结果
        //将响应的数据放入response域中
        PrintWriter writer = response.getWriter();
        writer.write(info);



    }




}

