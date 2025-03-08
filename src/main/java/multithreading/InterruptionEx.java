package multithreading;

import org.w3c.dom.ls.LSOutput;

import java.security.spec.RSAOtherPrimeInfo;

public class InterruptionEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");
        InterruptedThread thread = new InterruptedThread();
        thread.start();
        Thread.sleep(2000);
        thread.interrupt();

        thread.join();
        System.out.println("Main ends");
    }
}

class InterruptedThread extends Thread {
    double sqrtSum = 0;

    public void run() {
        for (int i = 0; i < 1_000_000_000; i++) {
            if (isInterrupted()) {
                System.out.println("Поток хотят прервать");
                System.out.println("Убедились что состояние объектов нормальное и завершаем работу потока");
                System.out.println(sqrtSum);
                return;
            }
            sqrtSum += Math.sqrt(i);
            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("Поток хотят прервать во время сна. Давайте завершим его работу");
                System.out.println(sqrtSum);
                return;
            }
        }
        System.out.println(sqrtSum);
    }
}