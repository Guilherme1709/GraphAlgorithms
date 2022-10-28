import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

class App {
    public static void menuIterativo() {
        System.out.println("\t═══════*═══════ - Bem-vindo - ═══════*════════");
        System.out.println("Por favor, informe qual a tarefa de hoje: ");
        System.out.println("1. Caminho Mínimo");
        System.out.println("2. Labirinto");
        System.out.println("3. Sair");
    }

    public static void main(String[] args) throws IOException {
        int opcao;
        int arquivo;
        int origem;
        int destino;
        int opcao2;
        int labirinto;
        Scanner entrada = new Scanner(System.in);

        do {
            menuIterativo();
            opcao = entrada.nextInt();

            switch (opcao) {
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
                    destino = entrada.nextInt();

                    if (arquivo == 1) {
                        System.out.println("\nEstamos quase lá! \nSelecione o algoritmo que você deseja usar: ");
                        System.out.println("1 - Bellman-Ford");
                        System.out.println("2 - Bellman-Ford Melhorado");
                        System.out.println("3 - Dijkstra");
                        System.out.println("4 - Floyd Warshall");
                        opcao2 = entrada.nextInt();

                        if (opcao2 == 1) {
                            graphList recebaaa = new graphList(
                                    "C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\facebook_combined.txt");
                            System.out.println("\nAqui está o seu resultado:\n");
                            recebaaa.Bellman_Ford(origem, destino);
                        } else if (opcao2 == 2) {
                            graphList recebaaa = new graphList(
                                    "C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\facebook_combined.txt");
                            System.out.println("\nAqui está o seu resultado:\n");
                            recebaaa.Bellman_Ford_Melhorado(origem, destino);
                        } else if (opcao2 == 3) {
                            graphList recebaaa = new graphList(
                                    "C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\facebook_combined.txt");
                            System.out.println("\nAqui está o seu resultado:\n");
                            recebaaa.Dijkstra(origem, destino);
                        } else if (opcao2 == 4) {
                            graphMatrix recebaaa = new graphMatrix(
                                    "C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\facebook_combined.txt");
                            System.out.println("\nAqui está o seu resultado:\n");
                            recebaaa.floydWarshall(origem, destino);
                        }

                    } else if (arquivo == 2) {
                        System.out.println("\nEstamos quase lá! \nSelecione o algoritmo que você deseja usar: ");
                        System.out.println("1 - Bellman-Ford");
                        System.out.println("2 - Bellman-Ford Melhorado");
                        System.out.println("3 - Dijkstra");
                        System.out.println("4 - Floyd Warshall");
                        opcao2 = entrada.nextInt();

                        if (opcao2 == 1) {
                            graphList recebaaa = new graphList(
                                    "C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\rg300_4730.txt");
                            System.out.println("\nAqui está o seu resultado:\n");
                            recebaaa.Bellman_Ford(origem, destino);
                        } else if (opcao2 == 2) {
                            graphList recebaaa = new graphList(
                                    "C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\rg300_4730.txt");
                            System.out.println("\nAqui está o seu resultado:\n");
                            recebaaa.Bellman_Ford_Melhorado(origem, destino);
                        } else if (opcao2 == 3) {
                            graphList recebaaa = new graphList(
                                    "C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\rg300_4730.txt");
                            System.out.println("\nAqui está o seu resultado:\n");
                            recebaaa.Dijkstra(origem, destino);
                        } else if (opcao2 == 4) {
                            graphMatrix recebaaa = new graphMatrix(
                                    "C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\rg300_4730.txt");
                            System.out.println("\nAqui está o seu resultado:\n");
                            recebaaa.floydWarshall(origem, destino);
                        }

                    } else if (arquivo == 3) {
                        System.out.println("\nEstamos quase lá! \nSelecione o algoritmo que você deseja usar: ");
                        System.out.println("1 - Bellman-Ford");
                        System.out.println("2 - Bellman-Ford Melhorado");
                        System.out.println("3 - Dijkstra");
                        System.out.println("4 - Floyd Warshall");
                        opcao2 = entrada.nextInt();

                        if (opcao2 == 1) {
                            graphList recebaaa = new graphList(
                                    "C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\rome99c.txt");
                            System.out.println("\nAqui está o seu resultado:\n");
                            recebaaa.Bellman_Ford(origem, destino);
                        } else if (opcao2 == 2) {
                            graphList recebaaa = new graphList(
                                    "C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\rome99c.txt");
                            System.out.println("\nAqui está o seu resultado:\n");
                            recebaaa.Bellman_Ford_Melhorado(origem, destino);
                        } else if (opcao2 == 3) {
                            graphList recebaaa = new graphList(
                                    "C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\rome99c.txt");
                            System.out.println("\nAqui está o seu resultado:\n");
                            recebaaa.Dijkstra(origem, destino);
                        } else if (opcao2 == 4) {
                            graphMatrix recebaaa = new graphMatrix(
                                    "C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\rome99c.txt");
                            System.out.println("\nAqui está o seu resultado:\n");
                            recebaaa.floydWarshall(origem, destino);
                        }

                    } else if (arquivo == 4) {
                        System.out.println("\nEstamos quase lá! \nSelecione o algoritmo que você deseja usar: ");
                        System.out.println("1 - Bellman-Ford");
                        System.out.println("2 - Bellman-Ford Melhorado");
                        System.out.println("3 - Dijkstra");
                        System.out.println("4 - Floyd Warshall");
                        opcao2 = entrada.nextInt();

                        if (opcao2 == 1) {
                            graphList recebaaa = new graphList(
                                    "C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\toy.txt");
                            System.out.println("\nAqui está o seu resultado:\n");
                            recebaaa.Bellman_Ford(origem, destino);
                        } else if (opcao2 == 2) {
                            graphList recebaaa = new graphList(
                                    "C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\toy.txt");
                            System.out.println("\nAqui está o seu resultado:\n");
                            recebaaa.Bellman_Ford_Melhorado(origem, destino);
                        } else if (opcao2 == 3) {
                            graphList recebaaa = new graphList(
                                    "C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\toy.txt");
                            System.out.println("\nAqui está o seu resultado:\n");
                            recebaaa.Dijkstra(origem, destino);
                        } else if (opcao2 == 4) {
                            graphMatrix recebaaa = new graphMatrix(
                                    "C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\toy.txt");
                            System.out.println("\nAqui está o seu resultado:\n");
                            recebaaa.floydWarshall(origem, destino);
                        }

                    } else if (arquivo == 5) {
                        System.out.println("\nEstamos quase lá! \nSelecione o algoritmo que você deseja usar: ");
                        System.out.println("1 - Bellman-Ford");
                        System.out.println("2 - Bellman-Ford Melhorado");
                        System.out.println("3 - Dijkstra");
                        System.out.println("4 - Floyd Warshall");
                        opcao2 = entrada.nextInt();

                        if (opcao2 == 1) {
                            graphList recebaaa = new graphList(
                                    "C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\USA-road-dt.DC.txt.txt");
                            System.out.println("\nAqui está o seu resultado:\n");
                            recebaaa.Bellman_Ford(origem, destino);
                        } else if (opcao2 == 2) {
                            graphList recebaaa = new graphList(
                                    "C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\USA-road-dt.DC.txt.txt");
                            System.out.println("\nAqui está o seu resultado:\n");
                            recebaaa.Bellman_Ford_Melhorado(origem, destino);
                        } else if (opcao2 == 3) {
                            graphList recebaaa = new graphList(
                                    "C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\USA-road-dt.DC.txt.txt");
                            System.out.println("\nAqui está o seu resultado:\n");
                            recebaaa.Dijkstra(origem, destino);
                        } else if (opcao2 == 4) {
                            graphMatrix recebaaa = new graphMatrix(
                                    "C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\USA-road-dt.DC.txt.txt");
                            System.out.println("\nAqui está o seu resultado:\n");
                            recebaaa.floydWarshall(origem, destino);
                        }

                    } else if (arquivo == 6) {
                        System.out.println("\nEstamos quase lá! \nSelecione o algoritmo que você deseja usar: ");
                        System.out.println("1 - Bellman-Ford");
                        System.out.println("2 - Bellman-Ford Melhorado");
                        System.out.println("3 - Dijkstra");
                        System.out.println("4 - Floyd Warshall");
                        opcao2 = entrada.nextInt();

                        if (opcao2 == 1) {
                            graphList recebaaa = new graphList(
                                    "C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\USA-road-dt.NY.txt.txt");
                            System.out.println("\nAqui está o seu resultado:\n");
                            recebaaa.Bellman_Ford(origem, destino);
                        } else if (opcao2 == 2) {
                            graphList recebaaa = new graphList(
                                    "C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\USA-road-dt.NY.txt.txt");
                            System.out.println("\nAqui está o seu resultado:\n");
                            recebaaa.Bellman_Ford_Melhorado(origem, destino);
                        } else if (opcao2 == 3) {
                            graphList recebaaa = new graphList(
                                    "C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\USA-road-dt.NY.txt.txt");
                            System.out.println("\nAqui está o seu resultado:\n");
                            recebaaa.Dijkstra(origem, destino);
                        } else if (opcao2 == 4) {
                            graphMatrix recebaaa = new graphMatrix(
                                    "C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\cm\\USA-road-dt.NY.txt.txt");
                            System.out.println("\nAqui está o seu resultado:\n");
                            recebaaa.floydWarshall(origem, destino);
                        }
                    }

                    break;

                case 2:
                    System.out.println("=====================================\n");
                    System.out.println("Labirinto\n");

                    System.out.println("1 - maze3_blocks.txt");
                    System.out.println("2 - maze3.txt");
                    System.out.println("3 - maze10_blocks.txt");
                    System.out.println("4 - maze10.txt");
                    System.out.println("5 - maze20_blocks.txt");
                    System.out.println("6 - maze20.txt");
                    System.out.println("7 - maze30_blocks.txt");
                    System.out.println("8 - maze30.txt");
                    System.out.println("9 - maze40_blocks.txt");
                    System.out.println("10 - maze40.txt");
                    System.out.println("11 - maze50_blocks.txt");
                    System.out.println("12 - maze50.txt");
                    System.out.println("13 - toy.txt");
                    System.out.println("\nSelecione o labirinto que você deseja usar: ");

                    labirinto = entrada.nextInt();

                    if (labirinto == 1) {
                        String path = ("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\maze\\maze3_blocks.txt");
                        BufferedReader br = null;
                        FileReader fr = null;
                        System.out.println("\n");
                        try {
                            fr = new FileReader(path);
                            br = new BufferedReader(fr);
                            String line = br.readLine();
                            while (line != null) {
                                System.out.println(line);
                                line = br.readLine();
                            }
                        } catch (IOException e) {
                            System.out.println("ERROR:");
                        }
                        System.out.println("\n");

                    } else if (labirinto == 2) {
                        String path = ("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\maze\\maze3.txt");
                        BufferedReader br = null;
                        FileReader fr = null;
                        System.out.println("\n");
                        try {
                            fr = new FileReader(path);
                            br = new BufferedReader(fr);
                            String line = br.readLine();
                            while (line != null) {
                                System.out.println(line);
                                line = br.readLine();
                            }
                        } catch (IOException e) {
                            System.out.println("ERROR:");
                        }
                        System.out.println("\n");

                    } else if (labirinto == 3) {
                        String path = ("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\maze\\maze10_blocks.txt");
                        BufferedReader br = null;
                        FileReader fr = null;
                        System.out.println("\n");
                        try {
                            fr = new FileReader(path);
                            br = new BufferedReader(fr);
                            String line = br.readLine();
                            while (line != null) {
                                System.out.println(line);
                                line = br.readLine();
                            }
                        } catch (IOException e) {
                            System.out.println("ERROR:");
                        }
                        System.out.println("\n");

                    } else if (labirinto == 4) {
                        String path = ("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\maze\\maze10.txt");
                        BufferedReader br = null;
                        FileReader fr = null;
                        System.out.println("\n");
                        try {
                            fr = new FileReader(path);
                            br = new BufferedReader(fr);
                            String line = br.readLine();
                            while (line != null) {
                                System.out.println(line);
                                line = br.readLine();
                            }
                        } catch (IOException e) {
                            System.out.println("ERROR:");
                        }
                        System.out.println("\n");

                    } else if (labirinto == 5) {
                        String path = ("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\maze\\maze20_blocks.txt");
                        BufferedReader br = null;
                        FileReader fr = null;
                        System.out.println("\n");
                        try {
                            fr = new FileReader(path);
                            br = new BufferedReader(fr);
                            String line = br.readLine();
                            while (line != null) {
                                System.out.println(line);
                                line = br.readLine();
                            }
                        } catch (IOException e) {
                            System.out.println("ERROR:");
                        }
                        System.out.println("\n");

                    } else if (labirinto == 6) {
                        String path = ("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\maze\\maze20.txt");
                        BufferedReader br = null;
                        FileReader fr = null;
                        System.out.println("\n");
                        try {
                            fr = new FileReader(path);
                            br = new BufferedReader(fr);
                            String line = br.readLine();
                            while (line != null) {
                                System.out.println(line);
                                line = br.readLine();
                            }
                        } catch (IOException e) {
                            System.out.println("ERROR:");
                        }
                        System.out.println("\n");

                    } else if (labirinto == 7) {
                        String path = ("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\maze\\maze30_blocks.txt");
                        BufferedReader br = null;
                        FileReader fr = null;
                        System.out.println("\n");
                        try {
                            fr = new FileReader(path);
                            br = new BufferedReader(fr);
                            String line = br.readLine();
                            while (line != null) {
                                System.out.println(line);
                                line = br.readLine();
                            }
                        } catch (IOException e) {
                            System.out.println("ERROR:");
                        }
                        System.out.println("\n");

                    } else if (labirinto == 8) {
                        String path = ("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\maze\\maze30.txt");
                        BufferedReader br = null;
                        FileReader fr = null;
                        System.out.println("\n");
                        try {
                            fr = new FileReader(path);
                            br = new BufferedReader(fr);
                            String line = br.readLine();
                            while (line != null) {
                                System.out.println(line);
                                line = br.readLine();
                            }
                        } catch (IOException e) {
                            System.out.println("ERROR:");
                        }
                        System.out.println("\n");

                    } else if (labirinto == 9) {
                        String path = ("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\maze\\maze40_blocks.txt");
                        BufferedReader br = null;
                        FileReader fr = null;
                        System.out.println("\n");
                        try {
                            fr = new FileReader(path);
                            br = new BufferedReader(fr);
                            String line = br.readLine();
                            while (line != null) {
                                System.out.println(line);
                                line = br.readLine();
                            }
                        } catch (IOException e) {
                            System.out.println("ERROR:");
                        }
                        System.out.println("\n");

                    } else if (labirinto == 10) {
                        String path = ("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\maze\\maze40.txt");
                        BufferedReader br = null;
                        FileReader fr = null;
                        System.out.println("\n");
                        try {
                            fr = new FileReader(path);
                            br = new BufferedReader(fr);
                            String line = br.readLine();
                            while (line != null) {
                                System.out.println(line);
                                line = br.readLine();
                            }
                        } catch (IOException e) {
                            System.out.println("ERROR:");
                        }
                        System.out.println("\n");

                    } else if (labirinto == 11) {
                        String path = ("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\maze\\maze50_blocks.txt");
                        BufferedReader br = null;
                        FileReader fr = null;
                        System.out.println("\n");
                        try {
                            fr = new FileReader(path);
                            br = new BufferedReader(fr);
                            String line = br.readLine();
                            while (line != null) {
                                System.out.println(line);
                                line = br.readLine();
                            }
                        } catch (IOException e) {
                            System.out.println("ERROR:");
                        }
                        System.out.println("\n");

                    } else if (labirinto == 12) {
                        String path = ("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\maze\\maze50.txt");
                        BufferedReader br = null;
                        FileReader fr = null;
                        System.out.println("\n");
                        try {
                            fr = new FileReader(path);
                            br = new BufferedReader(fr);
                            String line = br.readLine();
                            while (line != null) {
                                System.out.println(line);
                                line = br.readLine();
                            }
                        } catch (IOException e) {
                            System.out.println("ERROR:");
                        }
                        System.out.println("\n");

                    } else if (labirinto == 13) {
                        String path = ("C:\\Users\\guilh\\OneDrive\\Documentos\\Faculdade\\Períodos\\3º Período\\AEDS III\\Codes\\GraphAlgorithms\\maze\\toy.txt");
                        BufferedReader br = null;
                        FileReader fr = null;
                        System.out.println("\n");

                        try {
                            fr = new FileReader(path);
                            br = new BufferedReader(fr);
                            String line = br.readLine();
                            while (line != null) {
                                System.out.println(line);
                                line = br.readLine();
                            }
                        } catch (IOException e) {
                            System.out.println("ERROR:");
                        }
                        System.out.println("\n");


                    }
                    break;

                default:
                    System.out.println("Obrigado! (Ajuda nós, George!!! :) )");
            }

        } while (opcao != 3);

        entrada.close();
    }
}