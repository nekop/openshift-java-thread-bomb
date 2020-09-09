package com.github.nekop.standalone;

public class Main {
    public static void main(String[] args) throws Exception {
        // This main method will exit with OutOfMemoryError and the process remains forever with a lot of sleeping threads
        int i = 0;
        while (true) {
            new Thread(() -> {
                    try {
                        Thread.sleep(Integer.MAX_VALUE);
                    } catch (Exception ignore) { }
            }).start();
            System.out.println("Thread started #" + i);
            i++;
        }
    }
    
}
