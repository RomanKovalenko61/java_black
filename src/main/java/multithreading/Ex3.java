package multithreading;

public class Ex3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Thread myRunnable = new Thread(new Ex3());
        myRunnable.start();

        for (int i = 1000; i > 0; i--) {
            System.out.println(i);
        }

//        Thread thread1 = new Thread(new MyThread3());
//        Thread thread2 = new Thread(new MyThread4());
//        thread1.start();
//        thread2.start();
    }
}

//class MyThread3 implements Runnable {
//    public void run() {
//        for (int i = 0; i < 1000; i++) {
//            System.out.println(i);
//        }
//    }
//}
//
//class MyThread4 implements Runnable {
//    public void run() {
//        for (int i = 1000; i > 0; i--) {
//            System.out.println(i);
//        }
//    }
//}