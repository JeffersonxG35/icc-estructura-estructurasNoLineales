package main.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import main.Materia.Models.Node;

public class ListLevels {

    public List<List<Node>> listLevels(Node root) {
        List<List<Node>> result = new ArrayList<>();
        if (root == null) {
            return result; 
        }
        
        Queue<Node> cola = new LinkedList<>();
        cola.add(root); 
        
        while (!cola.isEmpty()) {
            int tamanoNivel = cola.size(); 
            List<Node> nivelActual = new ArrayList<>();
            
            for (int i = 0; i < tamanoNivel; i++) {
                Node nodoActual = cola.poll(); 
                nivelActual.add(nodoActual); 
                
               
                if (nodoActual.getLeft()!= null) {
                    cola.add(nodoActual.getLeft());
                }
                if (nodoActual.getRight() != null) {
                    cola.add(nodoActual.getRight());
                }
            }
            
            result.add(nivelActual); 
        }
        
        return result; 
    }
}