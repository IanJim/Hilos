package org.aldo.hilos.ejemplos;

import org.aldo.hilos.ejemplos.threads.NombreThread;

public class EjemploExtenderThread {
    public static void main(String[] args) throws InterruptedException {
        Thread hilo = new NombreThread("John Doe");
        hilo.start();
        // Thread.sleep(2);
        Thread hilo2 = new NombreThread("Maria");
        hilo2.start();

        NombreThread hilo3 = new NombreThread("Pepe");
        hilo3.start();
        System.out.println(hilo.getState());
    }
}
