package dao;

import model.User;

public interface UserDAO {

    public void addUser(Integer id, String name, String login, String password);

    public User getUserByLoginAndPassword(String login, String password);

    public void deleteUser(String login, String password);
}
