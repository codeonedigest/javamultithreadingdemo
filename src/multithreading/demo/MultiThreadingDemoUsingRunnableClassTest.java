package multithreading.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MultiThreadingDemoUsingRunnableClassTest {

    public static void main(String args[]) {
        System.out.println("Starting Main Thread - " + Thread.currentThread().getName() + " - " + Thread.currentThread().getPriority());

        List<String> taskList = new ArrayList<>();
        taskList.add("apple");
        taskList.add("orange");
        taskList.add("grapes");
        taskList.add("pineapple");
        taskList.add("banana");
        taskList.add("sapota");
        taskList.add("papaya");
        taskList.add("watermelon");
        taskList.add("coconut");
        taskList.add("muskmelon");
        taskList.add("lemon");
        taskList.add("guvava");


        int threadPoolSize = 4;

        ExecutorService executorService = Executors.newFixedThreadPool(threadPoolSize);

        for(String payload : taskList) {
            executorService.submit(new MultiThreadingDemoUsingRunnableClass(payload));
        }

        executorService.shutdown();


        /*Runnable r1 = new MultiThreadingDemoUsingRunnableClass();
        Thread t1 = new Thread(r1);
        t1.start();*/




        System.out.println("Exiting Main Thread - " + Thread.currentThread().getName() + " - " + Thread.currentThread().getPriority());
    }
}
