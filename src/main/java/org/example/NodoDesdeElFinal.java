package org.example;

public class NodoDesdeElFinal {
    Nodo cabeza;

    public Nodo obtenerNthDesdeElFinal(int n) {
        // 1
        Nodo rapido = cabeza;
        Nodo lento = cabeza;
        // 2
        for (int i = 0; i < n; i++) {
            if (rapido == null) return null;
            rapido = rapido.siguiente;
        }
        // 3
        while (rapido != null) {
            rapido = rapido.siguiente;
            lento = lento.siguiente;
        }
        return lento;
    }
}
