package org.example;

public class NumeroFaltante {

    public static int encontrar(int[] arreglo, int n) {
        // 1.
        int sumaIdeal = n * (n + 1) / 2;
        // 2.
        int sumaReal = 0;
        for (int i = 0; i < arreglo.length; i++) {
            sumaReal += arreglo[i];
        }
        // 3.
        int faltante = sumaIdeal - sumaReal;
        return faltante;
    }
}
