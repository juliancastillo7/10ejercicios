package org.example;

public class MoverCeros {

    public void mover(int[] arreglo) {
        // 1.
        int idxNoCero = 0;
        // 2.
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] != 0) {
                arreglo[idxNoCero] = arreglo[i];
                idxNoCero++;
            }
        }
        // 3.
        while (idxNoCero < arreglo.length) {
            arreglo[idxNoCero] = 0;
            idxNoCero++;
        }
    }
}
