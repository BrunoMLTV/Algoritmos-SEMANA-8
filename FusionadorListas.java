/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab08;

/**
 *
 * @author LAB-USR-AREQUIPA
 */
public class FusionadorListas {
    public static Nodo fusionar(Nodo l1, Nodo l2) {
        Nodo dummy = new Nodo(0);
        Nodo actual = dummy;
        while (l1 != null && l2 != null) {
            if (l1.valor < l2.valor) {
                actual.siguiente = l1;
                l1 = l1.siguiente;
            } else {
                actual.siguiente = l2;
                l2 = l2.siguiente;
            }
            actual = actual.siguiente;
        }
        if (l1 != null) {
            actual.siguiente = l1;
        }
        if (l2 != null) {
            actual.siguiente = l2;
        }
        return dummy.siguiente;
    }
}
