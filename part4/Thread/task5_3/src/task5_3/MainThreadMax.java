
package task5_3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Nguyen Van Nhut
 * Day 13/09/2016
 * Version 1
 * Main class
 */
public class MainThreadMax {
    public static void main(String[] args) throws InterruptedException {
         Scanner input = new Scanner(System.in);
        System.out.println("Input n: ");
        int n = input.nextInt();
        int []arr = new int[n];
        Random random = new Random();
        for(int i = 0; i< n; i++)
        {
            arr[i] = random.nextInt(100);
        }
        System.out.println("input num of Thread");
        int numThreads = input.nextInt();
        int sums = Max(arr,numThreads);
        String strArr = "";
        for(int value: arr)
        {
            strArr += value + " ";
            
        }
        System.out.println("Array: "+strArr);
        System.out.println("Max: "+sums);
    }
    public static int Max(int [] arr, int numThreads) throws InterruptedException
    {
        int len = arr.length;
        int max = 0;
        // Create and start numThread;
        ThreadMaxArray [] ts = new ThreadMaxArray[numThreads];
        for(int i =0; i< numThreads; i++)
        {
            ts[i] = new ThreadMaxArray((i*len)/numThreads,((i + 1)*len /numThreads),arr);
            ts[i].start();
        }
        // waiting for the threads to finish and sum their results
        for(int i = 0; i< numThreads; i++)
        {
            
            ts[i].join();
            if(max < ts[i].getMax())
                max = ts[i].getMax();
        }
        return max;
    }
    
}
