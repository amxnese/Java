public class App {
    public static void main(String[] args) {
        MyThread myThread1 = new MyThread();
        MyThread myThread2 = new MyThread();
        myThread1.start();
        myThread2.start();

        MyRunnableThread myRunnable1 = new MyRunnableThread();
        MyRunnableThread myRunnable2 = new MyRunnableThread();
        Thread myThread3 = new Thread(myRunnable1);
        Thread myThread4 = new Thread(myRunnable2);
        myThread3.start();
        myThread4.start();

    }
}
