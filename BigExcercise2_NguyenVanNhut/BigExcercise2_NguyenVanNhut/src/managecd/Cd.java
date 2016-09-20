
package managecd;
import java.io.Serializable;

/**
 *
 * @author Nguyen Van Nhut
 * Date 19/09/2016
 * Version : BigExcercise 2
 * class for building Cd class 
 * 
 */
public class Cd  implements Serializable{
    int id;
    String name;
    String singer;
    int amount;
    double price;

    public Cd(String name, String singer, int amount, double price) {
        this.name = name;
        this.singer = singer;
        this.amount = amount;
        this.price = price;
    }

    public Cd() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    // show cd information 
    @Override
    public String toString() {
       return "id: "+id +" - "+"name: "+name+" - "+"singer: "+singer+" - "+amount+" - "+price;
    }
    
}
