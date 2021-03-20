package by.itacademy.lesson14.counter;

public class CounterDecrementThread extends Thread {

    private Counter counter;

    public CounterDecrementThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            counter.decrement();
        }
    }
}
