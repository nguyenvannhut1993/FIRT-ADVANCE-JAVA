package task8.pkg1;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Nguyen Van Nhut
 */
public class UserController {

    public User loginUser(String username, String password) throws ClassNotFoundException, SQLException {
        Database db = new Database();
        User user = null;
        try (Connection conn = db.connect()) {
            java.sql.Statement statement = conn.createStatement();
            String sql = "SELECT * FROM user WHERE username like '" + username + "' and password like'" + password + "'";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                user = new User();
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                break;
            }
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return user;
    }
    public void addUser(User user, int id) throws ClassNotFoundException, SQLException
    {
        Database db = new Database();
        try(Connection conn = db.connect())
        {
           String sql = "INSERT INTO user VALUES(id,'"+user.getUsername()+"','"+user.getPassword()+"')";
            PreparedStatement state = (PreparedStatement) conn.prepareStatement(sql);
            state.execute();
        }
    }
}
