import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class graph {
    private int countNodes;
    private int countEdges;
    private int [][] adjMatrix;
    
    public graph(int countNodes) {
        this.countNodes = countNodes;
        this.adjMatrix = new int[countNodes][countNodes];
    }


    //função para adicionar um vértice em um grafo
    public void addEdge(int u, int v, int w) {
        if(u < 0 || u > this.countNodes - 1
            || v < 0 || v > this.countNodes - 1
            || w <= 0) {
                System.err.println("Invalid edge values: " + u + " " + v + " " + w);
        }

        this.adjMatrix[u][v] = w;
        this.countEdges++;
    }


    //algoritmo para detectar o grau de um grafo
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


    //algoritmo para detectar o maior grau de um grafo
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


    //algoritmo para saber o menor grau de um grafo
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


    //algoritmo para saber o complemento de um grafo
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


    //algoritmo para saber a densidade de um grafo
    public float density() {
        float d = 0;

        d = this.countEdges / this.countNodes * (this.countNodes-1);

        return d;
    }


    //algoritmo para detectar subgrafos
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


    //algoritmo BFS
    public ArrayList<Integer> bfs(int s) { // busca em largura
        int[] desc = new int[this.countNodes];
        ArrayList<Integer> Q = new ArrayList<>();
        Q.add(s);
        ArrayList<Integer> R = new ArrayList<>();
        R.add(s);
        desc[s] = 1;

        while (Q.size() > 0) {
          int u = Q.remove(0);
          for (int v = 0; v < this.adjMatrix[u].length; ++v) {
            if (this.adjMatrix[u][v] != 0) { // v é adjacente a u
              if (desc[v] == 0) {
                Q.add(v);
                R.add(v);
                desc[v] = 1;
              }
            }
          }
        }
        return R;
      }


    //algoritmo DFS
    public ArrayList<Integer> dfs(Integer s) {
        int[] desc = new int[this.countNodes];

        ArrayList<Integer> S = new ArrayList<>();
        S.add(s);

        ArrayList<Integer> R = new ArrayList<>();
        R.add(s);

        desc[s] = 1;

        while(S.size() != 0) {
            int u = S.get(S.size() - 1);
            boolean aux = true;

            for(int v = 0; v < this.adjMatrix[u].length; ++v) {
                if(desc[v] == 0) {
                    S.add(v);
                    R.add(v);
                    desc[v] = 1;
                    aux = false;
                    break;
                } 
            }

            if(aux == true) {
                S.remove(u);
            }
        }

        return R;
    }


    //algoritmo para adicionar um vértice não orientado a um grafo
    public void addEdgeUnoriented(int u, int v, int w) {
        if (u < 0 || u > this.countNodes - 1
            || v < 0 || v > this.countNodes - 1 || w <= 0) {
          System.err.println("Invalid edge: " + u + v + w);
          return;
        }

        this.adjMatrix[u][v] = w;
        this.adjMatrix[v][u] = w;
        this.countEdges += 2;
    }


    //algoritmo para saber as conectividades de um grafo
    public boolean connected() {
        return this.bfs(0).size() == this.countNodes;
    }


    //algoritmo para ler um grafo em um arquivo externo
    public graph(String fileName) throws IOException {
        File file = new File(fileName);
        FileReader reader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(reader);

        // Read header
        String[] line = bufferedReader.readLine().split(" ");
        this.countNodes = (Integer.parseInt(line[0]));
        int fileLines = (Integer.parseInt(line[1]));

    // Create and fill adjMatrix with read edges
        this.adjMatrix = new int[this.countNodes][this.countNodes];
        for (int i = 0; i < fileLines; ++i) {
            String[] edgeInfo = bufferedReader.readLine().split(" ");
            int source = Integer.parseInt(edgeInfo[0]);
            int sink = Integer.parseInt(edgeInfo[1]);
            int weight = Integer.parseInt(edgeInfo[2]);
            addEdge(source, sink, weight);
        }

        bufferedReader.close();
        reader.close();
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

    //algoritmo grafo não orientado
    public boolean noOriented() {
        for(int i = 0; i < this.adjMatrix.length; ++i) {
            for(int j = i+1; j < this.adjMatrix[i].length; ++j) {
                if(adjMatrix[i][j] != adjMatrix[j][i]) {
                    return false;
                }
            }
        }

        return true;
    }


    //algoritmo DFS recursivo
    public ArrayList<Integer> dfsRec(int s) {
        int[] desc = new int[this.countNodes];
        ArrayList<Integer> R = new ArrayList<>();

        dfsRecAux(s, desc, R);

        return R;
    }

    public void dfsRecAux(int u, int[] desc, ArrayList<Integer> R) {
        desc[u] = 1;
        R.add(u);

        for (int v = 0; v < this.adjMatrix[u].length; ++v) {
          if (this.adjMatrix[u][v] != 0 && desc[v] == 0) {
            dfsRecAux(v, desc, R);
          }
        }
    }

    //algoritmo de Floyd Warshall
    public void Floyd_Warshall() {
        int[][] dist = new int [this.countNodes][this.countNodes];
        Integer[][] pred = new Integer [this.countNodes][this.countNodes];
        int i, j, k = 0;

        for(i = 0; i < this.countNodes - 1; ++i) {
            for(j = 0; j < this.countNodes - 1; ++j) {
                if(i == j) {
                    dist[i][j] = 0;
                } /*else if (){
                    dist[i][j] = w(i,j)
                    pred[i][j] = i;*/
                else {
                    dist[i][j] = 1000000000;
                    pred[i][j] = null;
                }
            }
        }

        for(k = 0; k < this.countNodes - 1; ++k) {
            for(i = 0; i < this.countNodes - 1; ++i) {
                for(j = 0; i < this.countNodes - 1; ++j) {
                    if(dist[i][j] > dist[i][k] + dist[k][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                        pred[i][j] = pred[k][j];
                    }
                }
            }
        }

        //imprime matrizes
        for(i = 0; i < dist.length; i++) {
            for(j = 0; j < dist[i].length - 1; j++) {
                System.out.print(dist[i][j] + " ");
            }
            System.out.println();
        }

        for(i = 0; i < pred.length; i++) {
            for(j = 0; j < pred[i].length - 1; j++) {
                System.out.print(pred[i][j] + " ");
            }
            System.out.println();
        }
    }
}