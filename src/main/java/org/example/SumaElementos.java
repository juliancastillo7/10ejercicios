package org.example;

public class SumaElementos {
    public int sumar(int[] arreglo) {
        // 1.
        int suma = 0;
        // 2.
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        // 3.
        return suma;
    }
}