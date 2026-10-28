package org.example;

public class DetectarBucle {
    Nodo cabeza;

    public boolean tieneBucle() {
        Nodo lento = cabeza;
        Nodo rapido = cabeza;
        while (rapido != null && rapido.siguiente != null) {
            // 1.
            lento = lento.siguiente;
            // 2.
            rapido = rapido.siguiente.siguiente;
            // 3.
            if (lento == rapido) {
                return true;
            }
        }
        return false;
    }
}
