package controllers;

import dao.DAOFactory;
import dao.TripDAO;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete-trip-servlet")
public class DeleteTripServlet extends HttpServlet {

    private DAOFactory daoFactory;

    @Override
    public void init() throws ServletException {
        daoFactory = DAOFactory.getDAOFactory(DAOFactory.INMEMORYDAO);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            User user = (User)request.getSession().getAttribute("user");
            String driversLogin = user.getLogin();
            String driversName = user.getName();
            String date = request.getParameter("date");
            String price = request.getParameter("price");
            String start = request.getParameter("start");
            String finish = request.getParameter("finish");

            if (driversName == null || date == null ||
                    price == null || start == null ||
                    finish == null ) {
                request.getRequestDispatcher("/WEB-INF/driverJSP/deleteTrip.jsp").forward(request,response);
            } else {
                TripDAO dao = daoFactory.getTripDAO();

                if(dao.deleteTrip(driversLogin, driversName, date, price, start, finish)){
                    request.setAttribute("result", "Рейс видалено успішно");
                } else {
                    request.setAttribute("result", "Даного рейсу не виявлено");
                }

                request.getRequestDispatcher("/WEB-INF/driverJSP/operationResult.jsp").forward(request,response);
            }
        } catch (Exception exception) {
            request.setAttribute("error",exception.getMessage());
            request.getRequestDispatcher("/WEB-INF/exceptionJSP/exception.jsp").forward(request,response);
        }
    }
}
