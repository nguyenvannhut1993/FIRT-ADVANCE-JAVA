/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdmanager;

import com.sun.xml.internal.messaging.saaj.soap.impl.CDATAImpl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nguyen Van Nhut Day 19/08/2016 CD Managers class create CD Array and
 * add CD, price CD input: array CD
 *
 */
public class CDManagers {

    CD[] CD1;

    public CDManagers() {
    }

    public CDManagers(CD[] CD1) {
        this.CD1 = CD1;
    }

    public CD[] getCD() {
        return CD1;
    }

    public void setCD(CD[] CD) {
        this.CD1 = CD1;
    }

    // input CD
    public CD inputCD() throws IOException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter Index CD:");
            String indexCD = input.readLine();
            System.out.println("Enter nameCD:");
            String nameCD = input.readLine();
            System.out.println("Enter signer name:");
            String nameSinger = input.readLine();
            System.out.println("number song:");
            int number = Integer.parseInt(input.readLine());
            System.out.println("price:");
            float price = Float.parseFloat(input.readLine());
            CD cd = new CD(indexCD, nameCD, nameSinger, number, price);
            return cd;
        } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }

    // add CD 
    public boolean addCD(CD cd) {
        for (int i = 0; i < CD1.length; i++) {
            if (CD1[i] == null) {
                CD1[i] = cd;
                return true;
            }
        }
        return false;
    }

    // Print CD
    public void printCD() {
        for (CD cd1 : CD1) {
            if (cd1 != null) {
                cd1.printCD();
            }
        }
    }

    public float excutePrice() {
        float pri = 0f;
        for (int i = 0; i < CD1.length; i++) {
            if (CD1[i] != null) {
                pri += CD1[i].Price;
            }
        }
        return pri;
    }
}
