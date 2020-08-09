package graphs;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(10);
        graph.addEdge(0, 2);
        graph.addEdge(0, 3);
        graph.addEdge(0, 1);
        graph.addEdge(2, 9);
        graph.addEdge(9, 5);
        graph.addEdge(5, 6);
        graph.addEdge(6, 8);
        graph.addEdge(8, 5);
        graph.addEdge(6, 4);
        graph.addEdge(4, 8);
        graph.addEdge(4, 3);
        graph.addEdge(7, 4);
        graph.addEdge(3, 7);
        graph.addEdge(7, 1);
        graph.addEdge(1, 3);
        graph.addEdge(0, 1);
        graph.addEdge(3, 8);
        graph.addEdge(2, 8);


        BreadthFirstPath bfp = new BreadthFirstPath(graph, 0);
        DepthFirstPaths dfp = new DepthFirstPaths(graph, 0);
        System.out.println(bfp.hasPathTo(6));
        System.out.println("Путь: " + bfp.pathTo(6) + ", длина пути = " + bfp.pathTo(6).size());
        System.out.println(dfp.hasPathTo(6));
        System.out.println("Путь: " + dfp.pathTo(6) + ", длина пути = " + dfp.pathTo(6).size());

    }
}
