package com.example.database;

import com.example.model.Destination;
import com.example.model.Trip;
import com.example.model.User;

import java.util.HashSet;

public class Database {

    private static Database instance;
    private final HashSet<Trip> trips = new HashSet<>();
    private final HashSet<User> users = new HashSet<>();

    private Database() {
        trips.add(new Trip("IvaN", "Іван", "01.01.2022", "195", new Destination("Київ", "Одеса")));
        trips.add(new Trip("BoHdAn", "Богдан", "01.01.2022", "203", new Destination("Київ", "Одеса")));
        trips.add(new Trip("Yura", "Юра", "05.01.2022", "298", new Destination("Київ", "Харків")));
        trips.add(new Trip("OLGA", "Оля", "02.01.2022", "100", new Destination("Дніпро", "Львів")));
        trips.add(new Trip("superDRIVER", "Володимир", "07.01.2022", "235", new Destination("Сарни", "Тернопіль")));
        trips.add(new Trip("ruslan123", "Руслан", "010.01.2022", "55", new Destination("Харків", "Хмельницький")));

        users.add(new User(1,"Іван", "IvaN","123"));
        users.add(new User(2,"Богдан", "BoHdAn","123"));
        users.add(new User(3,"Юра", "Yura","123"));
        users.add(new User(4,"Ольга", "OLGA","123"));
        users.add(new User(5,"Володимир", "superDRIVER","123"));
        users.add(new User(6,"Руслан", "ruslan123","123"));
    }

    public HashSet<Trip> getTrips() {
        return trips;
    }

    public void addTrip(Trip trip) {
        trips.add(trip);
    }

    public void deleteTrip(Trip trip) {
        trips.remove(trip);
    }

    public HashSet<User> getUsers() {
        return users;
    }

    public void addUser(User user){
        users.add(user);
    }

    public void deleteUser(User user){users.remove(user);}

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }
}
