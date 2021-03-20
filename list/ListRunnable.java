package by.itacademy.lesson14.list;

import java.util.List;

public class ListRunnable implements Runnable {

    private final List<Integer> list;

    public ListRunnable(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            synchronized (list) {
                list.add(1);
            }
        }
    }
}
