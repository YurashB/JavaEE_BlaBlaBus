package dao;

public abstract class DAOFactory {

    public static final int INMEMORYDAO = 1;
    public static final int SQLDAO = 2; // another DAO

    public abstract TripDAO getTripDAO();
    public abstract UserDAO getUserDAO();

    public static DAOFactory getDAOFactory(int whichFactory) {
        switch (whichFactory) {
            case INMEMORYDAO:
                return new InMemoryDAOFactory();
//            case SQLDAO:
//                return new SQLDAOFacroty();
            default:
                return null;
        }
    }
}
