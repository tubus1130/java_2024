package ch25;

public class RunObjectThreads {
    public static void main(String[] args) {
        RunObjectThreads sample = new RunObjectThreads();
        //sample.checkThreadState2();
        sample.checkThreadState3();
    }
    public void checkThreadState2(){
        Object monitor = new Object();
        StateThread thread = new StateThread(monitor);
        try{
            System.out.println("thread state = " + thread.getState());
            thread.start();
            System.out.println("thread state(after start) = " + thread.getState());

            Thread.sleep(100);
            System.out.println("thread state(after 0.1 sec) = " + thread.getState());

            synchronized (monitor){
                monitor.notify();
            }
            Thread.sleep(100);
            System.out.println("thread state(after notify) = " + thread.getState());

            thread.join();
            System.out.println("thread state(after join) = " + thread.getState());
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }
    public void checkThreadState3(){
        Object monitor = new Object();
        StateThread thread = new StateThread(monitor);
        StateThread thread2 = new StateThread(monitor);
        try{
            System.out.println("thread state = " + thread.getState());
            thread.start();
            thread2.start();
            System.out.println("thread state(after start) = " + thread.getState());

            Thread.sleep(100);
            System.out.println("thread state(after 0.1 sec) = " + thread.getState());

            synchronized (monitor){
                monitor.notifyAll();
            }
            Thread.sleep(100);
            System.out.println("thread state(after notify) = " + thread.getState());

            thread.join();
            System.out.println("thread state(after join) = " + thread.getState());
            thread2.join();
            System.out.println("thread2 state(after join) = " + thread2.getState());
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
    }
}
/*
thread state = NEW
thread state(after start) = RUNNABLE
thread state(after 0.1 sec) = WAITING
Thread-0 is notified
thread state(after notify) = TIMED_WAITING
thread state(after join) = TERMINATED
 */

/*
thread state = NEW
thread state(after start) = RUNNABLE
thread state(after 0.1 sec) = WAITING
Thread-1 is notified
Thread-0 is notified
thread state(after notify) = TIMED_WAITING
thread state(after join) = TERMINATED
thread2 state(after join) = TERMINATED
 */