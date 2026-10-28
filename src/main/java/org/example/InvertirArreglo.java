package org.example;

public class InvertirArreglo {

    public void invertir(int[] arreglo) {
        // 1.
        int inicio = 0;
        int fin = arreglo.length - 1;
        // 2.
        while (inicio < fin) {
            int temp = arreglo[inicio];
            arreglo[inicio] = arreglo[fin];
            arreglo[fin] = temp;
            // 3.
            inicio++;
            fin--;
        }
    }
}