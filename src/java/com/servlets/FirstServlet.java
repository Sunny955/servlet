package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;

public class FirstServlet implements Servlet {
    
    // Life Cycle method
    ServletConfig conf;
    
    @Override
    public void init(ServletConfig conf){
        this.conf = conf;
        System.out.println("Creating objects!");
    }
    
    @Override
    public void service(ServletRequest req,ServletResponse res) throws ServletException,IOException{
        System.out.println("Servicing....");
        // Set the content type of response
        res.setContentType("text/html");
        PrintWriter p = res.getWriter();
        p.println("<h1>This is my output from servlet method!</h1>");
        p.println("<h1>Today's date is "+new Date().toString()+"</h1>");
    }
    
    @Override
    public void destroy(){
        System.out.println("going to destroy servlet objects!");
    }
    
    // Non life cycle methods
    
    @Override
    public ServletConfig getServletConfig() {
        return this.conf;
    }
    
    @Override
    public String getServletInfo() {
        return "This servlet is created by Amiya Ranjan";
    }
    
    
}
