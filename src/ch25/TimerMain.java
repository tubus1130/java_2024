package ch25;

public class TimerMain {
    public static void main(String[] args) {
        TimerThread thread = new TimerThread();
        thread.start();
    }
}

/*
Mon Apr 29 22:52:13 KST 2024 1714398733340
Mon Apr 29 22:52:14 KST 2024 1714398734340
Mon Apr 29 22:52:15 KST 2024 1714398735341
Mon Apr 29 22:52:16 KST 2024 1714398736341
Mon Apr 29 22:52:17 KST 2024 1714398737342
Mon Apr 29 22:52:18 KST 2024 1714398738343
Mon Apr 29 22:52:19 KST 2024 1714398739343
Mon Apr 29 22:52:20 KST 2024 1714398740344
Mon Apr 29 22:52:21 KST 2024 1714398741345
Mon Apr 29 22:52:22 KST 2024 1714398742345
 */