package com.example.dao.in_memory_dao;

import com.example.dao.TripDAO;
import com.example.database.Database;
import com.example.model.Destination;
import com.example.model.Trip;

import java.util.ArrayList;

public class InMemoryTripDAO implements TripDAO {
    @Override
    public void addTrip(Trip trip) {
        Database database = Database.getInstance();
        database.addTrip(trip);
    }

    public ArrayList<Trip> findTripsByDestination(Destination destination) {
        Database database = Database.getInstance();
        ArrayList<Trip> trips = new ArrayList<>();

        for (Trip trip : database.getTrips()) {
            if (trip.getDestination().getStart().equals(destination.getStart()) && trip.getDestination().getFinish().equals(destination.getFinish())) {
                trips.add(trip);
            }
        }

        return trips;
    }

    @Override
    public Trip findUsersTrip(Trip trip) {
        Database database = Database.getInstance();

        for (Trip currentTrip : database.getTrips()) {
            if (currentTrip.equals(trip)) {
                return currentTrip;
            }
        }
        return null;
    }

    @Override
    public ArrayList<Trip> getAllTrips() {
        Database database = Database.getInstance();
        return new ArrayList<Trip>(database.getTrips());
    }

    @Override
    public boolean deleteTrip(Trip trip) {
        Database database = Database.getInstance();

        for (Trip currentTrip : database.getTrips()) {
            if (currentTrip.equals(trip)) {
                database.deleteTrip(trip);
                return true;
            }
        }
        return false;
    }
}
