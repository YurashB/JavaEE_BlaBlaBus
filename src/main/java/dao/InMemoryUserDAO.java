package dao;

import database.Database;
import model.User;

public class InMemoryUserDAO implements UserDAO {
    @Override
    public void addUser(Integer id, String name, String login, String password) {
        Database database = Database.getInstance();

        database.addUser(new User(id, name, login, password));
    }

    @Override
    public User getUserByLoginAndPassword(String login, String password) {
        Database database = Database.getInstance();

        for (User user : database.getUsers()) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public void deleteUser(String login, String password) {
        Database database = Database.getInstance();

        for (User user : database.getUsers()) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                database.deleteUser(user);
                break;
            }
        }
    }
}
