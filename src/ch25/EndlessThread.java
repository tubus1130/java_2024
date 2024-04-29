package ch25;

public class EndlessThread extends Thread{
    public void run(){
        while(true){
            try{
                System.out.println(System.currentTimeMillis());
                Thread.sleep(1000);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
