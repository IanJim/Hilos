package org.aldo.hilos.ejemplos;

import org.aldo.hilos.ejemplos.runnable.ImprimirFrases;

public class EjemploSincronizacionThread {
    public static void main(String[] args) throws InterruptedException {
        new Thread(new ImprimirFrases("Hola ", "que tal!")).start();
        new Thread(new ImprimirFrases("Quién eres ", "tú?")).start();
        Thread.sleep(100);

        Thread h3 = new Thread(new ImprimirFrases("Muchas ", "gracias amigo!"));
        h3.start();
        Thread.sleep(100);
        System.out.println(h3.getState());
    }

    public synchronized static void imprimirFrases(String frase1, String frase2) {
        System.out.print(frase1);

        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            throw new RuntimeException(ex);
        }
        System.out.println(frase2);
    }


}
