/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task13_part1;

/**
 *
 * @author hv
 */
public class StaffSale extends Staff{
    double salarySale;
    double ratioSale;

    public StaffSale(double salarySale, double ratioSale, Names names, int numberName, double coefficientsSalary) {
        super(names, numberName, coefficientsSalary);
        this.salarySale = salarySale;
        this.ratioSale = ratioSale;
    }

    public StaffSale(double salarySale, double ratioSale) {
        this.salarySale = salarySale;
        this.ratioSale = ratioSale;
    }

    public StaffSale() {
    }

    public double getSalarySale() {
        return salarySale;
    }

    public void setSalarySale(double salarySale) {
        this.salarySale = salarySale;
    }

    public double getRatioSale() {
        return ratioSale;
    }

    public void setRatioSale(double ratioSale) {
        this.ratioSale = ratioSale;
    }
    public double calSalarySale ()
    {
        double L = salarySale *ratioSale;
        return L;
    }
    // show information
    public String showInfoSale(Salary T)
    {
        String s = "Name: "+names +" -- "+  "Number person based on: "+numberName+"\n"+
                "coefficientsSalary: "+coefficientsSalary+" -- "+"salarySale: "+salarySale+"\n"+
                "ratioSale: "+ratioSale +" -- "+ "natural salary is got: "+T.naturalSalatySale(this)+"\n"+
                "Salary: "+T.inComeSale(this) +"\n"
                +"tax salary: "+T.taxSalarySale(this)+" \n"+
                "Tax person: " + T.taxpersonSale(this)+" \n"
                +"Natural salary is got: "+ T.naturalSalatySale(this)+
                "\n-----------------------------------------------------";
        return s;
    }
}
