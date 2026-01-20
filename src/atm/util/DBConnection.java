package atm.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static final String URL=System.getenv("ATM_DB_URL");
    private static final String USERNAME= System.getenv("ATM_DB_USER");
    private static final String PASSWORD= System.getenv("ATM_DB_PASSWORD");

    public static Connection getConnection(){
        try{
            Connection con= DriverManager.getConnection(URL,USERNAME,PASSWORD);
            return con;
        } catch (SQLException e) {
            System.out.println("Failed to connect to database");
            e.printStackTrace();
            return null;
        }
    }

}
