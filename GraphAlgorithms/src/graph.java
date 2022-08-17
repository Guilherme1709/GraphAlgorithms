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


    public int higestDegree() {
        int higestDegree = 0;

        for(int i = 0; i < adjMatrix.length; ++i) {
            int higest = this.degree(i);
            if(higestDegree < higest) {
                higestDegree = higest;
            }
        }

        return higestDegree;
    }


    public int lowestDegree() {
        int lowestDegree = adjMatrix.length;

        for(int i = 0; i < adjMatrix.length; ++i) {
            int lowest = this.degree(i);
            if(lowestDegree > lowest) {
                lowestDegree = lowest;
            }
        }

        return lowestDegree;
    }


    public graph complement() {
        graph newGraph = new graph(countNodes);

        for(int i = 0; i < this.adjMatrix.length; ++i) {
            for(int j = 0; j < this.adjMatrix[i].length; ++j){
                if(adjMatrix[i][j] == 0 && i != j) {
                    newGraph.addEdge(i, j, 1);
                }
            }
        }

        return newGraph;
    }


    public float density() {
        float d = 0;

        d = this.countEdges / this.countNodes * (this.countNodes-1);

        return d;
    }


    public boolean subGraph(graph g2) {
        if(g2.countNodes > this.countNodes || g2.countEdges > this.countEdges) {
            return false;
        } 

        for(int i = 0; i < g2.adjMatrix.length; ++i) {
            for(int j = 0; j < g2.adjMatrix[i].length; ++j) {
                if(g2.adjMatrix[i][j] != 0 && this.adjMatrix[i][j] == 0) {
                    return false;
                }
            }
        }

        return true;
    }


    public int getCountNodes() {
        return countNodes;
    }

    public int getCountEdges() {
        return countEdges;
    }

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