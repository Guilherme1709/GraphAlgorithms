public class graph {
    private int countNodes;
    private int countEdges;
    private int [][] adjMatrix;
    
    public graph(int countNodes) {
        this.countNodes = countNodes;
        this.adjMatrix = new int[countNodes][countNodes];
    }

    public void addEdge(int source, int sink, int weight) {
        if(source < 0 || source > this.countNodes - 1
            || sink < 0 || sink > this.countNodes - 1
            || weight <= 0) {
                System.err.println("Invalid edge values: " + source + " " + sink + " " + weight);
        }

        this.adjMatrix[source][sink] = weight;
        this.countEdges++;
    }

    public int degree(int node) {
        if(node < 0 || node > this.countNodes - 1) {
            System.err.println("Invalid value: " + node);
        }

        int degree = 0;
        
        for(int i = 0; i < this.adjMatrix.length; ++i) {
            if(this.adjMatrix[node][i] != 0) {
                ++degree;
            }
        }

        return degree;
    }



    /**
     * @return int return the countNodes
     */
    public int getCountNodes() {
        return countNodes;
    }

    /**
     * @return int return the countEdges
     */
    public int getCountEdges() {
        return countEdges;
    }

    /**
     * @return int [][] return the adjMatrix
     */
    public int [][] getAdjMatrix() {
        return adjMatrix;
    }

    public String toString() {
        String str = "";

        for(int i = 0; i < this.adjMatrix.length; ++i) {
            for(int j = 0; j < this.adjMatrix[i].length; ++j) {
                str += this.adjMatrix[i][j] + "\t";
            }
            str += "\n";
        }

        return str;
    } 
}