
package task5_2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nguyen Van Nhut
 * Day 13/09/2016
 * Version 1
 * Main class
 */
public class SumMain {

    public static void main(String[] args) throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = input.nextInt();
        int []arr = new int[n];
        Random random = new Random();
        for(int i = 0; i< n; i++)
        {
            arr[i] = random.nextInt(10);
        }
        System.out.println("input num of Thread");
        int numThreads = input.nextInt();
        int sums = Sum(arr,numThreads);
        String strArr = "";
        for(int value: arr)
        {
            strArr += value + " ";
            
        }
        System.out.println("Array: "+strArr);
        System.out.println("Sum: "+sums);
    }
    public static int Sum(int [] arr, int numThreads) throws InterruptedException
    {
        int len = arr.length;
        int sum = 0;
        // Create and start numThread;
        SumThread [] ts = new SumThread[numThreads];
        for(int i =0; i< numThreads; i++)
        {
            ts[i] = new SumThread((i*len)/numThreads,((i + 1)*len /numThreads),arr);
            ts[i].start();
        }
        // waiting for the threads to finish and sum their results
        for(int i = 0; i< numThreads; i++)
        {
            ts[i].join();
            sum += ts[i].getSum();
        }
        return sum;
    }
    
}
