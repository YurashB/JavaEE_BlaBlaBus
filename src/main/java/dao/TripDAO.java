package dao;

import model.Trip;

import java.util.ArrayList;

public interface TripDAO {

    public void addTrip(String driversLogin, String driversName, String date, String price, String start, String finish);

    public ArrayList<Trip> findTripsByDestination(String start, String finish);

    public Trip findUsersTrip(String login, String date, String price, String start, String finish);

    public ArrayList<Trip> getAllTrips();

    public boolean deleteTrip(String driversLogin, String driversName, String date, String price, String start, String finish);
}
