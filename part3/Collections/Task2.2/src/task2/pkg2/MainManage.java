package task2.pkg2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Nguyen Van Nhut
 * Day 07/09/2016
 * Version 1
 * class for creating main class
 */
public class MainManage {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Set<WordEnglish> set = new TreeSet<>();
        String yn = "";
        do {
            System.out.println(" 1:Watch all dectionary \n 2:add Word in dictionary\n 3: search word in distionary\n 4:delete word");
            int choice = Integer.parseInt(input.readLine());

            switch (choice) {
                case 1: {
                    printList(set);
                    break;
                }
                case 2: {
                    addWord(set);
                    printList(set);
                    break;
                }
                case 3: {
                    System.out.println("Enter word need searching:");
                    String w = input.readLine();
                    System.out.println("enter meaning:");
                    String me = input.readLine();
                    WordEnglish wo = new WordEnglish(w, me);
                    boolean a = searchWord(set, wo);
                    if (a == true) {
                        System.out.println("found");
                    } else {
                        System.out.println("not found");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Enter word need deleted:");
                    String w = input.readLine();
                    System.out.println("enter meaning:");
                    String me = input.readLine();
                    WordEnglish wo = new WordEnglish(w, me);
                    deleteWord(set, wo);
                    break;
                }
            }
            System.out.println("you continue:?[y/n]");
            yn = input.readLine();
        } while (yn.equalsIgnoreCase("y"));
    }
    // add word on in list
    public static void addWord(Set<WordEnglish> set) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter word:");
        String word = input.readLine();
        System.out.println("Enter meaning:");
        String mean = input.readLine();
        WordEnglish w = new WordEnglish(word, mean);
        set.add(w);
    }
    // show list
    public static void printList(Set<WordEnglish> set) {
        for (WordEnglish O : set) {

            System.out.println(O.toString());
        }
    }
    // function remove
    public static void deleteWord(Set<WordEnglish> set, WordEnglish w) {
        set.remove(w);
    }

    public static boolean searchWord(Set set, WordEnglish w) {
        boolean a = set.contains(w);
        return a;
    }

}
