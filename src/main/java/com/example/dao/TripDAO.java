package com.example.dao;

import com.example.model.Destination;
import com.example.model.Trip;

import java.util.ArrayList;

public interface TripDAO {

    void addTrip(Trip trip); // String driversLogin, String driversName, String date, String price, String start, String finish

    ArrayList<Trip> findTripsByDestination(Destination destination); // String start, String finish

    Trip findUsersTrip(Trip trip);

    ArrayList<Trip> getAllTrips();

    boolean deleteTrip(Trip trip); // String driversLogin, String driversName, String date, String price, String start, String finish
}
