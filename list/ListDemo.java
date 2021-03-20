package by.itacademy.lesson14.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<Integer> list = Collections.synchronizedList(new ArrayList<>());
        Thread firstThread = new Thread(new ListRunnable(list));
        firstThread.setName("NINGIA");
        Thread secondThread = new Thread(new ListRunnable(list));

        firstThread.start();
        secondThread.start();

        secondThread.interrupt();

        try {
            firstThread.join();
            secondThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Размер списка: " + list.size());

    }
}
