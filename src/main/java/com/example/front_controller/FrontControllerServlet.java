package com.example.front_controller;

import com.example.controllers.CorrectTripServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/front-controller")
public class FrontControllerServlet extends CorrectTripServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            request.setCharacterEncoding("UTF-8");
            String command = request.getParameter("command");
            command = command == null ? "main" : command;

            switch (command) {
                case "main":
                    request.getRequestDispatcher("/WEB-INF/companionJSP/main.jsp").forward(request, response);
                    break;
                case "findTrip":
                    request.getRequestDispatcher("find-trip-servlet").forward(request, response);
                    break;
                case "findAllTrips":
                    request.getRequestDispatcher("find-all-trips-servlet").forward(request, response);
                    break;
                case "login":
                    if (request.getSession().getAttribute("user") != null) {
                        request.getRequestDispatcher("/WEB-INF/driverJSP/main.jsp").forward(request, response);
                    } else {
                        request.getRequestDispatcher("login-servlet").forward(request, response);
                    }
                    break;
                case "logout":
                    request.getRequestDispatcher("logout-servlet").forward(request, response);// butto
                    break;
                case "driversMain":
                    if (request.getSession().getAttribute("user") == null) {
                        request.getRequestDispatcher("login-servlet").forward(request, response);
                    } else {
                        request.getRequestDispatcher("/WEB-INF/driverJSP/main.jsp").forward(request, response);
                    }
                    break;
                case "addTrip":
                    if (request.getSession().getAttribute("user") == null) {
                        request.getRequestDispatcher("login-servlet").forward(request, response);
                    } else {
                        request.getRequestDispatcher("add-trip-servlet").forward(request, response);
                    }
                    break;
                case "correctTrip":
                    if (request.getSession().getAttribute("user") == null) {
                        request.getRequestDispatcher("login-servlet").forward(request, response);
                    } else {
                        request.getRequestDispatcher("update-trip-servlet").forward(request, response);
                    }
                    break;
                case "deleteTrip":
                    if (request.getSession().getAttribute("user") == null) {
                        request.getRequestDispatcher("login-servlet").forward(request, response);
                    } else {
                        request.getRequestDispatcher("delete-trip-servlet").forward(request, response);
                    }
                    break;
            }
        } catch (Exception exception) {
            request.setAttribute("error",exception.getMessage());
            request.getRequestDispatcher("/WEB-INF/exceptionJSP/exception.jsp").forward(request,response);
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }
}
