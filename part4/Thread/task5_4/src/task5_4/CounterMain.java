package task5_4;

/**
 *
 * @author Nguyen Van Nhut 
 * Day 13/09/2016 
 * Version 1 
 * Main class
 */
public class CounterMain {

    public static void main(String[] args) {
        Counter c = new Counter();
        ThreadCounter one = new ThreadCounter(c);
        ThreadCounter two = new ThreadCounter(c);
        ThreadCounter three = new ThreadCounter(c);
        ThreadCounter four = new ThreadCounter(c);
        ThreadCounter five = new ThreadCounter(c);
        ThreadCounter six = new ThreadCounter(c);
        ThreadCounter seven = new ThreadCounter(c);
        ThreadCounter enght = new ThreadCounter(c);
        ThreadCounter night = new ThreadCounter(c);
        ThreadCounter ten = new ThreadCounter(c);
        one.start();
        two.start();
        three.start();
        four.start();
        five.start();
        six.start();
        seven.start();
        enght.start();
        night.start();
        ten.start();

    }

}
