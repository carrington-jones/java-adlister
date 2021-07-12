package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO: show the registration form
            req.getRequestDispatcher("/WEB-INF/register.jsp").forward(req, resp);
        }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        // TODO: create a new user based off of the submitted information
        String username = req.getParameter("username");
        String email = req.getParameter("email");
        String password = req.getParameter("password");

        // TODO: ensure the submitted information is valid
        boolean inputHasErrors = username.isEmpty() || email.isEmpty() || password.isEmpty();

        if (inputHasErrors){
            resp.sendRedirect("/login?message=fields+cannot+be+empty");
        } else {
            // TODO: if a user was successfully created, send them to their profile
            User user = new User(username, email, password);
            req.getSession().setAttribute("user", username);
            DaoFactory.getUsersDao().insert(user);
            resp.sendRedirect("/profile");
        }
    }
}
