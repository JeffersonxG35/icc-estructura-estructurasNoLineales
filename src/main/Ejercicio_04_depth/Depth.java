package main.Ejercicio_04_depth;

import main.Materia.Models.Node;

public class Depth {

    public int maxDepth(Node root) {
        if(root ==null){
            return 0;
        }
        int dephtLeft = maxDepth(root.getLeft());
        int dephtRight = maxDepth(root.getRight());
        return Math.max(dephtLeft, dephtRight)+1;

    }
    
}
