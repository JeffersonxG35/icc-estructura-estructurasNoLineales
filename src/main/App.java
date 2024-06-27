package main;

import main.Materia.Controllers.AVLTree;
/*
 *                1
 *        2               3
 *     4     5              6
 *  7      8   
 */
public class App {
    public static void main(String[] args) throws Exception {
       /*  ArbolBinario arbolBinario = new ArbolBinario();
        Node nodeRoot = new Node(1);
        nodeRoot.setLeft(new Node(2));
        nodeRoot.setRight(new Node(3));

        nodeRoot.getLeft().setLeft(new Node(4));

        nodeRoot.getLeft().setRight(new Node(5));

        nodeRoot.getRight().setRight(new Node(6));

        nodeRoot.getLeft().getLeft().setLeft(new Node(7));

        nodeRoot.getLeft().getRight().setLeft(new Node(8));

        arbolBinario.preOrderLoop(nodeRoot);
        System.out.println();
        arbolBinario.preOrderRecursivo(nodeRoot);
        System.out.println();
        arbolBinario.postOrderLoop(nodeRoot);
        System.out.println();
        arbolBinario.posOrderRecursivo(nodeRoot);
        System.out.println();
        arbolBinario.inOrderRecursivo(nodeRoot);
        */

       AVLTree tree = new AVLTree();

        int[] values = { 10, 20, 15, 24, 9, 8, 21, 23, 50, 25 };

        for (int value : values) {
            tree.insert(value);
        }
    }
}
