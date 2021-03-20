package by.itacademy.lesson14.counter;

public class CounterDemo {
    public static void main(String[] args) {

        Counter counter = new Counter();
        Thread firstThread = new CounterThread(counter);
        Thread secondThread = new CounterThread(counter);
        Thread thirdThread = new CounterThread(counter);
        Thread forthThread = new CounterThread(counter);

        firstThread.start();
        secondThread.start();
        thirdThread.start();
        forthThread.start();

        try {
            firstThread.join();
            secondThread.join();
            thirdThread.join();
            forthThread.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(firstThread.getState());
        System.out.println(secondThread.getState());
        System.out.println(counter.getCount());

    }
}
