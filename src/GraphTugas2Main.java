public class GraphTugas2Main {
    public static void main(String[] args) throws Exception {
        GraphTugas2 graph = new GraphTugas2(6, false); 
        // false grafik tidak berarah
        // true grafik berarah
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(3, 0);
        graph.printGraph();
        graph.degree(2);
        
        System.out.println("Jenis grafik: " + (graph.graphType() ? "Directed" : "Undirected"));
    }
}
