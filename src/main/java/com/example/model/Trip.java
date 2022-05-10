package com.example.model;

import java.util.Objects;

public class Trip implements java.io.Serializable {
    private String driversLogin;
    private String driversName;
    private String date;
    private String price;
    private Destination destination;

    public Trip(String driversLogin, String driversName, String date, String price, Destination destination) {
        this.driversLogin = driversLogin;
        this.driversName = driversName;
        this.date = date;
        this.price = price;
        this.destination = destination;
    }

    public Trip() {
    }

    public String getDriversLogin() {
        return driversLogin;
    }

    public void setDriversLogin(String driversLogin) {
        this.driversLogin = driversLogin;
    }

    public String getDriversName() {
        return driversName;
    }

    public void setDriversName(String driversName) {
        this.driversName = driversName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Destination getDestination() {
        return destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trip trip = (Trip) o;
        return Objects.equals(driversName, trip.driversName) && Objects.equals(date, trip.date) && Objects.equals(price, trip.price) && Objects.equals(destination, trip.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(driversName, date, price, destination);
    }
}
