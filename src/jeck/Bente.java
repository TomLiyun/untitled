package jeck;


import java.util.Hashtable;

import java.util.concurrent.*;


public class Bente {
    public static void main(String[] args)throws InterruptedException {

        ConcurrentHashMap<String,Integer> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("Jeck",0);


        ExecutorService executorCompletionService = Executors.newFixedThreadPool(10);

        Runnable r = () -> {
            concurrentHashMap.put("Jeck", concurrentHashMap.get("Jeck") + 1);
        };


        for (int i = 0; i < 1000; i++){
            executorCompletionService.execute(r);
        }

        Thread.sleep(3000);
        executorCompletionService.shutdown();


        System.out.println(concurrentHashMap.get("Jeck"));

    }
}
