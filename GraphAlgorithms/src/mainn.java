public class mainn {
    public static void main(String[] args) throws Exception {
        graph g1 = new graph(4);
        //g1.addEdge(0, 1, 3);
        //g1.addEdge(1, 0, 3);
        //g1.addEdge(0, 3, 4);
        g1.addEdge(3, 0, 4);
        //g1.addEdge(3, 4, 2);
        System.out.println(g1);
        System.out.println(g1.degree(2));
    }
}
