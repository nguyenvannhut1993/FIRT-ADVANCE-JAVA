package ProcessingString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author Nguyen Van Nhut
 * Day 19/09/2016
 * Version 1
 * Class for processing Main
 */
public class ProcessorString {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        List<String> list = new ArrayList<String>();
        ArrangementString arr = new ArrangementString();
        System.out.println("List default");
        System.out.println("===============================");
        arr.StringDefault(list);
        System.out.println("===============================");
        String yn = "";
        do {
            // select to choice a tasks
            System.out.println("1: Arrange String increase lengh string\n2: Arrange String decrease lengh string \n3: Arrange Alphabet\n4: Exit");
            int choice = Integer.parseInt(input.readLine());
            switch (choice) {
                // arrange short to long
                case 1: { 
                    System.out.println("Short to Long sentense");
                    System.out.println("=========================");
                    arr.arrageStringShortToLongest(list);
                    break;
                }
                // arrange long to short
                case 2: {
                    System.out.println("Long to short sentense");
                    System.out.println("=========================");
                    arr.arrageStringLongestToShortter(list);
                    break;
                }
                // arrange alphabet
                case 3: {
                    System.out.println("Arrange Alphabet");
                    System.out.println("=========================");
                    arr.arrageStringAlphabet(list);
                    break;
                }
                case 4:
                    break;
                default:
                    System.out.println("Please choice correctly");
            }
            System.out.println("Do you want to do?[y/n]");
            yn = input.readLine();
        } while (yn.equalsIgnoreCase("y"));
    }

}
