
package task2.pkg1;

/**
 *
 @author Nguyen Van Nhut
 * Day: 7/09/2016
 * Version:1
 * Class for creating class CD
 */
public class CD {
  String id;
  String name;
  String singer;
  double numOfSongs;
  double price;

    public CD(String id, String name, String singer, double numOfSongs, double price) {
        this.id = id;
        this.name = name;
        this.singer = singer;
        this.numOfSongs = numOfSongs;
        this.price = price;
    }

    public CD() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public double getNumOfSongs() {
        return numOfSongs;
    }

    public void setNumOfSongs(double numOfSongs) {
        this.numOfSongs = numOfSongs;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID cd:"+id+" -- "+"CD name:"+name+" -- "+"Singer:"+singer+" -- "+
                "NumberOfSong:"+numOfSongs+" -- "+"Price:"+price;
    }

   
}
