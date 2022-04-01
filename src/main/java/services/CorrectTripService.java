package services;

import dao.DAOFactory;
import dao.TripDAO;
import model.Trip;

public class CorrectTripService {
    private final DAOFactory daoFactory;
    private final String login;
    private final String oldDate;
    private final String oldPrice;
    private final String oldStart;
    private final String oldFinish;
    private final String newDate;
    private final String newPrice;
    private final String newStart;
    private final String newFinish;

    public CorrectTripService(DAOFactory daoFactory, String login, String oldDate, String oldPrice, String oldStart, String oldFinish,
                              String newDate, String newPrice, String newStart, String newFinish) {
        this.daoFactory = daoFactory;
        this.login = login;
        this.oldDate = oldDate;
        this.oldPrice = oldPrice;
        this.oldStart = oldStart;
        this.oldFinish = oldFinish;
        this.newDate = newDate;
        this.newPrice = newPrice;
        this.newStart = newStart;
        this.newFinish = newFinish;
    }

    private Trip findTrip() {
        TripDAO dao = daoFactory.getTripDAO();
        return dao.findUsersTrip(login, oldDate, oldPrice, oldStart, oldFinish);
    }

    public boolean correct() {
        Trip trip = findTrip();
        if (trip == null) {
            return false;
        }

        if (!newDate.equals("")) {
            trip.setDate(newDate);
        }
        if (!newPrice.equals("")) {
            trip.setPrice(newPrice);
        }
        if (!newStart.equals("")) {
            trip.getDestination().setStart(newStart);
        }
        if (!newFinish.equals("")) {
            trip.getDestination().setFinish(newFinish);
        }

        return true;
    }
}
