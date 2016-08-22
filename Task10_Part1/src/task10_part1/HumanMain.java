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
 *@author Nguyen Van Nhut
 * Day 22/08/2016
 * Version 1
 * class for call function and Main class
 */
public class HumanMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String ysn = "";
        Teacher Tech[] = new Teacher[100];
        Student Stu[] = new Student[100];
        ListTeacherStudent Lists = new ListTeacherStudent(Tech, Stu);
        do {
            System.out.println("Enter Name:");
            String n = input.readLine();
            System.out.println("Enter BirthDay:");
            String b = input.readLine();
            System.out.println("Enter Address:");
            String a = input.readLine();
            System.out.println("Enter Phone Number:");
            String p = input.readLine();
            System.out.println("Please choice (1)Student or (2)Teacher [y/n]:");
            int choice = Integer.parseInt(input.readLine());

            Human hu = new Human(n, b, a, p);

            switch (choice) {
                case 1: {
                    Student Stud = Lists.inStudent(hu);
                    Lists.addStudent(Stud);
                    Lists.printInfStudent();
                    Lists.AverangeStudent();
                    break;
                }
                case 2: {
                    Teacher Teach = Lists.inTeacher(hu);
                    Lists.addTeacher(Teach);
                    Lists.printInfTeacher();
                    Lists.calSalarys();
                }
            }
            System.out.println("do you want add Teacher or add Student [y/n] ");
            ysn = input.readLine();
        } while (ysn.equalsIgnoreCase("y"));
        Lists.printInfStudent();
    }

}
