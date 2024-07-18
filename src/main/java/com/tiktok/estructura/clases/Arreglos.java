package com.tiktok.estructura.clases;

public class Arreglos {

    public int[] crearArreglosEnteros(int tamanio) {
        int[] miArreglo = new int[tamanio];

        for(int i =0; i<tamanio; i++){
            int enteroAleatorio = (int) ( Math.random() * 100000) +1;
            miArreglo[i] = enteroAleatorio;
        }
        return miArreglo;
    }

    public double[] crearArreglosDouble(int tamanio) {
        double[] miArreglo = new double[tamanio];

        for(int i =0; i<tamanio; i++){
            double enteroAleatorio = (int) ( Math.random() * 100000) +1;
            miArreglo[i] = enteroAleatorio;
        }
        return miArreglo;
    }

}