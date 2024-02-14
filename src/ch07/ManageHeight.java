package ch07;

public class ManageHeight {
    static int [] gradeHeights[];
    public void setData(){
        gradeHeights = new int[5][];
        gradeHeights[0] = new int[]{170, 180, 173, 175, 177};
        gradeHeights[1] = new int[]{160, 165, 167, 186};
        gradeHeights[2] = new int[]{158, 177, 187, 176};
        gradeHeights[3] = new int[]{173, 182, 181};
        gradeHeights[4] = new int[]{170, 180, 165, 177, 172};
    }
    public void printHeight(int classNo){
        for(int i=0; i<gradeHeights[classNo-1].length; i++){
            System.out.println(gradeHeights[classNo-1][i]);
        }
    }
    public void printAverage(int classNo){
        double sum = 0;
        for(int i=0; i<gradeHeights[classNo-1].length; i++){
            sum += gradeHeights[classNo-1][i];
        }
        double average = sum / gradeHeights[classNo-1].length;
        System.out.println("Height average:" + average);
    }
    public static void main(String[] args) {
        ManageHeight manage = new ManageHeight();
        manage.setData();
        for(int i=1; i<=5; i++){
            System.out.println("Class No.:" + i);
//            manage.printHeight(i);
            manage.printAverage(i);
        }
    }
}
