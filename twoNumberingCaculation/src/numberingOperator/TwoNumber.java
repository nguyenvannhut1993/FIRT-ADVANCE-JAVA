/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numberingOperator;

/**
 *
 * @author Nguyen Van Nhut
 * version 1
 * input:firstNumber,secondNumber;
 */
public class TwoNumber {

    // initial fields 
    int firstNumber;
    int secondNumber;

    // contructing defult
    public TwoNumber() {
    }

    // contructor
    public TwoNumber(int firstNumber, int secondNumber) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    // get value 1

    public int getFirstNumber() {
        return firstNumber;
    }

    // set value 1
    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }
    // get value 2
    public int getSecondNumber() {
        return secondNumber;
    }
    // set value 2
    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }
    
}
