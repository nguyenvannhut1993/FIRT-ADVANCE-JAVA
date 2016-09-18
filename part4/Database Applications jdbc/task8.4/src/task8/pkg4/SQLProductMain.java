package task8.pkg4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Nguyen Van Nhut
 * Day 17/09/2016
 * Version 1
 * Class for building main class
 */
public class SQLProductMain {

    public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1: view all categoty\n2: add product\n3: add categogy\n4: search product\n5: Update product \n6: Delete product");
        System.out.println("choose 1 , 2 , 3 , 4 , 5 , 6 ");
        int choice = Integer.parseInt(input.readLine());
        switch (choice) {
            case 1: {
                System.out.println("All category");
                productController p = new productController();
                List<Category> list = p.viewProduct();
                for (Category a : list) {
                    System.out.println(a.toString());
                }
                break;
            }
            case 2:
            {
                System.out.println("Enter name product");
                String name = input.readLine();
                System.out.println("Enter price");
                double price = Double.parseDouble(input.readLine());
                System.out.println("Enter quanlity");
                int quanlity = Integer.parseInt(input.readLine());
                System.out.println("Enter ID category");
                int id = Integer.parseInt(input.readLine());
                Product product = new Product(name, price, quanlity, id);
                productController p = new productController();
                p.addProduct(product);
                break;
            }
            case 3:
            {
                //System.out.println("Enter id");
                //int id = Integer.parseInt(input.readLine());
                System.out.println("Enter name:");
                String name = input.readLine();
                System.out.println("Enter description:");
                String des = input.readLine();
                Category category = new Category(name, des);
                productController p = new productController();
                p.addCategogy(category);
                break;
            }
            case 4:
            {
                productController p = new productController();
                List <Product> listProducts;
                System.out.println("Enter name search:");
                String name = input.readLine();
                try
                {
                    listProducts = p.searchProduct(name);
                    if(listProducts.size()<=0)
                    {
                        System.out.println("Can not find");
                    }
                    else
                    {
                       for(Product a : listProducts)
                       {
                           System.out.println(a.toString());
                       }
                    }
                }
                catch(SQLException | ClassNotFoundException e)
                {
                    System.out.println("Error:"+e.getMessage());
                }
                break;
            }
            case 5:
            {
                productController p = new productController();
                List <Product> list = p.showProducts();
                for(Product a : list)
                {
                    System.out.println(a.toString());
                }
                System.out.println("=======================");
                System.out.println("Enter id:");
                int id =Integer.parseInt(input.readLine());
                System.out.println("Enter price");
                double price = Double.parseDouble(input.readLine());
                System.out.println("Enter quanlity");
                int quanlity = Integer.parseInt(input.readLine());
                p.updateProduct(price,quanlity,id);
                break;
            }
            case 6:
            {
                productController p = new productController();
                System.out.println("Enter id");
                int id = Integer.parseInt(input.readLine());
                p.deleteProduct(id);
                break;
            }
            
        }
    }

}
