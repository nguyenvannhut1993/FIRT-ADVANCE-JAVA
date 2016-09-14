package task6.pkg3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

/**
 *
 * @author Nguyen Van Nhut 
 * Day 08/09/2016 
 * Version 1 class for creating main
 * class
 */
public class SummarySource {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1: print list student\n2: add student\n3: statistic based on grade\n4: number student good,medium,weak\n5: number stduent grade- avarage grade");
        System.out.println("Choose 1 , 2 , 3 , 4 or 5");
        int choose = Integer.parseInt(input.readLine());
        switch (choose) {
            case 1: {
                String names = "";
                int grade = 0;
                double semaster1 = 0, semaster2 = 0;
                double avg = 0;
                try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("src/task6/tongketnamhoc.txt")))) {
                    while (true) {
                        names = in.readUTF();
                        grade = in.readInt();
                        semaster1 = in.readDouble();
                        semaster2 = in.readDouble();
                        avg = (semaster1 + semaster2 * 2) / 3;
                        DecimalFormat df = new DecimalFormat("###.##");
                        avg = Double.parseDouble(df.format(avg));
                        System.out.println("names: " + names + " --- " + "grade: " + grade + " --- " + "semaster1= " + semaster1 + " --- " + "semaster2= " + semaster2
                                + " --- " + "avarage= " + avg);
                    }
                } catch (EOFException | FileNotFoundException e) {
                    System.out.println("Error:" + e.getMessage());
                }
                break;
            }
            case 2: {
                System.out.println("Enter name student:");
                String name = input.readLine();
                System.out.println("Enter block class");
                int block = Integer.parseInt(input.readLine());
                System.out.println("Enter mark HK1:");
                double mark1 = Double.parseDouble(input.readLine());
                System.out.println("Enter mark HK2:");
                double mark2 = Double.parseDouble(input.readLine());
                double ava = calAvage(mark1, mark2);
                String yn = "";
                do {
                    try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src/task6/tongketnamhoc.txt", true)))) {
                        out.writeUTF(name);
                        out.writeInt(block);
                        out.writeDouble(mark1);
                        out.writeDouble(mark2);
                        out.writeDouble(mark2);
                        out.writeDouble(ava);
                    }
                    System.out.println("have you want add student?[y/n]");
                    yn = input.readLine();
                } while (yn.equalsIgnoreCase("y"));
                break;
            }
            case 3: {
                String names = "";
                int grade = 0;
                double semaster1 = 0, semaster2 = 0;
                double avg = 0;
                String grade10 = "";
                String grade11 = "";
                String grade12 = "";
                try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("src/task6/tongketnamhoc.txt")))) {
                    while (true) {
                        names = in.readUTF();
                        grade = in.readInt();
                        semaster1 = in.readDouble();
                        semaster2 = in.readDouble();
                        avg = (semaster1 + semaster2 * 2) / 3;
                        DecimalFormat df = new DecimalFormat("###.##");
                        avg = Double.parseDouble(df.format(avg));
                        if (grade == 10) {
                            grade10 += "names: " + names + " --- " + "grade: " + grade + " --- " + "semaster1= " + semaster1 + " --- " + "semaster2= " + semaster2
                                    + " --- " + "avarage= " + avg + "\n";
                        }
                        if (grade == 11) {
                            grade11 += "names: " + names + " --- " + "grade: " + grade + " --- " + "semaster1= " + semaster1 + " --- " + "semaster2= " + semaster2
                                    + " --- " + "avarage= " + avg + "\n";
                        }
                        if (grade == 12) {
                            grade12 += "names: " + names + " --- " + "grade: " + grade + " --- " + "semaster1= " + semaster1 + " --- " + "semaster2= " + semaster2
                                    + " --- " + "avarage= " + avg + "\n";
                        }

                    }
                } catch (EOFException | FileNotFoundException e) {
                    System.out.println("Error:" + e.getMessage());
                }
                System.out.println("Grade 10:==================");
                System.out.println(grade10);
                System.out.println("Grade 11:==================");
                System.out.println(grade11);
                System.out.println("Grade 12:==================");
                System.out.println(grade12);
                break;

            }
            case 4: {
                String names = "";
                int grade = 0;
                double semaster1 = 0, semaster2 = 0;
                double avg = 0;
                int count1 = 0, count2 = 0, count3 = 0, count4 = 0;
                try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("src/task6/tongketnamhoc.txt")))) {
                    while (true) {
                        names = in.readUTF();
                        grade = in.readInt();
                        semaster1 = in.readDouble();
                        semaster2 = in.readDouble();
                        avg = (semaster1 + semaster2 * 2) / 3;
                        DecimalFormat df = new DecimalFormat("###.##");
                        avg = Double.parseDouble(df.format(avg));
                        if (avg >= 8) {
                            count1++;
                        } else if (avg >= 7 && avg < 8) {
                            count2++;
                        } else if (avg >= 5 && avg < 7) {
                            count3++;
                        } else {
                            count4++;
                        }
                    }
                } catch (EOFException | FileNotFoundException e) {
                    System.out.println("Error:" + e.getMessage());
                }
                System.out.println("Very good student");
                System.out.println("Quality:" + count1);
                System.out.println("Good student");
                System.out.println("Quality:" + count2);
                System.out.println("Medium student");
                System.out.println("Quality:" + count3);
                System.out.println("Weak student");
                System.out.println("Quality:" + count4);
                break;
            }
            case 5: {
                String names = "";
                int grade = 0;
                double semaster1 = 0, semaster2 = 0;
                double avg = 0;
                int count1 = 0, count2 = 0, count3 = 0, count4 = 0;
                double sumAvarage1 = 0, sumAvarage2 = 0, sumAvarage3 = 0;
                try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("src/task6/tongketnamhoc.txt")))) {
                    while (true) {
                        names = in.readUTF();
                        grade = in.readInt();
                        semaster1 = in.readDouble();
                        semaster2 = in.readDouble();
                        avg = (semaster1 + semaster2 * 2) / 3;
                        DecimalFormat df = new DecimalFormat("###.##");
                        avg = Double.parseDouble(df.format(avg));
                        if (grade == 10) {
                           count1 ++;
                           sumAvarage1 +=avg;
                        }
                        if (grade == 11) {
                           count2++;
                           sumAvarage2 +=avg;
                        }
                        if (grade == 12) {
                           count3++;
                           sumAvarage3 +=avg;
                        }
                    }
                } catch (EOFException | FileNotFoundException e) {
                    System.out.println("Error:" + e.getMessage());
                }
                
                System.out.println("Grade 10:==================");
                System.out.println("Quanlity:"+count1);
                System.out.println("Avarage:"+(sumAvarage1)/count1);
                System.out.println("Grade 11:==================");
                System.out.println("Quanlity:"+count2);
                System.out.println("Avarage:"+(sumAvarage2)/count2);
                System.out.println("Grade 12:==================");
                System.out.println("Quanlity:"+count3);
                System.out.println("Avarage:"+(sumAvarage3)/count3);
                
                break;
            }
        }

    }
    // calculate mark Avarage
    public static double calAvage(double mark1, double mark2) {
        return (mark1 + mark2) / 2;
    }

}
