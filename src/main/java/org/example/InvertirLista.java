package org.example;

public class InvertirLista {
    Nodo cabeza;

    public void invertir() {
        // 1
        Nodo prev = null;
        Nodo actual = cabeza;
        Nodo sig = null;
        while (actual != null) {
            // 2
            sig = actual.siguiente;
            // 3
            actual.siguiente = prev;
            // 4
            prev = actual;
            actual = sig;
        }
        cabeza = prev;
    }
}
