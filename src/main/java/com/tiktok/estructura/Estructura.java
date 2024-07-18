package com.tiktok.estructura;


import com.tiktok.estructura.clases.Arreglos;
import com.tiktok.estructura.clases.Matrices;

public class Estructura {

    public static void main(String[] args) {



/**
        Arreglos arregloInstanciado = new Arreglos();

        int[] miArreglo = arregloInstanciado.crearArreglosEnteros(10000);

        for(int i = 0; i<miArreglo.length; i++){
            if(miArreglo[i]%2==0 )
                System.out.println("El numero "+ miArreglo[i] + " es par");
            else
                System.out.println("El numero "+ miArreglo[i] + " es impar");
        }
 */

        Matrices matriz = new Matrices();
        double [][] matrizResultado = matriz.crearMatrizDouble(12,5);

        for(int i = 0; i <matrizResultado.length; i++) {
            for(int j = 0; j<matrizResultado[0].length; j++) {
                System.out.print(matrizResultado[i][j] + "    ");
            }
            System.out.println("");
        }
    }
}