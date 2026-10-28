package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("                                           ");
            System.out.println("          MENÚ DE EJERCICIOS JAVA          ");
            System.out.println("                                           ");
            System.out.println("          EJERCICIOS DE ARREGLOS           ");
            System.out.println("1. Buscar y Devolver Índice");
            System.out.println("2. Suma Total de Elementos");
            System.out.println("3. Invertir Arreglo In Situ");
            System.out.println("4. Mover Ceros al Final");
            System.out.println("5. Encontrar Número Faltante");
            System.out.println("          EJERCICIOS DE LISTAS ENLAZADAS ");
            System.out.println("6. Insertar al Final");
            System.out.println("7. Invertir Lista");
            System.out.println("8. Devolver Nodo N desde el Final");
            System.out.println("9. Eliminar Duplicados (Lista Ordenada)");
            System.out.println("10. Detectar Bucle (Liebre y Tortuga)");
            System.out.println("                                         ");
            System.out.println("0. Salir");
            System.out.print("Elige una opción: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
            } else {
                System.out.println("Por favor, ingresa un número válido.");
                scanner.next();
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.println(" Probando: Buscar y Devolver Índice ");
                    Busqueda busqueda = new Busqueda();
                    int[] arr1 = {5, 12, 9, 3, 7};
                    int valorBuscar = 9;
                    int idx = busqueda.buscar(arr1, valorBuscar);
                    System.out.println("El valor " + valorBuscar + " está en el índice: " + idx);
                    break;

                case 2:
                    System.out.println(" Probando: Suma Total de Elementos ");
                    SumaElementos sumaElem = new SumaElementos();
                    int[] arr2 = {2, 4, 6, 8};
                    int sumaTotal = sumaElem.sumar(arr2);
                    System.out.println("La suma total del arreglo es: " + sumaTotal);
                    break;

                case 3:
                    System.out.println("  Probando: Invertir Arreglo In Situ ");
                    InvertirArreglo invArr = new InvertirArreglo();
                    int[] arr3 = {1, 2, 3, 4, 5};
                    invArr.invertir(arr3);
                    System.out.print("Arreglo invertido: ");
                    for (int n : arr3) {
                        System.out.print(n + " ");
                    }
                    System.out.println();
                    break;

                case 4:
                    System.out.println(" Probando: Mover Ceros al Final ");
                    MoverCeros moverCeros = new MoverCeros();
                    int[] arr4 = {0, 1, 0, 3, 12};
                    moverCeros.mover(arr4);
                    System.out.print("Resultado: ");
                    for (int n : arr4) {
                        System.out.print(n + " ");
                    }
                    System.out.println();
                    break;

                case 5:
                    System.out.println(" Probando: Encontrar Número Faltante ");
                    int[] arr5 = {1, 2, 4, 5}; // Falta el 3, N = 5
                    int nFaltante = NumeroFaltante.encontrar(arr5, 5);
                    System.out.println("El número faltante entre 1 y 5 es: " + nFaltante);
                    break;

                case 6:
                    System.out.println(" Probando: Insertar al Final ---");
                    InsertarAlFinal lista6 = new InsertarAlFinal();
                    lista6.insertar(10);
                    lista6.insertar(20);
                    lista6.insertar(30);
                    System.out.println("Se insertaron los valores: 10, 20, 30 correctamente.");
                    break;

                case 7:
                    System.out.println("\n--- Probando: Invertir Lista ---");
                    InvertirLista lista7 = new InvertirLista();
                    lista7.cabeza = new Nodo(1);
                    lista7.cabeza.siguiente = new Nodo(2);
                    lista7.cabeza.siguiente.siguiente = new Nodo(3);
                    System.out.println("Lista original: 1 -> 2 -> 3");
                    lista7.invertir();
                    System.out.println("¡Lista invertida ejecutada con éxito!");
                    break;

                case 8:
                    System.out.println(" Probando: Nodo N desde el Final ");
                    NodoDesdeElFinal lista8 = new NodoDesdeElFinal();
                    lista8.cabeza = new Nodo(10);
                    lista8.cabeza.siguiente = new Nodo(20);
                    lista8.cabeza.siguiente.siguiente = new Nodo(30);
                    Nodo resultado8 = lista8.obtenerNthDesdeElFinal(1);
                    if (resultado8 != null) {
                        System.out.println("El nodo a 1 paso del final tiene el valor: " + resultado8.dato);
                    }
                    break;

                case 9:
                    System.out.println(" Probando: Eliminar Duplicados ");
                    EliminarDuplicados lista9 = new EliminarDuplicados();
                    lista9.cabeza = new Nodo(1);
                    lista9.cabeza.siguiente = new Nodo(1);
                    lista9.cabeza.siguiente.siguiente = new Nodo(2);
                    lista9.cabeza.siguiente.siguiente.siguiente = new Nodo(3);
                    lista9.cabeza.siguiente.siguiente.siguiente.siguiente = new Nodo(3);
                    lista9.eliminar();
                    System.out.println("Duplicados eliminados de la lista ordenada (1->1->2->3->3).");
                    break;

                case 10:
                    System.out.println(" Probando: Detectar Bucle ");
                    DetectarBucle lista10 = new DetectarBucle();
                    lista10.cabeza = new Nodo(1);
                    lista10.cabeza.siguiente = new Nodo(2);
                    boolean tieneBucle = lista10.tieneBucle();
                    System.out.println("¿La lista tiene bucle?: " + tieneBucle);
                    break;

                case 0:
                    System.out.println("¡Saliendo del programa. Sigue practicando!");
                    break;

                default:
                    System.out.println("Opción no válida. Elige un número entre 0 y 10.");
                    break;
            }

        } while (opcion != 0);

        scanner.close();
    }
}
