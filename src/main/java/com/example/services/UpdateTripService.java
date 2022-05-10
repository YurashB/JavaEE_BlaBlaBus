package com.example.services;

import com.example.dao.DAOFactory;
import com.example.dao.TripDAO;
import com.example.model.Destination;
import com.example.model.Trip;

public class UpdateTripService {
    private final DAOFactory daoFactory;
    private final String login;
    private final String name;
    private final String oldDate;
    private final String oldPrice;
    private final String oldStart;
    private final String oldFinish;
    private final String newDate;
    private final String newPrice;
    private final String newStart;
    private final String newFinish;

    public UpdateTripService(DAOFactory daoFactory, String login, String name, String oldDate, String oldPrice, String oldStart, String oldFinish,
                             String newDate, String newPrice, String newStart, String newFinish) {
        this.daoFactory = daoFactory;
        this.login = login;
        this.name = name;
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
        return dao.findUsersTrip(new Trip(login, name, oldDate,oldPrice, new Destination(oldStart, oldFinish)));
    }

    public boolean update() {
        Trip trip = findTrip();
        if (trip == null) {
            return false;
        }

        if (!newDate.isEmpty()) {
            trip.setDate(newDate);
        }
        if (!newPrice.isEmpty()) {
            trip.setPrice(newPrice);
        }
        if (!newStart.isEmpty()) {
            trip.getDestination().setStart(newStart);
        }
        if (!newFinish.isEmpty()) {
            trip.getDestination().setFinish(newFinish);
        }

        return true;
    }
}
