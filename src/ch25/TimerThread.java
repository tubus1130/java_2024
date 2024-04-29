package ch25;

import java.util.Date;

public class TimerThread extends Thread{
    public void run(){
        printCurrentTime();
    }
    public void printCurrentTime(){

        try{
            for(int loop=0; loop<10; loop++){
                Date date = new Date();
                System.out.println(date.toString() + " " + System.currentTimeMillis());
                Thread.sleep(1000);
            }
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
