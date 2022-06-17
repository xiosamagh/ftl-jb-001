package com.tasks.T030;

public class Task30 {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnableImp());
        System.out.println(thread.getState());  // NEW

        thread.start();

        System.out.println(thread.getState());  // RUNNABLE
        thread.join();
        System.out.println("---");
        System.out.println(thread.getState());  // TERMINATED



    }
}

class MyRunnableImp implements Runnable{

    @Override
    public void run() {
        System.out.println("Hello Java!");
    }
}
