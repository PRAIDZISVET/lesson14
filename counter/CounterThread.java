package by.itacademy.lesson14.counter;

public class CounterThread extends Thread {

    private Counter counter;

    public CounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run () {
        for (int i = 0; i < 100; i++) {
            counter.increment();
        }
    }
}
