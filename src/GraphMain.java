import java.util.Scanner;

public class GraphMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan vertex: ");
        String[] vertex = new String[sc.nextInt()];
        sc.nextLine();

        for (int i = 0; i < vertex.length; i++) {
            System.out.print("Masukkan data vertex ke-" + i + " : ");
            vertex[i] = sc.nextLine();
        }

        Graph<String> graph = new Graph<String>(vertex);

        System.out.print("Masukkan edge: ");
        int edge = sc.nextInt();

        int menu;
        do {
            System.out.println("==== Pilih menu =====");
            System.out.println("1. Directed");
            System.out.println("2. Undirected");
            System.out.print("Masukkan menu : ");
            menu = sc.nextInt();
            System.out.println("");

            System.out.println("Masukkan edge: <from> <to>");
            if (menu == 1) {
                for (int i = 0; i < edge; i++) {
                    graph.graphType(sc.nextInt(), sc.nextInt());
                }
                System.out.println("-----------------------");
                graph.printGraph();
            } else if (menu == 2) {
                for (int i = 0; i < edge; i++) {
                    graph.addEdge(sc.nextInt(), sc.nextInt());
                }
                System.out.println("-----------------------");
                graph.printGraph();
            }
        } while (menu != 1 && menu != 2);
    }
}
