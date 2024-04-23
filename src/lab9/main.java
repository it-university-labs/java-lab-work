package lab9;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        ArrayList<CycleThread> threads = new ArrayList<>();

        threads.add(new CycleThread(10));
        threads.add(new CycleThread(20));
        threads.add(new CycleThread(30));
        threads.add(new CycleThread(40));
        threads.add(new CycleThread(50));
        threads.add(new CycleThread(60));
        threads.add(new CycleThread(70));
        threads.add(new CycleThread(80));
        threads.add(new CycleThread(90));
        threads.add(new CycleThread(100));

        for(CycleThread thread : threads) {
            thread.start();
        }
    }
}
