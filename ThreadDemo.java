package by.itacademy.lesson14;

public class ThreadDemo {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());

        Thread customThread = new CustomThread();
        customThread.setName("My first thread");
        System.out.println(customThread.getState());
        customThread.start();
        System.out.println(customThread.getState());

//        Thread runnableThread = new Thread (new RunnableThread());
//        runnableThread.start();
    }


}
