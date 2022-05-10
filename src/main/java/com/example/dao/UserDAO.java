package com.example.dao;

import com.example.model.User;

public interface UserDAO {

    public void addUser(User user); //Integer id, String name, String login, String password

    public User getUser(String login);

    public void deleteUser(String login);
}
