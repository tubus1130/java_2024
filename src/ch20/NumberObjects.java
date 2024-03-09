package ch20;

public class NumberObjects {
    public static void main(String[] args) {
        NumberObjects obj = new NumberObjects();
        obj.parseLong("3");
        obj.parseLong("r1024");
        obj.printOtherBase(1024);
    }
    public long parseLong(String data){
        long temp;
        try{
            temp = Long.parseLong(data);
            System.out.println(temp);

        }catch(NumberFormatException e){
            temp = -1;
            System.out.println(data + " is not a number");
        }
        return temp;
    }
    public void printOtherBase(long value){
        System.out.println("Original : " + value);
        System.out.println("Binary : " + Long.toBinaryString(value));
        System.out.println("Hex : " + Long.toHexString(value));
        System.out.println("Octal : " + Long.toOctalString(value));
    }
}
