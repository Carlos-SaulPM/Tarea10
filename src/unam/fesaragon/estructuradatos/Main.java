package unam.fesaragon.estructuradatos;

import unam.fesaragon.estructuradatos.adt.NodoArbol;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Tarea 10: Ejercicios con NodoArbol");
        System.out.println("Primer arbol, enteros:");
        NodoArbol<Integer> raizPrimerArbol = new NodoArbol<>(10);
        //Nodos interiores
        raizPrimerArbol.setHijoIzquierdo(new NodoArbol<>(5));
        raizPrimerArbol.setHijoDerecho(new NodoArbol<>(15));
        //Nodos hojas
        raizPrimerArbol.getHijoIzquierdo().setHijoIzquierdo(new NodoArbol<>(1));
        raizPrimerArbol.getHijoDerecho().setHijoDerecho(new NodoArbol<>(25));
        System.out.println(raizPrimerArbol);
        NodoArbol<String> raizSegundoArbol =
                new NodoArbol<>("Diego",
                    new NodoArbol<>("Pedro",
                            new NodoArbol<>("Susan"),
                            new NodoArbol<>("Diana")),
                    new NodoArbol<>("Mario"));
        System.out.println(raizSegundoArbol);
    }
}
