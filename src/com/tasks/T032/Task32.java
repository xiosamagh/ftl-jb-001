package com.tasks.T032;

public class Task32 {
    public static void main(String[] args) {
        Buffer buffer = new Buffer();
        Consumer consumer = new Consumer(buffer);
        Producer producer = new Producer(buffer);

        Thread thread1 = new Thread(producer);
        Thread thread2 = new Thread(consumer);

        thread1.start();
        thread2.start();
    }
}

class Buffer {
    private int count = 0;

    public synchronized void getCount() {
        while (count < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count--;
        System.out.println("Потребитель забрал одно число!");
        System.out.println("Количество чисел: " + count);
        notify();

    }

    public synchronized void putCount() {
        while (count >= 5) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        count++;
        System.out.println("Производитель добавил 1 число!");
        System.out.println("Количество чисел: " + count);
        notify();

    }


}

class Producer implements Runnable {
    Buffer buffer;
    Producer(Buffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        for (int i = 0; i<10; i++) {
            buffer.putCount();
        }
    }
}

class Consumer implements Runnable {
    Buffer buffer;
    Consumer(Buffer buffer) {
        this.buffer = buffer;
    }
    @Override
    public void run() {
        for (int i = 0; i<10; i++) {
            buffer.getCount();
        }
    }
}
