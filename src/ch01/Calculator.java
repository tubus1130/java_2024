package ch01;

public class Calculator {
    public int sum(int num1, int num2){
        int sum;
        sum = num1 + num2;
        return sum;
    }

    public int subtract(int num1, int num2){
        return num1 - num2;
    }

    public int multiply(int num1, int num2){
        return num1 * num2;
    }

    public int divide(int num1, int num2){
        return num1 / num2;
    }
}
