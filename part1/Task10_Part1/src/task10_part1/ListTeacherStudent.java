/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task10_part1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nguyen Van Nhut 
 * Day 22/08/2016 
 * Version 1 
 * class for Add Student,Add Teacher add input all information of student and teacher 
 *
 */
public class ListTeacherStudent extends Student {

    Teacher[] A;
    Student[] B;

    public ListTeacherStudent(Teacher[] A, Student[] B, String Classs, double corePart1, double corePart2, String Name, String Birthday, String Address, String phoneNumber) {
        super(Classs, corePart1, corePart2, Name, Birthday, Address, phoneNumber);
        this.A = A;
        this.B = B;
    }

    public ListTeacherStudent(Teacher[] A, Student[] B, String Classs, double corePart1, double corePart2) {
        super(Classs, corePart1, corePart2);
        this.A = A;
        this.B = B;
    }

    public ListTeacherStudent(Teacher[] A, Student[] B) {
        this.A = A;
        this.B = B;
    }

    public ListTeacherStudent() {
    }

    public Teacher[] getA() {
        return A;
    }

    public void setA(Teacher[] A) {
        this.A = A;
    }

    public Student[] getB() {
        return B;
    }

    public void setB(Student[] B) {
        this.B = B;
    }

    // input inforamation Teacher
    public Teacher inTeacher(Human C) throws IOException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter name class Leader");
            String name = input.readLine();
            System.out.println("Enter coefficientsSalary");
            double coeff = Double.parseDouble(input.readLine());
            System.out.println("Enter Grant");
            double Grant = Double.parseDouble(input.readLine());
            Teacher T = new Teacher(name, coeff, Grant, C.getName(), C.getBirthday(), C.getAddress(), C.getPhoneNumber());
            return T;
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }

    // input inforamation student

    public Student inStudent(Human C) throws IOException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter name class ");
            String names = input.readLine();
            System.out.println("Enter Sore Part1");
            double Scor1 = Double.parseDouble(input.readLine());
            System.out.println("Enter Score Part2");
            double Scor2 = Double.parseDouble(input.readLine());
            Student St = new Student(names, Scor1, Scor2, C.getName(), C.getBirthday(), C.getAddress(), C.getPhoneNumber());
            return St;
        } catch (NumberFormatException | NullPointerException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return null;
    }

    // add student

    public boolean addStudent(Student St) {
        for (int i = 0; i < B.length; i++) {
            if (B[i] == null) {
                B[i] = St;
                return true;
            }
        }
        return false;
    }

    //add teacher
    public boolean addTeacher(Teacher Te) {
        for (int i = 0; i < A.length; i++) {
            if (A[i] == null) {
                A[i] = Te;
                return true;
            }
        }
        return false;
    }

    // show information Teacher

    public void printInfTeacher() {
        for (Teacher L : A) {
            if (L != null) {
                System.out.println(L.showTeacher());
            }
        }
    }

    // show information Student
    public void printInfStudent() {
        for (Student L : B) {
            if (L != null) {
                System.out.println(L.showStudent());
            }
        }
    }
    // Averanges 
    public double AverangeStudent() {
        double Av = 0;
        for (int i = 0; i < B.length; i++) {
            if (B[i] != null) {
                Av = B[i].calAverage(B[i].corePart1, B[i].corePart2);
            }
        }
       
        System.out.println("Avange Student:" + Av);
        return Av;
    }
    // calculate salary
    public double calSalarys() {
        double Avc = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != null) {
                Avc = A[i].salaryTeacher(A[i].coeffSalary, A[i].grant);
            }
        }
        System.out.println("Avange Student:" + String.format("%.2f", Avc));
        return Avc;
    }
}
