package com.example.dao.in_memory_dao;

import com.example.dao.UserDAO;
import com.example.database.Database;
import com.example.model.User;

public class InMemoryUserDAO implements UserDAO {
    @Override
    public void addUser(User user) {
        Database database = Database.getInstance();

        database.addUser(user);
    }

    @Override
    public User getUser(String login) {
        Database database = Database.getInstance();

        for (User user : database.getUsers()) {
            if (login.equals(user.getLogin())) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void deleteUser(String login) {
        Database database = Database.getInstance();

        for (User user : database.getUsers()) {
            if (login.equals(user.getLogin())) {
                database.deleteUser(user);
                break;
            }
        }
    }
}
