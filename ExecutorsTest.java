package MultiThread;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;

/**
 * Created by qimingzhang on 2017/4/28.
 */
public class ExecutorsTest {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(10);

        executorService.execute(new Runnable() {
            public void run() {
                System.out.println("Asynchronous task");
            }
        });


        Future future = executorService.submit(new Runnable() {
            public void run() {
                System.out.println("Asynchronous task");
            }
        });

        future.get();  //returns null if the task has finished correctly.

        future = executorService.submit(new Callable(){
            public Object call() throws Exception {
                System.out.println("Asynchronous Callable");
                return "Callable Result";
            }
        });

        System.out.println("future.get() = " + future.get());

        executorService.shutdown();

        ExecutorService anotherExecutorService = Executors.newSingleThreadExecutor();

        Set<Callable<String>> callables = new HashSet<Callable<String>>();

        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 1";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 2";
            }
        });
        callables.add(new Callable<String>() {
            public String call() throws Exception {
                return "Task 3";
            }
        });

        String result = anotherExecutorService.invokeAny(callables);
        System.out.println("result = " + result);
        anotherExecutorService.shutdown();

    }
}
