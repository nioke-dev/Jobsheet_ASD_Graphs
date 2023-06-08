import java.util.Scanner;

public class GraphMainTugas1 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah graph: ");
        int graphCount = scanner.nextInt();

        Graph graph = new Graph(graphCount);

        System.out.print("Masukkan jumlah edge: ");
        int edgeCount = scanner.nextInt();

        for (int i = 0; i < edgeCount; i++) {
            System.out.println("Edge ke-" + (i + 1) + ": ");
            System.out.print("Source: ");
            int source = scanner.nextInt();
            System.out.print("Destination: ");
            int destination = scanner.nextInt();
            graph.addEdge(source, destination);
        }

        graph.printGraph();

        System.out.print("Masukkan vertex untuk menghitung derajat: ");
        int vertex = scanner.nextInt();
        graph.degree(vertex);

        scanner.close();
    }
}
