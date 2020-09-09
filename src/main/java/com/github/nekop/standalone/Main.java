package com.github.nekop.standalone;

public class Main {
    private static final long EXIT_TIMEOUT_MILLIS = 30000;
    public static void main(String[] args) throws Exception {
        long start = System.currentTimeMillis();
        int i = 0;
        while (true) {
            new Thread(() -> {
                    try {
                        Thread.sleep(Integer.MAX_VALUE);
                    } catch (Exception ignore) { }
            }).start();
            System.out.println("Thread started #" + i);
            i++;
            if (System.currentTimeMillis() - start > EXIT_TIMEOUT_MILLIS) {
                System.exit(0);
            }
        }
    }
    
}
