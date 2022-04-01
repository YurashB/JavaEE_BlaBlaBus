package controllers;

import dao.DAOFactory;
import dao.UserDAO;
import model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login-servlet")
public class LoginServlet extends HttpServlet {

    private DAOFactory daoFactory;

    @Override
    public void init() throws ServletException {
        daoFactory = DAOFactory.getDAOFactory(DAOFactory.INMEMORYDAO);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            HttpSession session = request.getSession();
            String login = request.getParameter("login");
            String password = request.getParameter("password");

            if (login == null || password == null) {
                request.getRequestDispatcher("/WEB-INF/driverJSP/login.jsp").forward(request, response);
            }

            UserDAO dao = daoFactory.getUserDAO();
            User user = dao.getUserByLoginAndPassword(login, password);

            if (user == null) {
                request.setAttribute("incorrect", "Пароль чи логін введене неправильно");
                request.getRequestDispatcher("/WEB-INF/driverJSP/login.jsp").forward(request, response);
            }

            session.setAttribute("user", user);
            request.getRequestDispatcher("/WEB-INF/driverJSP/main.jsp").forward(request, response);
        } catch (Exception exception) {
            request.setAttribute("error",exception.getMessage());
            request.getRequestDispatcher("/WEB-INF/exceptionJSP/exception.jsp").forward(request,response);
        }
    }
}
