package ro.mta.facc.selab;

import java.util.Random;

public class MyThread extends Thread{

    @Override
    public void run() {
        Random generator = new Random();
        int timeToSleep = 10 + generator.nextInt(10);

        try {
            Thread.sleep(timeToSleep * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(generator.nextInt());
    }
}
