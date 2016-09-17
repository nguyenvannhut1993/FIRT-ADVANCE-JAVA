/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stores;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author nguyen van nhut
 * Day:29/08/2016
 * version 1
 * class for creating Main class
 * 
 */
public class Stores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException, Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        OrderDetail oder[] = new OrderDetail[100];
        Order O = new Order("", "", "", oder);
        String ynn;
        do {
            System.out.println("Do you want buy product? [y/n]");
            ynn = input.readLine();
            if (ynn.equalsIgnoreCase("y")) {
                System.out.println("(1)" + arrayInfo() + "\n" + "(2)" + arrayInfo1() + "\n" + "(3)" + arrayInfo2() + "\n"
                        + "(4)" + arrayInfo3() + "\n" + "(5)" + arrayInfo4());
                System.out.println("place choice one product in your battket: 1 or 2 or 3 or 4 or 5 ");
                int c = Integer.parseInt(input.readLine());
                switch (c) {
                    case 1: {
                        Product P = new Product("fish", 5000);
                        OrderDetail T = inputOrderDetail();
                        OrderDetail Orde = new OrderDetail(T.getQuanlity(), P);
                        O.addProduct(Orde);
                        break;
                    }
                    case 2: {
                        Product P = new Product("chicken", 120000);
                        OrderDetail T = inputOrderDetail();
                        OrderDetail Orde = new OrderDetail(T.getQuanlity(), P);
                        O.addProduct(Orde);
                        break;
                    }
                    case 3: {
                        Product P = new Product("pot", 200000);
                        OrderDetail T = inputOrderDetail();
                        OrderDetail Orde = new OrderDetail(T.getQuanlity(), P);
                        O.addProduct(Orde);
                        break;
                    }
                    case 4: {
                        Product P = new Product("milk", 7000);
                        OrderDetail T = inputOrderDetail();
                        OrderDetail Orde = new OrderDetail(T.getQuanlity(), P);
                        O.addProduct(Orde);
                        break;
                    }
                    case 5: {
                        Product P = new Product("coca", 12000);
                        OrderDetail T = inputOrderDetail();
                        OrderDetail Orde = new OrderDetail(T.getQuanlity(), P);
                        O.addProduct(Orde);
                        break;
                    }
                    default: {
                        System.out.println("please choice correctly");
                        break;
                    }
                }

            } else {
                break;
            }
        } while (ynn.equalsIgnoreCase("y"));
        Order G = inputOrder(oder);
        System.out.println("please choice pay method (1)Credit Card or (2)ATM");
        int choice = Integer.parseInt(input.readLine());
        switch (choice) {
            case 1: {
                inputCredit();
                break;
            }
            case 2: {
                inputATM();
                break;
            }
            default: {
                System.out.println("Please choice 1 or 2");
                break;
            }
        }
        System.out.println("Do you want to add custommer information [y/n]");
        String y = input.readLine();
        if (y.equalsIgnoreCase("y")) {
            InfomationCustommer I = inputInforCustommer(G);
            System.out.println(I.showinforCustom(G));
        } else {
            InfomationCustommer I = new InfomationCustommer();
            System.out.println(I.showNotInfo(G));
        }
    }

    public static Product inputProduct() throws IOException {
        try{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter product name:");
        String nameProd = input.readLine();
        System.out.println("Enter price per product:");
        double price = Double.parseDouble(input.readLine());
        Product p = new Product(nameProd, price);
        return p;
        }
        catch(NumberFormatException e){
            System.out.println("Error:"+e.getMessage());
        }
        return null;
    }

    public static String arrayInfo() throws IOException {
        return "nameProd:" + "fish" + "--" + "price:" + "5000";

    }

    public static String arrayInfo1() throws IOException {
        return "nameProd:" + "chicken" + "--" + "price:" + "120000";
    }

    public static String arrayInfo2() throws IOException {
        return "nameProd:" + "pot" + "--" + "price:" + "200000";

    }

    public static String arrayInfo3() throws IOException {
        return "nameProd:" + "milk" + "--" + "price:" + "7000";
    }

    public static String arrayInfo4() throws IOException {
        return "nameProd:" + "coca" + "--" + "price:" + "12000";
    }

    public static OrderDetail inputOrderDetail() throws IOException {
        try{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter quanlity number:");
        double number = Double.parseDouble(input.readLine());
        OrderDetail orde = new OrderDetail(number, null);
        return orde;
        }
        catch(NumberFormatException e){
            System.out.println("Error:"+e.getMessage());
        }
        return null;
    }

    public static ATMCard inputATM() throws IOException {
        try{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Id card");
        String ids = input.readLine();
        System.out.println("Enter number balance in card");
        double bala = Double.parseDouble(input.readLine());
        System.out.println("Enter authucation code");
        String authu = input.readLine();
        ATMCard A = new ATMCard(bala, authu);
        return A;
        }
        catch(NumberFormatException e){
            System.out.println("Error:"+e.getMessage());
        }
        return null;
    }

    public static CreditCard inputCredit() throws IOException {
        try{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Id card:");
        String id = input.readLine();
        System.out.println("Enter type card");
        String typ = input.readLine();
        System.out.println("Enter dead day card:");
        String dead = input.readLine();
        System.out.println("Enter maximum dept");
        String dept = input.readLine();
        System.out.println("Enter authucation code");
        String authu = input.readLine();
        CreditCard C = new CreditCard(dead, dept, typ, authu);
        return C;
        }
        catch(NumberFormatException e){
            System.out.println("Error:"+e.getMessage());
        }
        return null;
    }

    public static Order inputOrder(OrderDetail[] A) throws IOException {
        try{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Day order product:");
        String day = input.readLine();
        System.out.println("Enter order status: ordered/ were charged / were recieved product");
        String status = input.readLine();
        System.out.println("do you print order [y/n]");
        String yn = input.readLine();
        Order O = new Order(day, yn, status, A);
        return O;
        }
        catch(NumberFormatException e){
            System.out.println("Error:"+e.getMessage());
        }
        return null;
    }

    public static InfomationCustommer inputInforCustommer(Order p) throws IOException {
        try{
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Identify card custommer:");
        String idCard = input.readLine();
        System.out.println("Enter custommer name:");
        String name = input.readLine();
        System.out.println("Enter email:");
        String email = input.readLine();
        System.out.println("Enter phone number:");
        String numberPhone = input.readLine();
        System.out.println("Enter Address:");
        String address = input.readLine();
        InfomationCustommer I = new InfomationCustommer(address, email, idCard, name, numberPhone, p);
        return I;
        }
        catch(NumberFormatException e){
            System.out.println("Error:"+e.getMessage());
        }
        return null;
    }
}
