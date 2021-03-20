package by.itacademy.lesson14.counter;

public class CounterDecrementDemo {
    public static void main(String[] args) {

        Counter counter = new Counter();
        Thread firstThread = new CounterThread(counter);
        Thread first1Thread = new CounterThread(counter);
        Thread first2Thread = new CounterThread(counter);
        Thread secondThread = new CounterDecrementThread(counter);
        Thread third1Thread = new CounterDecrementThread(counter);
        Thread third2Thread = new CounterDecrementThread(counter);

        firstThread.start();
        first1Thread.start();
        first2Thread.start();
        secondThread.start();
        third1Thread.start();
        third2Thread.start();

        try {
            firstThread.join();
            first1Thread.join();
            first2Thread.join();
            secondThread.join();
            third1Thread.join();
            third2Thread.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(firstThread.getState());
        System.out.println(secondThread.getState());
        System.out.println(counter.getCount());

    }
}
