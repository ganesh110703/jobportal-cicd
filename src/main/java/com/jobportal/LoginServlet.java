package com.jobportal;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
 protected void doPost(HttpServletRequest req,HttpServletResponse resp)throws ServletException,IOException{
  String name=req.getParameter("name"); if(name==null||name.trim().isEmpty()) name="Job Seeker";
  req.setAttribute("name",name); req.getRequestDispatcher("/welcome.jsp").forward(req,resp);
 }
}
