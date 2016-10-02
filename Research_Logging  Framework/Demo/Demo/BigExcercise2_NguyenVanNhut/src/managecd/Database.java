
package managecd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Nguyen Van Nhut
 * Date 19/09/2016
 * Version : BigExcercise 2
 * class for building Database that connect Database server
 * 
 */
public class Database {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/cdstore?useUnicode=true&characterEncoding=utf8";
    private static final String JDBC_DRIVER_CLASS = "com.mysql.jdbc.Driver";
    private static final String JDBC_USERNAME = "root";
    private static final String JDBC_PASSWORD = "";

    public Connection connect() throws ClassNotFoundException, SQLException {
        Class.forName(JDBC_DRIVER_CLASS);
        Connection conn = (Connection) DriverManager.getConnection(JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
        return conn;
    }
}
