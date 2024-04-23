package lab9;
import java.util.ArrayList;

public class CycleThread extends Thread{
    private int delay;

    public CycleThread(int delay) {
        this.delay = delay;
    }

    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + i);
            try {
                Thread.sleep(delay);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


