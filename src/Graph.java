// public class Graph {
//     int vertex;
//     LinkedLists list[];

//     public Graph(int vertex) {
//         this.vertex = vertex;
//         list = new LinkedLists[vertex];
//         for (int i = 0; i < vertex; i++) {
//             list[i] = new LinkedLists();
//         }
//     }

//     public void addEdge(int source, int destination) {
//         list[source].addFirst(destination);
//         list[destination].addFirst(source);
//     }

//     public void degree(int source) throws Exception {
//         System.out.println("degree vertex " + source + " : " + list[source].size());
//         int k, totalIn = 0, totalOut = 0;
//         for (int i = 0; i < vertex; i++) {
//             for (int j = 0; j < list[i].size(); j++) {
//                 if (list[i].get(j) == source)
//                     ++totalIn;
//             }
//             for (k = 0; k < list[source].size(); k++) {
//                 list[source].get(k);
//             }
//             totalOut = k;
//         }
//         System.out.println("Indegree dari vertex " + source + " : " + totalIn);
//         System.out.println("Outdegree dari vertex " + source + " : " + totalOut);
//         System.out.println("degree vertex " + source + " : " + (totalIn + totalOut));

//     }

//     public void removeEdge(int source, int destination) throws Exception {
//         LinkedLists listSource = list[source];
    
//         if (listSource.isEmpty()) {
//             throw new Exception("Tidak ada source yang terhubung.");
//         }
    
//         int index = -1;
//         for (int i = 0; i < listSource.size(); i++) {
//             if (listSource.get(i) == destination) {
//                 index = i;
//                 break;
//             }
//         }
    
//         if (index == -1) {
//             throw new Exception("Destination tidak terhubung dengan source.");
//         }else{
//             System.out.println("source terhubung");
//         }
    
//         listSource.remove(index);
    
//         LinkedLists listDestination = list[destination];
//         index = -1;
//         for (int i = 0; i < listDestination.size(); i++) {
//             if (listDestination.get(i) == source) {
//                 index = i;
//                 break;
//             }
//         }
    
//         if (index != -1) {
//             listDestination.remove(index);
//         }
//     }
    

//     public void removeAllEdges() {
//         for (int i = 0; i < vertex; i++) {
//             list[i].clear();
//         }
//         System.out.println("Graph berhasil dikosongkan");
//     }

//     public void printGraph() throws Exception {
//         for (int i = 0; i < vertex; i++) {
//             if (list[i].size() > 0) {
//                 System.out.println("Vertex " + i + " terhubung dengan: ");
//                 for (int j = 0; j < list[i].size(); j++) {
//                     System.out.print(list[i].get(j) + " ");
//                 }
//                 System.out.println("");
//             }
//         }
//         System.out.println(" ");
//     }
// }


public class Graph<A> {
    A[] vertex;
    LinkedLists list[];

    public Graph(A[] vertex) {
        this.vertex = vertex;
        list = new LinkedLists[vertex.length];
        for (int i = 0; i < vertex.length; i++) {
            list[i] = new LinkedLists();
        }
    }

    public void addEdge(int source, int destination) {
        // add edge
        list[source].addFirst(destination);

        // add back edge (for undirected)
        list[destination].addFirst(source);
    }

    public void degree(int source) throws Exception {
        // degree directed graph
        System.out.println("degree vertex " + vertex[source] + " : " + list[source].size());

        // degree directed graph
        // inDegree
        int k, totalIn = 0, totalOut = 0;
        for (int i = 0; i < vertex.length; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                if (list[i].get(j) == source)
                    ++totalIn;
            }
            // outDegree
            for (k = 0; k < list[source].size(); k++) {
                list[source].get(k);
            }
            totalOut = k;
        }
        System.out.println("Indegree dari vertex " + vertex[source] + " : " + totalIn);
        System.out.println("Outdegree dari vertex " + vertex[source] + " : " + totalOut);
        System.out.println("Degree vertex " + vertex[source] + " : " + (totalIn + totalOut));
    }

    public void removeEdge(int source, int destination) throws Exception {
        for (int i = 0; i < vertex.length; i++) {
            if (i == destination) {
                list[source].remove(destination);
            }
        }
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex.length; i++) {
            list[i].clear();
        }
        System.out.println("Graph berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex.length; i++) {
            if (list[i].size() > 0) {
                System.out.print("Vertex " + vertex[i] + " terhubung dengan : ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print(vertex[list[i].get(j)] + " ");
                }
                System.out.println("");
            }
        }
        System.out.println(" ");
    }

    public boolean graphType(int source, int destination) throws Exception {
        list[source].addFirst(destination);
        return true;
    }
}
