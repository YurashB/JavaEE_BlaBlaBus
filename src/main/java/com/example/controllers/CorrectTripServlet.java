package com.example.controllers;

import com.example.dao.DAOFactory;
import com.example.model.User;
import com.example.services.UpdateTripService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/update-trip-servlet")
public class CorrectTripServlet extends HttpServlet {

    private DAOFactory daoFactory;

    @Override
    public void init() {
        daoFactory = DAOFactory.getDAOFactory(DAOFactory.INMEMORYDAO);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            User user = (User) request.getSession().getAttribute("user");
            String driversLogin = user.getLogin();
            String driversName = user.getName();
            String oldDate = request.getParameter("oldDate");
            String oldPrice = request.getParameter("oldPrice");
            String oldStart = request.getParameter("oldStart");
            String oldFinish = request.getParameter("oldFinish");
            String newDate = request.getParameter("newDate");
            String newPrice = request.getParameter("newPrice");
            String newStart = request.getParameter("newStart");
            String newFinish = request.getParameter("newFinish");

            if (oldDate == null || oldPrice == null || oldStart == null || oldFinish == null) {
                request.getRequestDispatcher("/WEB-INF/driverJSP/correctTrip.jsp").forward(request, response);
            } else if (newDate.equals("") && newPrice.equals("") && newStart.equals("") && newFinish.equals("")) {
                request.getRequestDispatcher("/WEB-INF/driverJSP/correctTrip.jsp").forward(request, response);
            } else {
                UpdateTripService updateTripService = new UpdateTripService(daoFactory, driversLogin,
                        driversName, oldDate, oldPrice, oldStart, oldFinish,
                        newDate, newPrice, newStart, newFinish);
                if (updateTripService.update()) {
                    request.setAttribute("result", "Операція виконана успішно");
                } else {
                    request.setAttribute("result", "Вказаного маршруту не знайдено");
                }

                request.getRequestDispatcher("/WEB-INF/driverJSP/operationResult.jsp").forward(request, response);
                System.out.println(4);
            }
        } catch (Exception exception) {
            request.setAttribute("error", exception.getMessage());
            request.getRequestDispatcher("/WEB-INF/exceptionJSP/exception.jsp").forward(request, response);
        }
    }
}
