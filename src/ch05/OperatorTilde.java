package ch05;

public class OperatorTilde {
    public static void main(String[] args) {
        OperatorTilde operator = new OperatorTilde();
        byte b = 127;
        operator.printTildeResult(b);
        b = 1;
        operator.printTildeResult(b);
    }
    public void printTildeResult(byte b){
        System.out.println("Original value = " + b);
        System.out.println("Tilde value = " + ~b);
    }
}
