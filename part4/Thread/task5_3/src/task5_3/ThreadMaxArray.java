
package task5_3;

/**
 *
 * @author Nguyen Van Nhut
 * Day 13/09/2016
 * Version 1
 * class thread
 */
public class ThreadMaxArray extends Thread{
    private int lo,hi;
    private int [] arr;
    private int max = 0;
    public ThreadMaxArray (int lo, int hi, int [] arr)
    {
        this.lo = lo;
        this.hi = hi;
        this.arr = arr;
    }
    @Override
    public void run()
    {
        for(int i = this.lo; i <this.hi; i++)
        {
            if(this.max < this.arr[i])
                this.max = this.arr[i];
        }
    }

    public int getLo() {
        return lo;
    }

    public void setLo(int lo) {
        this.lo = lo;
    }

    public int getHi() {
        return hi;
    }

    public void setHi(int hi) {
        this.hi = hi;
    }

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int sum) {
        this.max = sum;
    }
    
}
