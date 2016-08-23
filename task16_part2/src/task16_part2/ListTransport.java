/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task16_part2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author hv
 */
public class ListTransport {

    Car[] A;
    Ship[] B;

    public ListTransport(Car[] A, Ship[] B) {
        this.A = A;
        this.B = B;
    }

    public ListTransport() {
    }

    public Car[] getA() {
        return A;
    }

    public void setA(Car[] A) {
        this.A = A;
    }

    public Ship[] getB() {
        return B;
    }

    public void setB(Ship[] B) {
        this.B = B;
    }

    public boolean addCar(Car C) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == null) {
                A[i] = C;
                return true;
            }

        }
        return false;
    }

    public boolean addShip(Ship C) {
        for (int i = 0; i < B.length; i++) {
            if (B[i] == null) {
                B[i] = C;
                return true;
            }

        }
        return false;
    }

    public void calSpeedCar(double x, double y) throws IOException {
        double s = 0;
        Car c = new Car();
        for (int i = 0; i < A.length; i++) {
            if (A[i] != null) {
                s = A[i].getSpeed(x, y);
            }

        }
        System.out.println("speed:" + s);
    }

    public void calFuelCar(double x, double y) throws IOException {
        double s = 0;
        Car c = new Car();
        for (int i = 0; i < A.length; i++) {
            if (A[i] != null) {
                s = A[i].fuelConsum(x, y);
            }

        }
        System.out.println("Fuel ship comsume:" + s);
    }

    public void calSpeedShip(double x, double y) throws IOException {
        double s = 0;
        Car c = new Car();
        for (int i = 0; i < B.length; i++) {
            if (B[i] != null) {
                s = B[i].getSpeed(x, y);
            }
        }
        System.out.println("speed:" + s);
    }

    public void calFuelShip(double x, double y) throws IOException {
        double s = 0;
        for (int i = 0; i < B.length; i++) {
            if (B[i] != null) {
                s = B[i].fuelConsum(x, y);
            }
        }
        System.out.println("Fuel ship comsume:" + s);
    }

    public void showInfoc() {
        for (Car T : A) {
            if (T != null) {
                System.out.println((T.showInfoCar()));
            }
        }
    }

    public void showInfos() {
        for (Ship L : B) {
            if (L != null) {
                System.out.println(L.showInfoShip());
            }
        }
    }

}
