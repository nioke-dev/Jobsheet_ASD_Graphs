

// public class GraphArray<T> {
//     private final int vertices;
//     private final T[][] twoD_array;

//     public GraphArray(int v){
//         vertices = v;
//         twoD_array = (T[][]) new Object[vertices + 1][vertices + 1];
//     }

//     public void makeEdge(int to, int from, T edge){
//         try{
//             twoD_array[to][from] = edge;
//         }
//         catch (ArrayIndexOutOfBoundsException index){
//             System.out.println("Vertex tidak ada");
//         }
//     }

//     public T getEdge(int to, int from){
//         try{
//             return twoD_array[to][from];
//         } catch(ArrayIndexOutOfBoundsException index){
//             System.out.println("Vertex tidak ada");
//         }
//         return null;
//     }
// }


public class GraphArray<A> {
    private final A[] vertices;
    private final int[][] twoD_array;

    public GraphArray(A[] v) {
        vertices = v;
        twoD_array = new int[vertices.length + 1][vertices.length + 1];
    }

    public void makeEdge(int to, int from, int edge) {
        try {
            twoD_array[to][from] = edge;
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("vertex tidak ada");
        }
    }

    public int getEdge(int to, int from) {
        try {
            return twoD_array[to][from];
        } catch (ArrayIndexOutOfBoundsException index) {
            System.out.println("vertex tidak ada");
        }
        return -1;
    }
}
