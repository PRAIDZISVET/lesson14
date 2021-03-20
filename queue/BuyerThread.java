package by.itacademy.lesson14.queue;

import java.util.Queue;

public class BuyerThread extends Thread {
    private Queue<Object> cashDesk;

    public BuyerThread(Queue<Object> cashDesk) {
        this.cashDesk = cashDesk;
    }

    @Override
    public void run() {
        Object currentCashDesk = null;
        while (true) {
            synchronized (cashDesk) {
                if (cashDesk.size() > 0) {
                    System.out.println(getName() + "подошел к кассе");
                    currentCashDesk = cashDesk.poll();
                    break;
                }
            }
            try {
                System.out.println(getName() + "ожидает");
                Thread.sleep(700L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println(getName() + "обслуживается в кассе");
        try {
            Thread.sleep(1500L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (cashDesk) {
            cashDesk.add(currentCashDesk);
            System.out.println(getName() + "покидает магазин");
        }
    }

}
