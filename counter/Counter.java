package by.itacademy.lesson14.counter;

public class Counter {
    private final Object LOCK =new Object();
    public volatile int count;
    private boolean check;



    public void increment () {
        while (check) {
            //TO DO 20.05.2021
        }
        synchronized (LOCK) {
            this.count++;
            test();
        }
    }
    public void test () {
    synchronized (LOCK){

    }
    }
    public void decrement () {
        this.count--;
    }

    public int getCount() {
        return count;
    }
}
