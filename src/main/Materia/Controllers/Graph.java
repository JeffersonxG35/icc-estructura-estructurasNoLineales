package main.Materia.Controllers;

import java.util.ArrayList;
import java.util.List;

import main.Materia.Models.NodeGraph;

public class Graph {
    private List<NodeGraph> nodes;

    public Graph() {
        this.nodes = new ArrayList<>();

    }

    public NodeGraph addNode(int value) {
        NodeGraph newNode = new NodeGraph(value);
        nodes.add(newNode);
        return newNode;
    }

    public void addEdge(NodeGraph src, NodeGraph dest) {
        src.addNeighbor(dest);
        dest.addNeighbor(src);
    }

    public void printGraph() {
        for (NodeGraph node : nodes) {
            System.out.print(" Vertex " + node.getValue() + ": ");
            for (NodeGraph neighbor : node.getNeighbors()) {
                System.out.print(" --> " + neighbor.getValue());
            }
            System.out.println();
        }

    }
    public void getDFS(NodeGraph startNode) {
        boolean[] visited = new boolean[nodes.size()];
        getDFSUtil(startNode, visited);
    }

    private void getDFSUtil(NodeGraph node, boolean[] visited) {
        if (node == null) return;

        int index = nodes.indexOf(node);
        if (index == -1 || visited[index]) return;

        visited[index] = true;
        System.out.print(node.getValue() + " ");

        for (NodeGraph neighbor : node.getNeighbors()) {
            getDFSUtil(neighbor, visited);
        }
    }

    public void getBFS(NodeGraph startNode) {
        boolean[] visited = new boolean[nodes.size()];
        getBFSUtil(startNode, visited);
    }

    private void getBFSUtil(NodeGraph node, boolean[] visited) {
        if (node == null) return;

        int index = nodes.indexOf(node);
        if (index == -1 || visited[index]) return;

        visited[index] = true;
        System.out.print(node.getValue() + " ");

        for (NodeGraph neighbor : node.getNeighbors()) {
            int neighborIndex = nodes.indexOf(neighbor);
            if (neighborIndex != -1 && !visited[neighborIndex]) {
                getBFSUtil(neighbor, visited);
            }
        }
    }

    public int[][] getAdjacencyMatrix() {
        int size = nodes.size();
        int[][] adjacencyMatrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            NodeGraph node = nodes.get(i);
            for (NodeGraph neighbor : node.getNeighbors()) {
                int neighborIndex = nodes.indexOf(neighbor);
                if (neighborIndex != -1) {
                    adjacencyMatrix[i][neighborIndex] = 1;
                }
            }
        }

        return adjacencyMatrix;
    }

    public void printAdjacencyMatrix() {
        int[][] matrix = getAdjacencyMatrix();
        System.out.print("   ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


/* 
        public void getDFS(NodeGraph startNode) {
        boolean[] visited = new boolean[nodes.size()];
        getDFSUtil(startNode, visited);
    }

    private void getDFSUtil(NodeGraph node, boolean[] visited) {
        if (node == null) return;

        int index = nodes.indexOf(node);
        if (index == -1 || visited[index]) return;

        visited[index] = true;
        System.out.print(node.getValue() + " ");

        for (NodeGraph neighbor : node.getNeighbors()) {
            getDFSUtil(neighbor, visited);
        }
    }

    public void getBFS(NodeGraph startNode) {
        boolean[] visited = new boolean[nodes.size()];
        Queue<NodeGraph> queue = new LinkedList<>();

        int startIndex = nodes.indexOf(startNode);
        if (startIndex == -1) return;

        visited[startIndex] = true;
        queue.add(startNode);

        while (!queue.isEmpty()) {
            NodeGraph node = queue.poll();
            System.out.print(node.getValue() + " ");

            for (NodeGraph neighbor : node.getNeighbors()) {
                int neighborIndex = nodes.indexOf(neighbor);
                if (neighborIndex != -1 && !visited[neighborIndex]) {
                    visited[neighborIndex] = true;
                    queue.add(neighbor);
                }
            }
        }
    }

    public int[][] getAdjacencyMatrix() {
        int size = nodes.size();
        int[][] adjacencyMatrix = new int[size][size];

        for (int i = 0; i < size; i++) {
            NodeGraph node = nodes.get(i);
            for (NodeGraph neighbor : node.getNeighbors()) {
                int neighborIndex = nodes.indexOf(neighbor);
                if (neighborIndex != -1) {
                    adjacencyMatrix[i][neighborIndex] = 1;
                }
            }
        }

        return adjacencyMatrix;
    }

    public void printAdjacencyMatrix() {
        int[][] matrix = getAdjacencyMatrix();
        System.out.print("   ");
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(i + ": ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
    */

