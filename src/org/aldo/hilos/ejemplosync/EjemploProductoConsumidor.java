package org.aldo.hilos.ejemplosync;

import org.aldo.hilos.ejemplosync.runnable.Consumidor;
import org.aldo.hilos.ejemplosync.runnable.Panadero;

public class EjemploProductoConsumidor {
    public static void main(String[] args) {
        Panaderia p = new Panaderia();
        new Thread(new Panadero(p)).start();
        new Thread(new Consumidor(p)).start();
    }
}
