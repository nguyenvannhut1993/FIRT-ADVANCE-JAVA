
package task7.pkg2;

/**
 *
 * @author Nguyen Van Nhut
 * Day 15/09/2016
 * Version 1
 * class for creating unit
 */
public class Department {
    String idLap;
    String nameLap;

    public Department(String idLap, String nameLap) {
        this.idLap = idLap;
        this.nameLap = nameLap;
    }

    public Department() {
    }

    public String getIdLap() {
        return idLap;
    }

    public void setIdLap(String idLap) {
        this.idLap = idLap;
    }

    public String getNameLap() {
        return nameLap;
    }

    public void setNameLap(String nameLap) {
        this.nameLap = nameLap;
    }

    @Override
    public String toString() {
        return "Id Unit:"+idLap +" -- "+"name unit:"+nameLap;
    }
    
   
    
}
