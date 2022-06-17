package com.tasks.T031;

public class Task31 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnableImp());
        Thread thread2 = new Thread(new MyRunnableImp());

        thread1.start();
        thread2.start();

        
    }
}

class MyRunnableImp implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}


