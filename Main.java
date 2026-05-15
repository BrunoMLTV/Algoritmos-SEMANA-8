/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab08;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
public class Main {
    public static void main(String[] args) {
        
        // PRUEBA INVERSIÓN
       
        System.out.println("===== INVERSIÓN =====");

        ListaEnlazada lista = new ListaEnlazada();
        lista.insertar(1);
        lista.insertar(2);
        lista.insertar(3);
        lista.insertar(4);
        lista.insertar(5);
        System.out.println("Lista original:");
        lista.mostrar();
        lista.cabeza = InversorLista.invertir(lista.cabeza);
        System.out.println("Lista invertida:");
        lista.mostrar();

        // PRUEBA CICLOS

        System.out.println("\n===== CICLOS =====");

        ListaEnlazada listaCiclo = new ListaEnlazada();

        listaCiclo.insertar(10);
        listaCiclo.insertar(20);
        listaCiclo.insertar(30);
        listaCiclo.insertar(40);

        // Crear ciclo manual
        Nodo nodo1 = listaCiclo.cabeza;
        Nodo nodo2 = nodo1.siguiente;
        Nodo nodo3 = nodo2.siguiente;
        Nodo nodo4 = nodo3.siguiente;

        nodo4.siguiente = nodo2;

        boolean tieneCiclo =
                DetectorCiclos.detectar(listaCiclo.cabeza);

        System.out.println("¿Tiene ciclo?");
        System.out.println(tieneCiclo);

        // PRUEBA FUSIÓN

        System.out.println("\n===== FUSIÓN =====");

        ListaEnlazada lista1 = new ListaEnlazada();
        ListaEnlazada lista2 = new ListaEnlazada();

        lista1.insertar(1);
        lista1.insertar(3);
        lista1.insertar(5);

        lista2.insertar(2);
        lista2.insertar(4);
        lista2.insertar(6);

        Nodo fusionada =
                FusionadorListas.fusionar(
                        lista1.cabeza,
                        lista2.cabeza
                );

        Nodo actual = fusionada;

        while (actual != null) {

            System.out.print(actual.valor);

            if (actual.siguiente != null) {
                System.out.print(" -> ");
            }

            actual = actual.siguiente;
        }
        System.out.println();
    }
}
