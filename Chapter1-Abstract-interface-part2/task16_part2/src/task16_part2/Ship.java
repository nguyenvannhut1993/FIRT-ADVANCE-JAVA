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
public class Ship extends Transport implements InterfaceSpeed, FuelConsumption {

    double ponderosity;
    double capacity;
    double speedDown;
    double speedUp;
    double fuelCons;
    String typeFuel;

    public Ship(double ponderosity, double capacity, double speedDown, double speedUp, double fuelCons, String typeFuel) {
        this.ponderosity = ponderosity;
        this.capacity = capacity;
        this.speedDown = speedDown;
        this.speedUp = speedUp;
        this.fuelCons = fuelCons;
        this.typeFuel = typeFuel;
    }

    public Ship() {
    }

    public double getPonderosity() {
        return ponderosity;
    }

    public void setPonderosity(double ponderosity) {
        this.ponderosity = ponderosity;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getSpeedDown() {
        return speedDown;
    }

    public void setSpeedDown(double speedDown) {
        this.speedDown = speedDown;
    }

    public double getSpeedUp() {
        return speedUp;
    }

    public void setSpeedUp(double speedUp) {
        this.speedUp = speedUp;
    }

    public double getFuelCons() {
        return fuelCons;
    }

    public void setFuelCons(double fuelCons) {
        this.fuelCons = fuelCons;
    }

    public String getTypeFuel() {
        return typeFuel;
    }

    public void setTypeFuel(String typeFuel) {
        this.typeFuel = typeFuel;
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
        return ((distance / times) + speedUp - speedDown);
    }

    @Override
    public double fuelConsum(double distance, double numberLiter) {
        return (distance / numberLiter);
    }

    public String showInfoShip() {
        String s = " liceseID:" + LicenseID + " -- " + " owner:" + Owner + " -- " + " Color:" + Color + " -- "
                + " Manfacturer:" + Manfacturer + " -- " + "Capatcy:" + capacity + " -- " + "ponderosity:" + ponderosity;
        return s;
    }
}
