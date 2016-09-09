package task3.pkg4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nguyen Van Nhut 
 * Day 9/09/2016 
 * Version 1 
 * class for creating Main class to calculate 2 number input number 1, number 2
 */
public class CalculationMain {

    public static void main(String[] args) throws IOException {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter number 1: ");
            int a = Integer.parseInt(input.readLine());
            System.out.println("Enter number 2: ");
            int b = Integer.parseInt(input.readLine());
            IOperator op1 = (Integer operand1, Integer operand2) -> operand1 + operand2;
            int sum = op1.operate(a, b);
            System.out.println("Plus: a + b = " + sum);
            IOperator op2 = (Integer operand1, Integer operand2) -> operand1 - operand2;
            int minus = op2.operate(a, b);
            System.out.println("Minus: a - b = " + minus);
            IOperator op3 = (Integer operand1, Integer operand2) -> operand1 * operand2;
            int multi = op3.operate(a, b);
            System.out.println("multiplication: a * b = " + sum);
            IOperator op4 = (Integer operand1, Integer operand2) -> operand1 / operand2;
            double divide = (double) op4.operate(a, b);
            System.out.println("Divide: a / b = " + divide);
        } catch (NumberFormatException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }
}
