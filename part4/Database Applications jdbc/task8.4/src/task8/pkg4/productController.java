
package task8.pkg4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nguyen Van Nhut
 * Day 17/09/2016
 * Version 1
 * Class for building class controller
 */
public class productController {
    public List <Category> viewProduct() throws ClassNotFoundException, SQLException
    {
        List <Category> list = new ArrayList<>();
        Database db = new Database();
        Category category = null;
        try(Connection conn = db.connect())
        {
            java.sql.Statement statement = conn.createStatement();
            String sql = "SELECT * FROM category " ;
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next())
            {
                category = new Category();
                category.setIdCa(resultSet.getInt("id"));
                category.setNameCa(resultSet.getString("name"));
                category.setDescription(resultSet.getString("description"));
                list.add(category);
            }
          conn.close();
        }
        catch(SQLException e)
        {
            System.out.println("Error:"+e.getMessage());
        }
       return  list;
    }
    // add category
    public void addCategogy(Category category) throws ClassNotFoundException, SQLException
    {
        Database db = new Database();
        try(Connection conn = db.connect())
        {
            String sql = "INSERT INTO category VALUES(NULL,'"+category.getNameCa()+"','"+category.getDescription()+"')";
             PreparedStatement statement = conn.prepareStatement(sql);
             statement.execute();
        }
    }
    // add product
    public void addProduct(Product product) throws ClassNotFoundException, SQLException
    {
        Database db = new Database();
        try(Connection conn = db.connect())
        {
            String sql = "INSERT INTO product VALUES(NULL,'"+product.getNameProduct()+"','"+product.getPrice()+
                    "','"+product.getQuanlity()+"','"+product.getCategoryId()+"')";
             PreparedStatement statement = conn.prepareStatement(sql);
             statement.execute();
        }
       
    }
    // search product
    public  List <Product> searchProduct(String name) throws ClassNotFoundException, SQLException
    {
        Database db = new Database();
        List <Product> rs;
        try(Connection conn = db.connect())
        {
            rs = new ArrayList<>();
            java.sql.Statement statement = conn.createStatement();
            String sql = "SELECT * FROM product WHERE Name like '%"+name+"%'";
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next())
            {
                Product p = new Product();
                p.setId(resultSet.getInt("id"));
                p.setNameProduct(resultSet.getString("name"));
                p.setPrice(resultSet.getDouble("price"));
                p.setQuanlity(resultSet.getInt("amount"));
                p.setCategoryId(resultSet.getInt("categoryId"));
                rs.add(p);
            }
        }
        return rs;
    }
    // update product
    public void updateProduct(double price, int amount, int id) throws ClassNotFoundException, SQLException
    {
        Database db = new Database();
        try(Connection conn = db.connect())
        {
            String sql = "UPDATE PRODUCT SET price = "+price +",amount = "+amount 
                    + "WHERE id ='"+id+"'";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.executeUpdate();
        }
    }
    // show product
        public List <Product> showProducts() throws ClassNotFoundException, SQLException
    {
        List <Product> list = new ArrayList<>();
        Database db = new Database();
        Product product = null;
        try(Connection conn = db.connect())
        {
            java.sql.Statement statement = conn.createStatement();
            String sql = "SELECT * FROM product " ;
            ResultSet resultSet = statement.executeQuery(sql);
            while(resultSet.next())
            {
                product = new Product();
                product.setId(resultSet.getInt("id"));
                product.setNameProduct(resultSet.getString("name"));
                product.setPrice(resultSet.getDouble("price"));
                product.setQuanlity(resultSet.getInt("amount"));
                product.setCategoryId(resultSet.getInt("categoryId"));
                list.add(product);
            }
          conn.close();
        }
        catch(SQLException e)
        {
            System.out.println("Error:"+e.getMessage());
        }
       return  list;
    }
    // remove product
    public void deleteProduct( int id ) throws ClassNotFoundException, SQLException
    {
        Database db = new Database();
        try(Connection conn = db.connect())
        {
            String sql = "DELETE FROM PRODUCT WHERE id = '"+id+"'";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.execute();
        }
    }
}
