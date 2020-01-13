package com.mycompany.thread.examples;

public class ThreadEntity extends Thread {

    @Override
    public void run() {
        System.out.println("Inside : " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());

        System.out.println("Creating thread...");
        Thread thread = new ThreadEntity();

        System.out.println("Starting thread...");
        thread.start();
    }
}
