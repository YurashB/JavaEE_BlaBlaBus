package com.example.controllers;

import com.example.dao.DAOFactory;
import com.example.dao.TripDAO;
import com.example.model.Destination;
import com.example.model.Trip;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/find-trip-servlet")
public class FindTripServlet extends HttpServlet {

    private DAOFactory daoFactory;

    @Override
    public void init() {
        daoFactory = DAOFactory.getDAOFactory(DAOFactory.INMEMORYDAO);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String start = request.getParameter("start");
            String finish = request.getParameter("finish");

            if (start.equals("") || finish.equals("")) {
                request.getRequestDispatcher("/WEB-INF/companionJSP/main.jsp").forward(request, response);
            } else {
                TripDAO dao = daoFactory.getTripDAO();

                ArrayList<Trip> trips = dao.findTripsByDestination(new Destination(start, finish));
                System.out.println(trips.toString());
                request.setAttribute("trips", trips);
                request.setAttribute("start", start);
                request.setAttribute("finish", finish);
                request.getRequestDispatcher("/WEB-INF/companionJSP/tripsByDestination.jsp").forward(request, response);
            }
        } catch (Exception exception) {
            request.setAttribute("error",exception.getMessage());
            request.getRequestDispatcher("/WEB-INF/exceptionJSP/exception.jsp").forward(request,response);
        }
    }
}
