package task6.pkg1;

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
import java.nio.Buffer;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Nguyen Van Nhut
 * Day 14/09/2016
 * Version 1
 * 
 */
public class MemoryMain {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("1: read content txt \n2: write content txt");
        System.out.println("choose 1 or 2");
        int choose = Integer.parseInt(input.readLine());
        switch (choose) {
            case 1: {
                readContent();
                break;
            }
            case 2: {
                writeContent();
                System.out.println("you have want read content:[y/n]");
                String yn = input.readLine();
                if (yn.equalsIgnoreCase("y")) {
                    readContent();
                } else {
                    break;
                }
                break;
            }
            default:
                break;
        }

    }
    // Read function 
    public static void readContent() {
        String daily = "";
        String date = "";
        String content = "";
        try (DataInputStream in = new DataInputStream(new BufferedInputStream(new FileInputStream("src/task6/daily.txt")))) {
            while (true) {
                date = in.readUTF();
                content = in.readUTF();
                daily += date + "\n" + content + "\n\n";
            }
        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        }
        System.out.println(daily);

    }
    // write function
    public static void writeContent() throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        DateFormat d = new SimpleDateFormat("dd/MM/yy");
        Date da = new Date();
        String date = d.format(da);
        System.out.println("Enter content that you want add:");
        String content = input.readLine();
        try (DataOutputStream out = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("src/task6/daily.txt", true)))) {
            out.writeUTF(date);
            out.writeUTF(content);
            System.out.println("daily was wrote");
        } catch (FileNotFoundException e) {
            System.out.println("Error:" + e.getMessage());
        }

    }
}
