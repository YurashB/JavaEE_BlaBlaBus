package controllers;

import dao.DAOFactory;
import model.User;
import services.CorrectTripService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/correct-trip-servlet")
public class CorrectTripServlet extends HttpServlet {

    private DAOFactory daoFactory;

    @Override
    public void init() throws ServletException {
        daoFactory = DAOFactory.getDAOFactory(DAOFactory.INMEMORYDAO);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            User user = (User) request.getSession().getAttribute("user");
            String driversLogin = user.getLogin();
            String oldDate = request.getParameter("oldDate");
            String oldPrice = request.getParameter("oldPrice");
            String oldStart = request.getParameter("oldStart");
            String oldFinish = request.getParameter("oldFinish");
            String newDate = request.getParameter("newDate");
            String newPrice = request.getParameter("newPrice");
            String newStart = request.getParameter("newStart");
            String newFinish = request.getParameter("newFinish");
            System.out.println(oldDate);
            System.out.println(oldPrice);
            System.out.println(oldFinish);
            System.out.println(oldStart);

            if (oldDate == null || oldPrice == null || oldStart == null || oldFinish == null) {
                request.getRequestDispatcher("/WEB-INF/driverJSP/correctTrip.jsp").forward(request, response);
            } else if (newDate.equals("") && newPrice.equals("") && newStart.equals("") && newFinish.equals("")) {
                request.getRequestDispatcher("/WEB-INF/driverJSP/correctTrip.jsp").forward(request, response);
            } else {
                CorrectTripService correctTripService = new CorrectTripService(daoFactory, driversLogin,
                        oldDate, oldPrice, oldStart, oldFinish,
                        newDate, newPrice, newStart, newFinish);
                if (correctTripService.correct()) {
                    request.setAttribute("result", "Операція виконана успішно");
                } else {
                    request.setAttribute("result", "Вказаного маршруту не знайдено");
                }

                request.getRequestDispatcher("/WEB-INF/driverJSP/operationResult.jsp").forward(request, response);
                System.out.println(4);
            }
        } catch (Exception exception) {
            request.setAttribute("error",exception.getMessage());
            request.getRequestDispatcher("/WEB-INF/exceptionJSP/exception.jsp").forward(request,response);
        }
    }
}
