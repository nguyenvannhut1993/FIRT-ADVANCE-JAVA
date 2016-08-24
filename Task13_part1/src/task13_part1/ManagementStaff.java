/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task13_part1;

/**
 *
 * @author Nguyen Van Nhut
 * Day 24/08/2016
 * Version 1
 * Class be used for managing staff by create array to save
 */
public class ManagementStaff {

    StaffProduct[] A;
    StaffSale[] B;

    public ManagementStaff(StaffProduct[] A, StaffSale[] B) {
        this.A = A;
        this.B = B;
    }

    public ManagementStaff() {
    }

    public StaffProduct[] getA() {
        return A;
    }

    public void setA(StaffProduct[] A) {
        this.A = A;
    }

    public StaffSale[] getB() {
        return B;
    }

    public void setB(StaffSale[] B) {
        this.B = B;
    }

    public boolean addProduct(StaffProduct T) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == null) {
                A[i] = T;
                return true;
            }
        }
        return false;
    }

    public boolean addSale(StaffSale T) {
        for (int i = 0; i < B.length; i++) {
            if (B[i] == null) {
                B[i] = T;
                return true;
            }
        }
        return false;
    }

    public void showStaffProduct(Salary T) {
        for (StaffProduct L : A) {
            if (L != null) {
                System.out.println(L.showInfoProduct(T));
            }
        }
    }

    public void showStaffSale(Salary T) {
        for (StaffSale L : B) {
            if (L != null) {
                System.out.println(L.showInfoSale(T));
            }
        }
    }
}
