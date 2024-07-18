package com.tiktok.estructura.clases;

public class Matrices {

    public double[][] crearMatrizDouble(int filas, int col){
        Arreglos arrelgos = new Arreglos();
       double [][] miMatriz = new double[filas][col];

       for (int i = 0; i<filas; i++){
           for (int j = 0; j<col; j++) {
               miMatriz[i][j] = ( Math.random() * 9) +1;
           }
       }
       return miMatriz;
    }


}