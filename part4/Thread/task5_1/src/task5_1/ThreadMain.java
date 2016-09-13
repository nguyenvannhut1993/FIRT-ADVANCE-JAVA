
package task5_1;

/**
 *
 * @author Nguyen Van Nhut
 * Day 13/09/2016
 * Version 1
 * Main class 
 */
public class ThreadMain {

    public static void main(String[] args) {
        ThreadFunction T1 = new ThreadFunction("Google");
        T1.start();
        ThreadFunction T2 = new ThreadFunction("Yahoo");
        T2.start();
        ThreadFunction T3 = new ThreadFunction("Facebook");
        T3.start();
        
        
    }
    
}
