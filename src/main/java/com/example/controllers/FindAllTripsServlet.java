package com.example.controllers;

import com.example.dao.DAOFactory;
import com.example.dao.TripDAO;
import com.example.model.Trip;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/find-all-trips-servlet")
public class FindAllTripsServlet extends HttpServlet {

    private DAOFactory daoFactory;

    @Override
    public void init() {
        daoFactory = DAOFactory.getDAOFactory(DAOFactory.INMEMORYDAO);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            TripDAO dao = daoFactory.getTripDAO();
            ArrayList<Trip> trips = dao.getAllTrips();

            request.setAttribute("trips",trips);
            request.getRequestDispatcher("/WEB-INF/companionJSP/allTrips.jsp").forward(request,response);
        } catch (Exception exception) {
            request.setAttribute("error",exception.getMessage());
            request.getRequestDispatcher("/WEB-INF/exceptionJSP/exception.jsp").forward(request,response);
        }
    }
}
