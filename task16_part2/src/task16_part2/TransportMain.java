/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task16_part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import sun.security.krb5.internal.crypto.Des;

/**
 *
 * @author Nguyen Van Nhut
 */
public class TransportMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        try {
            String yn = "";
            Ship[] Sh = new Ship[100];
            Car[] Ca = new Car[100];
            double Des = 0, ti = 0, fue = 0;
            ListTransport lists = new ListTransport(Ca, Sh);
            do {
                BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Enter Distance:");
                Des = Double.parseDouble(input.readLine());
                System.out.println("Enter Time was done:");
                ti = Double.parseDouble(input.readLine());
                System.out.println("Enter number Fuel:");
                fue = Double.parseDouble(input.readLine());
                System.out.println("Enter LicenseID:");
                String lic = input.readLine();
                System.out.println("Enter Owner:");
                String one = input.readLine();
                System.out.println("Enter color:");
                String col = input.readLine();
                System.out.println("Enter Manfacture:");
                String man = input.readLine();
                System.out.println("Please choise (1)car or (2)ship");
                int choice = Integer.parseInt(input.readLine());
                switch (choice) {
                    case 1: {
                        System.out.println("Enter gear:");
                        String gea = input.readLine();
                        System.out.println("Enter type car:");
                        String typ = input.readLine();
                        Car cr = new Car(gea, typ);
                        cr.setLicenseID(lic);
                        cr.setOwner(one);
                        cr.setColor(col);
                        cr.setManfacturer(man);
                        lists.addCar(cr);
                        lists.showInfoc();
                        lists.calSpeedCar(Des, ti);
                        lists.calFuelCar(Des, fue);
                        break;
                    }
                    case 2: {
                        System.out.println("Enter ponderosity:");
                        double pond = Double.parseDouble(input.readLine());
                        System.out.println("Enter capacity:");
                        double capa = Double.parseDouble(input.readLine());
                        System.out.println("Enter speeddown:");
                        double sdow = Double.parseDouble(input.readLine());
                        System.out.println("Enter speedup:");
                        double sup = Double.parseDouble(input.readLine());
                        System.out.println("Enter fuel comsuption:");
                        double fuelcon = Double.parseDouble(input.readLine());
                        System.out.println("Enter type fuel:");
                        String tyf = input.readLine();
                        Ship sp = new Ship(pond, capa, sdow, sup, fuelcon, tyf);
                        sp.setLicenseID(lic);
                        sp.setOwner(one);
                        sp.setColor(col);
                        sp.setManfacturer(man);
                        lists.addShip(sp);
                        lists.showInfos();
                        break;
                    }
                    default:
                        System.out.println("please choise again 1 or 2");
                }
                System.out.println("do you want add car or ship? [y/n]");
                yn = input.readLine();
            } while (yn.equalsIgnoreCase("y"));
            lists.showInfoc();
            lists.showInfos();
            lists.calSpeedCar(Des, ti);
            lists.calFuelCar(Des, fue);
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}
