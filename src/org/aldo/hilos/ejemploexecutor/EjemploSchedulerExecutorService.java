package org.aldo.hilos.ejemploexecutor;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class EjemploSchedulerExecutorService {
    public static void main(String[] args) {

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(2);

        System.out.println("Alguna tarea en el main ...");
        executor.schedule(() -> {
            System.out.println("Hola mundo tarea ... ");
            try {
                TimeUnit.MILLISECONDS.sleep(1_000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }, 2_000, TimeUnit.MILLISECONDS);

        System.out.println("Alguna otra tarea ... ");
        executor.shutdown();
    }
}
