package ch06;

public class ControlLabel {
    public static void main(String[] args) {
        ControlLabel control = new ControlLabel();
        control.printTimesTable();
    }
    public void printTimesTable(){
        for(int i=2; i<10; i++){
            for(int j=1; j<10; j++){
                if(i == 4 || j == 4){
                    continue;
                }
                System.out.println(i + " * " + j + " = " + i*j);
            }
            System.out.println();
        }
    }
}
