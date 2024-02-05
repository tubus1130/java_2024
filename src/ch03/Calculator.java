package ch03;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Calculator class started");
        Calculator calc = new Calculator();
        int a = 10;
        int b = 5;
        System.out.println("add = " + calc.add(a,b));
        System.out.println("subtract = " + calc.subtract(a,b));
        System.out.println("multiply = " + calc.multiply(a,b));
        System.out.println("divide = " + calc.divide(a,b));
    }
    public int add(int num1, int num2){
        return num1 + num2;
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
