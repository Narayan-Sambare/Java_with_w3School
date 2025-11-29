package college.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
import java.io.InputStream;
import java.io.IOException;

public class DBConnection {
    private static Connection connection = null;

    // Load configuration from resources/db_config.properties
    public static Connection getConnection() {
        if (connection == null) {
            try (InputStream input = DBConnection.class.getClassLoader()
                    .getResourceAsStream("db_config.properties")) {

                Properties props = new Properties();
                if (input == null) {
                    System.out.println("❌ Sorry, unable to find db_config.properties");
                    return null;
                }

                props.load(input);

                String url = props.getProperty("db.url");
                String user = props.getProperty("db.user");
                String password = props.getProperty("db.password");

                // Load the MySQL JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // Establish connection
                connection = DriverManager.getConnection(url, user, password);
                System.out.println("✅ Database connected successfully!");

            } catch (IOException | SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
