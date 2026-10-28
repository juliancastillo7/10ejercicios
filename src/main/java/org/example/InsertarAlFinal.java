package org.example;

public class InsertarAlFinal {
    Nodo cabeza;

    public void insertar(int dato) {
        Nodo nuevoNodo = new Nodo(dato);
        // 1
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            // 2
            Nodo actual = cabeza;
            while (actual.siguiente != null) {
                actual = actual.siguiente;
            }
            // 3
            actual.siguiente = nuevoNodo;
        }
    }
}