package ch25;

public class RunSync {
    public static void main(String[] args) {
        RunSync runSync = new RunSync();
        for(int loop = 0; loop<5; loop++){
            runSync.runCommonCalculate();
        }
    }
    public void runCommonCalculate(){
        CommonCalculate calc = new CommonCalculate();
        ModifyAmountThread thread1 = new ModifyAmountThread(calc, true);
        ModifyAmountThread thread2 = new ModifyAmountThread(calc, true);

        thread1.start();
        thread2.start();
        try{
            thread1.join();
            thread2.join();
            System.out.println("Final value is " + calc.getAmount());
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
/*
Final value is 15341
Final value is 16747
Final value is 16567
Final value is 16803
Final value is 19647


Final value is 20000
Final value is 20000
Final value is 20000
Final value is 20000
Final value is 20000

synchronized를 사용하면 여러쓰레드가 동시에 접근이 불가능하고 순차적으로 처리된다.
 */