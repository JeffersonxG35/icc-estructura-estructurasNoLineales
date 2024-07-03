package main.Materia.Controllers;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets {
    public Sets() {
        construirHashSet();
        System.out.println();
        construirLinkedHashSet();
        System.out.println();
        construirTreeSet();
        System.out.println();
        construirTreeSetConComparador();

    }

    public void construirHashSet() {
        HashSet<String> conjunto = new HashSet<>();
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Manzana");
        conjunto.add("Uvas");
        conjunto.add("Piña");
        System.out.println("HashSet: " + conjunto);
        conjunto.remove("Banana");
        System.out.println("HashSet después de eliminar banana: " + conjunto);

        // Verificar si un elemento existe
        Boolean contieneNaranja = conjunto.contains("Naranja");
        System.out.println("¿HashSet contiene Naranja? " + contieneNaranja);

        // Obtener el tamaño del conjunto
        int tamanio = conjunto.size();
        System.out.println("Tamaño del Hashet: " + tamanio);

    }

    public void construirLinkedHashSet() {
        LinkedHashSet<String> conjunto = new LinkedHashSet<>();
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Manzana");
        conjunto.add("Uvas");
        conjunto.add("Piña");
        System.out.println("LinkedHashSet: " + conjunto);

    }

    public void construirTreeSet() {
        TreeSet<String> conjunto = new TreeSet<>();
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Manzana");
        conjunto.add("Uvas");
        conjunto.add("Piña");
        System.out.println("TreeSet: " + conjunto);

    }

    public void construirTreeSetConComparador() {
        Comparator<String> comparadorOrdenInverso = new Comparator<String>() {

            @Override
            public int compare(String s1, String s2) {
                return s2.compareTo(s1);
            }
        };

        TreeSet<String> conjunto = new TreeSet<>(comparadorOrdenInverso);
        conjunto.add("Manzana");
        conjunto.add("Banana");
        conjunto.add("Naranja");
        conjunto.add("Manzana");
        conjunto.add("Uvas");
        conjunto.add("Piña");

        System.out.println("TreeSet: " + conjunto);
    }
}
