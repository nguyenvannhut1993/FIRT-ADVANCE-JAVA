
package task5_4;

/**
 *
 * @author Nguyen Van Nhut
 * Day 13/09/2016
 * Version 1
 * Class for creating thread counter
 */
public class ThreadCounter extends Thread{
    private Thread t;
    private Counter mycounter;
    // creating thread
    ThreadCounter(Counter mCounter)
    {
        mycounter = mCounter;
    }
    // run function
    @Override
    public void run(){
        try
        {
            for(int i = 0; i < 10; i++)
            {
                mycounter.increate();
                Thread.sleep(1000);
                System.out.println("count: "+mycounter.getCount());
            }
        }
            catch(InterruptedException e){
                    System.out.println("Thread interrupted.");
                    }
        //System.out.println("Thread " + threadName + " exiting");
    }
    // start function
    /*
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
    */
}
