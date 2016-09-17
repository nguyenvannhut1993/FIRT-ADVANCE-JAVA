
package task7.pkg2;

/**
 *
 * @author Nguyen Van Nhut
 * Day 15/09/2016
 * Version 1
 * class for creating employment
 */
public class Employment {
   String idStaff;
   String name;
   String sex;
   String dayOfBirth;
   double salary;
   String address;
   String idUint;

    public Employment(String idStaff, String name, String sex, String dayOfBirth, double salary, String address, String idUint) {
        this.idStaff = idStaff;
        this.name = name;
        this.sex = sex;
        this.dayOfBirth = dayOfBirth;
        this.salary = salary;
        this.address = address;
        this.idUint = idUint;
    }

    public Employment() {
    }
   
    public String getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(String idStaff) {
        this.idStaff = idStaff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(String dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getIdUint() {
        return idUint;
    }

    public void setIdUint(String idUint) {
        this.idUint = idUint;
    }

    @Override
    public String toString() {
        return "ID staff:"+idStaff+" -- "+"name:"+name+" -- "+"sex:"+sex+" -- "+"day of birth:"+dayOfBirth+" -- "+
                "salary:"+salary+" -- "+"Address:"+address+" -- "+"ID unit:"+this.idUint;
    }
   
    
}
