package org.example;

public class EliminarDuplicados {
    Nodo cabeza;
    public void eliminar() {
        // 1.
        Nodo actual = cabeza;
        while (actual != null && actual.siguiente != null) {
            // 2.
            if (actual.dato == actual.siguiente.dato) {
                actual.siguiente = actual.siguiente.siguiente;
            } else {
                // 3.
                actual = actual.siguiente;
            }
        }
    }
}

