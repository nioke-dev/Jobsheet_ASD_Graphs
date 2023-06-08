import java.util.Scanner;

public class GraphArrayMain {
    public static void main(String[] args) {
        int v, e, count = 1, to = 0, from = 0;
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        GraphArray<String> graph;

        try {
            System.out.print("Masukkan jumlah vertices: ");
            v = sc.nextInt();
            System.out.print("Masukkan jumlah edges: ");
            e = sc.nextInt();

            String[] vertex = new String[v + 1];
            System.out.println("");
            for (int i = 1; i <= v; i++) {
                System.out.print("Masukkan data vertex ke-" + i + " : ");
                vertex[i] = sc1.nextLine();
            }
            graph = new GraphArray<String>(vertex);

            System.out.println("");
            System.out.println("Masukkan edges: <to> <from>");
            while (count <= e) {
                to = sc.nextInt();
                from = sc.nextInt();

                graph.makeEdge(to, from, 1);
                count++;
            }
            System.out.println("");
            System.out.println("Array 2D sebagai representasi graph sbb: ");
            System.out.print("\t");
            for (int i = 1; i <= v; i++) {
                System.out.print(vertex[i] + "\t");
            }
            System.out.println();

            for (int i = 1; i <= v; i++) {
                System.out.print(vertex[i] + "\t");
                for (int j = 1; j <= v; j++) {
                    System.out.print(graph.getEdge(i, j) + "\t");
                }
                System.out.println();
            }
        } catch (Exception E) {
            System.out.println("Error. Silahkan cek kembali\n" + E.getMessage());
        }
        sc.close();
        sc1.close();
    }
}
