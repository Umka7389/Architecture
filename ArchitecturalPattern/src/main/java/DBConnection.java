import java.sql.*;

public class DBConnection {

    static final String DB_URL = "jdbc:postgresql://127.0.0.1:5432/User";
    static final String USER = "postgres";
    static final String PASS = "2easy4umka";

    public static void main(String[] argv) throws SQLException {
        CacheUserMap cacheUserMap = new CacheUserMap();
        System.out.println("Testing connection to PostgreSQL JDBC");

        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("PostgreSQL JDBC Driver is not found. Include it in your library path ");
            e.printStackTrace();
            return;
        }

        System.out.println("PostgreSQL JDBC Driver successfully connected");
        Connection connection = null;

        try {
            connection = DriverManager
                    .getConnection(DB_URL, USER, PASS);

        } catch (SQLException e) {
            System.out.println("Connection Failed");
            e.printStackTrace();
            return;
        }

        if (connection != null) {
            System.out.println("You successfully connected to database now");
        } else {
            System.out.println("Failed to make connection to database");
        }

        UserMapper userMapper = new UserMapper(connection);
        User userFirst = userMapper.findById(1);
        System.out.println(userFirst);
        cacheUserMap.addUser(userFirst);

        User userSecond = userMapper.findById(2);
        System.out.println(userSecond);
        cacheUserMap.addUser(userSecond);

        User userThird = userMapper.findById(3);
        System.out.println(userThird);
        cacheUserMap.addUser(userThird);
        for (User u :cacheUserMap.getAllUsers()) {
            System.out.println(u);
        }

    }

}

