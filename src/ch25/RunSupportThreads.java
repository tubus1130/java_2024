package ch25;

public class RunSupportThreads {
    public static void main(String[] args) {
        RunSupportThreads sample = new RunSupportThreads();
        sample.checkThreadState1();
        sample.checkJoin();
    }
    public void checkThreadState1(){
        SleepThread thread = new SleepThread(2000);
        try{
            System.out.println("thread state = " + thread.getState());
            thread.start();
            System.out.println("thread state(after start) = " + thread.getState());

            Thread.sleep(1000);
            System.out.println("thread state(after 1 sec) = " + thread.getState());

            thread.join();
            thread.interrupt();
            System.out.println("thread state(after join) = " + thread.getState());

        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
    public void checkJoin(){
        SleepThread thread = new SleepThread(2000);
        try{
            thread.start();
            thread.join(500);
            thread.interrupt();
            System.out.println("thread state(after join) = " + thread.getState());
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
/*
thread state = NEW
thread state(after start) = RUNNABLE
Sleeping Thread-0
thread state(after 1 sec) = TIMED_WAITING
Stopping Thread-0
thread state(after join) = TERMINATED

java.lang.InterruptedException: sleep interrupted
	at java.lang.Thread.sleep(Native Method)
	at ch25.SleepThread.run(SleepThread.java:11)
 */
