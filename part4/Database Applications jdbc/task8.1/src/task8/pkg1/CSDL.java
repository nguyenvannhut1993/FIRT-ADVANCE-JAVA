package task8.pkg1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

/**
 *
 * @author Nguyen Van Nhut
 */
public class CSDL {

    public static void main(String[] args) throws IOException, ClassNotFoundException, SQLException {
        UserController a = new UserController();
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1: login user\n2: Add user");
        System.out.println("Choice 1 , 2");
        int choose = Integer.parseInt(input.readLine());
        switch(choose)
        {
            case 1:
            {
                loginUser(a);
                break;
            }
            case 2:
            {
                addUser(a);
                break;
            }
        }
        
    }
    public static void loginUser( UserController a) throws IOException, ClassNotFoundException, SQLException
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter username");
        String username = input.readLine();
        System.out.println("Enter password");
        String password = input.readLine();
        User user = a.loginUser(username, password);
        if (user != null) {
            System.out.println(user.toString());
        } else {
            System.out.println("user not found");
        }
    }
     public static void addUser( UserController a) throws IOException, ClassNotFoundException, SQLException
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter username");
        String username = input.readLine();
        System.out.println("Enter password");
        String password = input.readLine();
        System.out.println("enter id:");
        int id = Integer.parseInt(input.readLine());
        User b = new User();
        b.setUsername(username);
        b.setPassword(password);
        a.addUser(b,id);
    }

}
