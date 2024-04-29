package ch25;

public class RunGroupThreads {
    public static void main(String[] args) {
        RunGroupThreads sample = new RunGroupThreads();
        sample.groupThread();
    }
    public void groupThread(){
        try{
            SleepThread sleep1 = new SleepThread(5000);
            SleepThread sleep2 = new SleepThread(5000);

            ThreadGroup group = new ThreadGroup("Group1");
            Thread thread1 = new Thread(group, sleep1);
            Thread thread2 = new Thread(group, sleep2);

            thread1.start();
            thread2.start();
            Thread.sleep(1000);
            System.out.println("Group name = " + group.getName());
            int activeCount = group.activeCount();
            System.out.println("Active count = " + activeCount);
            group.list();

            Thread[] tempThreadList = new Thread[activeCount];
            int result = group.enumerate(tempThreadList);
            System.out.println("Enumerate result = " + result);
            for(Thread thread : tempThreadList){
                System.out.println(thread);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
/*
Sleeping Thread-1
Sleeping Thread-0
Group name = Group1
Active count = 2
java.lang.ThreadGroup[name=Group1,maxpri=10]
    Thread[Thread-2,5,Group1]
    Thread[Thread-3,5,Group1]
Enumerate result = 2
Thread[Thread-2,5,Group1]
Thread[Thread-3,5,Group1]
Stopping Thread-1
Stopping Thread-0
 */