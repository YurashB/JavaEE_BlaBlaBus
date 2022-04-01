package dao;

public class InMemoryDAOFactory extends DAOFactory {
    @Override
    public UserDAO getUserDAO() {
        return new InMemoryUserDAO();
    }

    @Override
    public TripDAO getTripDAO() {
        return new InMemoryTripDAO();
    }
}
