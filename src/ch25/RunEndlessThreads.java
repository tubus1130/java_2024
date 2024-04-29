package ch25;

public class RunEndlessThreads {
    public static void main(String[] args) {
        RunEndlessThreads sample = new RunEndlessThreads();
        sample.endless();
    }
    public void endless(){
        EndlessThread thread = new EndlessThread();
        thread.start();
    }
}
/*
1714392500156
1714392501156
1714392502157
1714392503157
1714392504157
1714392505158
1714392506158
1714392507159
1714392508159
1714392509160
1714392510161
1714392511161
 */