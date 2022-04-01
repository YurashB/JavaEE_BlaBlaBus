package dao;

import database.Database;
import model.Destination;
import model.Trip;

import java.util.ArrayList;

public class InMemoryTripDAO implements TripDAO {
    @Override
    public void addTrip(String driversLogin, String driversName, String date, String price, String start, String finish) {
        Database database = Database.getInstance();
        database.addTrip(new Trip(driversLogin, driversName, date, price, new Destination(start, finish)));
    }

    public ArrayList<Trip> findTripsByDestination(String start, String finish) {
        Database database = Database.getInstance();
        ArrayList<Trip> trips = new ArrayList<>();

        for (Trip trip : database.getTrips()) {
            if (trip.getDestination().getStart().equals(start) && trip.getDestination().getFinish().equals(finish)) {
                trips.add(trip);
            }
        }

        return trips;
    }

    @Override
    public Trip findUsersTrip(String login, String date, String price, String start, String finish) {
        Database database = Database.getInstance();

        for (Trip trip : database.getTrips()) {
            if (trip.getDestination().getStart().equals(start) &&
                    trip.getDestination().getFinish().equals(finish) &&
                    trip.getDriversLogin().equals(login)) {
                return trip;
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
    public boolean deleteTrip(String driversLogin, String driversName, String date, String price, String start, String finish) {
        Database database = Database.getInstance();
        Trip trip = new Trip(driversLogin, driversName, date, price, new Destination(start, finish));


        for (Trip currentTrip : database.getTrips()) {
            if (currentTrip.equals(trip)) {
                database.deleteTrip(trip);
                return true;
            }
        }
        return false;
    }
}
