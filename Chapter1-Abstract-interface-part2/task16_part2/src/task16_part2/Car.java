/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task16_part2;

/**
 *
 * @author Nguyen Van Nhut
 */
public class Car extends Transport implements InterfaceSpeed, FuelConsumption {

    String gear;
    String typeCar;

    public Car(String gear, String typeCar) {
        this.gear = gear;
        this.typeCar = typeCar;
    }

    public Car() {
    }

    public String getGear() {
        return gear;
    }

    public void setGear(String gear) {
        this.gear = gear;
    }

    public String getTypeCar() {
        return typeCar;
    }

    public void setTypeCar(String typeCar) {
        this.typeCar = typeCar;
    }

    public String getLicenseID() {
        return LicenseID;
    }

    public void setLicenseID(String LicenseID) {
        this.LicenseID = LicenseID;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String Owner) {
        this.Owner = Owner;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getManfacturer() {
        return Manfacturer;
    }

    public void setManfacturer(String Manfacturer) {
        this.Manfacturer = Manfacturer;
    }

    @Override
    public double getSpeed(double distance, double times) {
        return (distance / times);
    }

    @Override
    public double fuelConsum(double distance, double numberLiter) {
        return (distance / numberLiter);
    }

    public String showInfoCar() {
        String s = " liceseID:" + LicenseID + " -- " + " owner:" + Owner + " -- " + " Color:" + Color + " -- "
                + " Manfacturer:" + Manfacturer + " -- " + "Gear:" + gear + " -- " + "Type car:" + typeCar;
        return s;
    }
}
