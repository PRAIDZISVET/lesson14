package by.itacademy.lesson14.queue;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Object> cashDesks = new LinkedList<>();
        cashDesks.add(new Object());
        cashDesks.add(new Object());

        List<BuyerThread> buyerThreads = Arrays.asList(
                new BuyerThread(cashDesks),
                new BuyerThread(cashDesks),
                new BuyerThread(cashDesks),
                new BuyerThread(cashDesks),
                new BuyerThread(cashDesks),
                new BuyerThread(cashDesks),
                new BuyerThread(cashDesks),
                new BuyerThread(cashDesks),
                new BuyerThread(cashDesks),
                new BuyerThread(cashDesks)
        );

        buyerThreads.forEach(Thread::start);

        for (BuyerThread buyerThread : buyerThreads) {
            try {
                buyerThread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
