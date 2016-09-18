
package task8.pkg4;

/**
 *
 * @author Nguyen Van Nhut
 * Day 17/09/2016
 * Version 1
 * Class for building Category class
 */
public class Category {
    int idCa;
    String nameCa;
    String description;

    public Category() {
    }

    public Category(String nameCa, String description) {
        //this.idCa = idCa;
        this.nameCa = nameCa;
        this.description = description;
    }

    public int getIdCa() {
        return idCa;
    }

    public void setIdCa(int idCa) {
        this.idCa = idCa;
    }

    public String getNameCa() {
        return nameCa;
    }

    public void setNameCa(String nameCa) {
        this.nameCa = nameCa;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return idCa +" - "+nameCa +" - "+description;
    }
    
}
