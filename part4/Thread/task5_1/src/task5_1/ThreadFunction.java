
package task5_1;

/**
 *
 * @author Nguyen Van Nhut
 * Day 13/09/2016
 * Version 1
 * class creating thread
 */
public class ThreadFunction extends Thread{
    private Thread t;
    private String threadName;
    // creating thread
    ThreadFunction(String name)
    {
        threadName = name;
        System.out.println("Creating: "+ threadName);
    }
    // run function
    @Override
    public void run(){
        System.out.println("Running "+ threadName);
        try
        {
            for(int i = 3; i > 0; i--)
            {
                System.out.println("Thread: "+threadName + ", "+ i);
                // Let the thread sleep for a while.
                Thread.sleep(50);
            }
        }
            catch(InterruptedException e){
                    System.out.println("Thread " + threadName + "interrupted.");
                    }
        System.out.println("Thread " + threadName + " exiting");
    }
    // start function
    @Override
    public void start()
    {
        System.out.println("Starting " +threadName);
        if(t==null)
        {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}
