import java.io.IOException;
import java.util.Scanner;

class App {
    public static void menu(){
        System.out.println("\t═══════*═══════ - Bem-vindo - ═══════*════════");
        System.out.println("Por favor, informe qual a tarefa de hoje: ");
        System.out.println("1. Caminho Mínimo");
        System.out.println("2. Labirinto");
        System.out.println("3. Sair");
    }

    public static void main(String[] args) throws IOException {
        /*graphList recebaaa = new graphList("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\facebook_combined.txt");
        graphMatrix face2 = new graphMatrix("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\facebook_combined.txt");
        recebaaa.Bellman_Ford(0, 100);
        recebaaa.Bellman_Ford_Melhorado(0, 100);
        recebaaa.Dijkstra(0, 100);
        face2.floydWarshall(0, 100);*/

        /*graphList ny1 = new graphList("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\toy.txt");
        graphMatrix ny2 = new graphMatrix("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\toy.txt");
        ny1.Bellman_Ford(0, 4);
        ny1.Bellman_Ford_Melhorado(0, 4);
        ny1.Dijkstra(0, 4);
        ny2.floydWarshall(0, 4);*/


            int opcao;
            int arquivo;
            int origem;
            int destino;
            int opcao2;
            Scanner entrada = new Scanner(System.in);
            
            do{
                menu();
                opcao = entrada.nextInt();
                
                switch(opcao){
                case 1:
                    System.out.println("\nSelecione o arquivo que você deseja usar: ");
                    System.out.println("1 - facebook_combined.txt");
                    System.out.println("2 - rg300_4730.txt");
                    System.out.println("3 - rome99c.txt");
                    System.out.println("4 - toy.txt");
                    System.out.println("5 - USA-road-dt.DC.txt");
                    System.out.println("6 - USA-road-dt.NY.txt");
                    arquivo = entrada.nextInt();

                    System.out.println("\nInforme o nó de origem: ");
                    origem = entrada.nextInt();
                    System.out.println("Agora, informe o nó de destino: ");
                    destino= entrada.nextInt();

                        if(arquivo == 1) {
                            System.out.println("\nEstamos quase lá! \nSelecione o algoritmo que você deseja usar: ");
                            System.out.println("1 - Bellman-Ford");
                            System.out.println("2 - Bellman-Ford Melhorado");
                            System.out.println("3 - Dijkstra");
                            System.out.println("4 - Floyd Warshall");
                            opcao2 = entrada.nextInt();

                            if(opcao2 == 1) {
                                graphList recebaaa = new graphList("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\facebook_combined.txt");
                                System.out.println("\nAqui está o seu resultado:\n");
                                recebaaa.Bellman_Ford(origem, destino);
                            } else if(opcao2 == 2) {
                                graphList recebaaa = new graphList("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\facebook_combined.txt");
                                System.out.println("\nAqui está o seu resultado:\n");
                                recebaaa.Bellman_Ford_Melhorado(origem, destino);
                            } else if(opcao2 == 3) {
                                graphList recebaaa = new graphList("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\facebook_combined.txt");
                                System.out.println("\nAqui está o seu resultado:\n");
                                recebaaa.Dijkstra(origem, destino);
                            } else if(opcao2 == 4) {
                                graphMatrix recebaaa = new graphMatrix("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\facebook_combined.txt");
                                System.out.println("\nAqui está o seu resultado:\n");
                                recebaaa.floydWarshall(origem, destino);
                            }

                        } else if(arquivo == 2) {
                            System.out.println("\nEstamos quase lá! \nSelecione o algoritmo que você deseja usar: ");
                            System.out.println("1 - Bellman-Ford");
                            System.out.println("2 - Bellman-Ford Melhorado");
                            System.out.println("3 - Dijkstra");
                            System.out.println("4 - Floyd Warshall");
                            opcao2 = entrada.nextInt();

                            if(opcao2 == 1) {
                                graphList recebaaa = new graphList("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\rg300_4730.txt");
                                System.out.println("\nAqui está o seu resultado:\n");
                                recebaaa.Bellman_Ford(origem, destino);
                            } else if(opcao2 == 2) {
                                graphList recebaaa = new graphList("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\rg300_4730.txt");
                                System.out.println("\nAqui está o seu resultado:\n");
                                recebaaa.Bellman_Ford_Melhorado(origem, destino);
                            } else if(opcao2 == 3) {
                                graphList recebaaa = new graphList("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\rg300_4730.txt");
                                System.out.println("\nAqui está o seu resultado:\n");
                                recebaaa.Dijkstra(origem, destino);
                            } else if(opcao2 == 4) {
                                graphMatrix recebaaa = new graphMatrix("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\rg300_4730.txt");
                                System.out.println("\nAqui está o seu resultado:\n");
                                recebaaa.floydWarshall(origem, destino);
                            }
                        } else if(arquivo == 3) {
                            System.out.println("\nEstamos quase lá! \nSelecione o algoritmo que você deseja usar: ");
                            System.out.println("1 - Bellman-Ford");
                            System.out.println("2 - Bellman-Ford Melhorado");
                            System.out.println("3 - Dijkstra");
                            System.out.println("4 - Floyd Warshall");
                            opcao2 = entrada.nextInt();

                            if(opcao2 == 1) {
                                graphList recebaaa = new graphList("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\rome99c.txt");
                                System.out.println("\nAqui está o seu resultado:\n");
                                recebaaa.Bellman_Ford(origem, destino);
                            } else if(opcao2 == 2) {
                                graphList recebaaa = new graphList("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\rome99c.txt");
                                System.out.println("\nAqui está o seu resultado:\n");
                                recebaaa.Bellman_Ford_Melhorado(origem, destino);
                            } else if(opcao2 == 3) {
                                graphList recebaaa = new graphList("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\rome99c.txt");
                                System.out.println("\nAqui está o seu resultado:\n");
                                recebaaa.Dijkstra(origem, destino);
                            } else if(opcao2 == 4) {
                                graphMatrix recebaaa = new graphMatrix("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\rome99c.txt");
                                System.out.println("\nAqui está o seu resultado:\n");
                                recebaaa.floydWarshall(origem, destino);
                            }
                        } else if(arquivo == 4) {
                            System.out.println("\nEstamos quase lá! \nSelecione o algoritmo que você deseja usar: ");
                            System.out.println("1 - Bellman-Ford");
                            System.out.println("2 - Bellman-Ford Melhorado");
                            System.out.println("3 - Dijkstra");
                            System.out.println("4 - Floyd Warshall");
                            opcao2 = entrada.nextInt();

                            if(opcao2 == 1) {
                                graphList recebaaa = new graphList("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\toy.txt");
                                System.out.println("\nAqui está o seu resultado:\n");
                                recebaaa.Bellman_Ford(origem, destino);
                            } else if(opcao2 == 2) {
                                graphList recebaaa = new graphList("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\toy.txt");
                                System.out.println("\nAqui está o seu resultado:\n");
                                recebaaa.Bellman_Ford_Melhorado(origem, destino);
                            } else if(opcao2 == 3) {
                                graphList recebaaa = new graphList("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\toy.txt");
                                System.out.println("\nAqui está o seu resultado:\n");
                                recebaaa.Dijkstra(origem, destino);
                            } else if(opcao2 == 4) {
                                graphMatrix recebaaa = new graphMatrix("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\toy.txt");
                                System.out.println("\nAqui está o seu resultado:\n");
                                recebaaa.floydWarshall(origem, destino);
                            }
                        } else if(arquivo == 5) {
                            System.out.println("\nEstamos quase lá! \nSelecione o algoritmo que você deseja usar: ");
                            System.out.println("1 - Bellman-Ford");
                            System.out.println("2 - Bellman-Ford Melhorado");
                            System.out.println("3 - Dijkstra");
                            System.out.println("4 - Floyd Warshall");
                            opcao2 = entrada.nextInt();

                            if(opcao2 == 1) {
                                graphList recebaaa = new graphList("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\USA-road-dt.DC.txt.txt");
                                System.out.println("\nAqui está o seu resultado:\n");
                                recebaaa.Bellman_Ford(origem, destino);
                            } else if(opcao2 == 2) {
                                graphList recebaaa = new graphList("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\USA-road-dt.DC.txt.txt");
                                System.out.println("\nAqui está o seu resultado:\n");
                                recebaaa.Bellman_Ford_Melhorado(origem, destino);
                            } else if(opcao2 == 3) {
                                graphList recebaaa = new graphList("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\USA-road-dt.DC.txt.txt");
                                System.out.println("\nAqui está o seu resultado:\n");
                                recebaaa.Dijkstra(origem, destino);
                            } else if(opcao2 == 4) {
                                graphMatrix recebaaa = new graphMatrix("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\USA-road-dt.DC.txt.txt");
                                System.out.println("\nAqui está o seu resultado:\n");
                                recebaaa.floydWarshall(origem, destino);
                            }
                        } else if(arquivo == 6) {
                            System.out.println("\nEstamos quase lá! \nSelecione o algoritmo que você deseja usar: ");
                            System.out.println("1 - Bellman-Ford");
                            System.out.println("2 - Bellman-Ford Melhorado");
                            System.out.println("3 - Dijkstra");
                            System.out.println("4 - Floyd Warshall");
                            opcao2 = entrada.nextInt();

                            if(opcao2 == 1) {
                                graphList recebaaa = new graphList("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\USA-road-dt.NY.txt.txt");
                                System.out.println("\nAqui está o seu resultado:\n");
                                recebaaa.Bellman_Ford(origem, destino);
                            } else if(opcao2 == 2) {
                                graphList recebaaa = new graphList("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\USA-road-dt.NY.txt.txt");
                                System.out.println("\nAqui está o seu resultado:\n");
                                recebaaa.Bellman_Ford_Melhorado(origem, destino);
                            } else if(opcao2 == 3) {
                                graphList recebaaa = new graphList("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\USA-road-dt.NY.txt.txt");
                                System.out.println("\nAqui está o seu resultado:\n");
                                recebaaa.Dijkstra(origem, destino);
                            } else if(opcao2 == 4) {
                                graphMatrix recebaaa = new graphMatrix("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\USA-road-dt.NY.txt.txt");
                                System.out.println("\nAqui está o seu resultado:\n");
                                recebaaa.floydWarshall(origem, destino);
                            }
                        }

                    break;
                    
                case 2:
                    
                    break;
                
                default:
                    System.out.println("Obrigado! (Ajuda nós, George!!! :) )");
                }
            } while(opcao != 3);

            entrada.close();

        // System.out.println(g.isOriented());
        // System.out.println(g1.prim());
        // GraphList g1 = new GraphList(5);
        // g1.addEdge(0, 1, 1);
        // g1.addEdge(0, 2, 1);
        // g1.addEdge(1, 4, 1);
        // g1.addEdge(2, 3, 1);
        // // GraphList g1 = new GraphList("src/graph4.txt");
        // System.out.println(g1);
        // GraphList g2 = g1.complement();
        // System.out.println(g2);
        // System.out.println(g1.subgraph(g2));
        // System.out.println(g1.dfsRec(0));

        // GraphMatrix g1 = new GraphMatrix("src/graph3.txt");
        // g1.floydWarshall(0, 3);

        // Graph g1 = new Graph(10);
        // g1.addEdgeUnoriented(7, 5, 1);
        // g1.addEdgeUnoriented(7, 1, 1);
        // g1.addEdgeUnoriented(7, 2, 1);
        // g1.addEdgeUnoriented(1, 0, 1);
        // g1.addEdgeUnoriented(1, 4, 1);
        // g1.addEdgeUnoriented(2, 3, 1);
        // g1.addEdgeUnoriented(5, 6, 1);
        // g1.addEdgeUnoriented(6, 8, 1);
        // System.out.println(g1.bfs(7));
        // System.out.println(g1.connected());
        // Graph g2 = new Graph("graph1.txt");
        // System.out.println(g2);

        // Graph g1 = new Graph(4);
        // g1.addEdge(0, 1, 1);
        // g1.addEdge(1, 0, 1);
        // g1.addEdge(0, 3, 1);
        // g1.addEdge(3, 0, 1);
        // System.out.println("=== g1 ===");
        // System.out.println(g1);
        // System.out.println("degree(0): " + g1.degree(0)); // 2
        // System.out.println("degree(1): " + g1.degree(1)); // 1
        // System.out.println("degree(2): " + g1.degree(2)); // 0
        // System.out.println("degree(3): " + g1.degree(3)); // 1
        // System.out.println("highestDegree: " + g1.highestDegree()); // 2
        // System.out.println("lowestDegree: " + g1.lowestDegree()); // 0
        // System.out.println("density: " + g1.density());
        // System.out.println("\n=== g1 complement ===");
        // System.out.println(g1.complement());
        // Graph g2 = new Graph(3);
        // g2.addEdge(0, 1, 1);
        // g2.addEdge(1, 0, 1);
        // System.out.println("g2 is subGraph? " + g1.subGraph(g2)); // true
        // Graph g3 = new Graph(4);
        // g3.addEdge(1, 3, 1);
        // g3.addEdge(3, 1, 1);
        // System.out.println("g3 is subGraph? " + g1.subGraph(g3)); // false

    }
}