/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import models.AccountService;

/**
 *
 * @author WCour
 */
public class LoginServlet extends HttpServlet {

 


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        HttpSession session = request.getSession();
        String logout = request.getParameter("logout");
        String username = request.getParameter("user");
      
        if(logout != null){
            session.invalidate();
            request.setAttribute("message", "You have successfuly logged out");
            logout = null;
            
        }  
        if(session.isNew()){
            getServletContext().getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
        }else {
            response.sendRedirect("home");
        }
        
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        AccountService aut = new AccountService();
        String username = request.getParameter("user");
        String password = request.getParameter("pass");
        
        if(aut.login(username, password)){
             HttpSession session = request.getSession();
             session.setAttribute(username, username);
             request.setAttribute("user", session.getAttribute(username));
             getServletContext().getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
        }else{
            request.setAttribute("message", "Invalid Login");
            response.sendRedirect("home");
        }
        
        
        
       
        
        
    }
        
    }
