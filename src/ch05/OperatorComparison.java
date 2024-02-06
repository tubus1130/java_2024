package ch05;

public class OperatorComparison {
    public static void main(String[] args) {
        OperatorComparison operator = new OperatorComparison();
        operator.comparison();
        operator.comparison2();
        operator.comparison3();
    }
    public void comparison(){
        int intValue1 = 1;
        int intValue2 = 2;
        int intValue3 = 1;
        System.out.println(intValue1 == intValue2);
        System.out.println(intValue1 == intValue3);

        System.out.println(intValue1 != intValue2);
        System.out.println(intValue1 != intValue3);
    }
    public void comparison2(){
        char charValue = 'a';
        System.out.println(97 == charValue);
        int intValue = 1;
        double doubleValue = 1.0;
        System.out.println(intValue == doubleValue);
    }
    public void comparison3(){
        boolean boolValue = true;
        System.out.println(boolValue == true);
        System.out.println(boolValue != true);
    }
}
