package com.example.dao.in_memory_dao;

import com.example.dao.DAOFactory;
import com.example.dao.TripDAO;
import com.example.dao.UserDAO;

public class InMemoryDAOFactory extends DAOFactory{
    @Override
    public UserDAO getUserDAO() {
        return new InMemoryUserDAO();
    }

    @Override
    public TripDAO getTripDAO() {
        return new InMemoryTripDAO();
    }
}
