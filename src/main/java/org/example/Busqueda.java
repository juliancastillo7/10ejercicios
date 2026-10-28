package org.example;

public class Busqueda {

    public int buscar(int[] arreglo, int valor) {
        // 1.
        for (int i = 0; i < arreglo.length; i++) {
            // 2.
            if (arreglo[i] == valor) {
                return i;
            }
        }
        // 3.
        return -1;
    }
}