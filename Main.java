import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        System.out.println("Equipe: Daniel Ganz Musse, João Vitor de Souza Hernandes, " +
                "Pedro Henrique Silva Cabral, Fabio Augusto Gortz");
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("---------- Menu Inicial ----------");
                System.out.println("O que você deseja fazer?");
                System.out.println("1. Cadastrar Produto");
                System.out.println("2. Descadastrar Produto");
                System.out.println("3. Visualizar Estoque");
                System.out.println("0. Sair");
                int opcao = Integer.parseInt(scanner.nextLine());
                if (opcao == 1) {
                    adicionarProduto();
                } else if (opcao == 2){
                    removerProduto();
                } else if (opcao == 3) {
                    visualizarEstoque();
                } else if (opcao == 0){
                    System.out.println("Obrigado por usar o sistema!!!");
                    break;
                } else {
                    System.out.println("Opção inválida!!!");
                }
            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
            }
        }
    }

    public static void adicionarProduto(){
        while (true) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("---------- Cadastrar Produto ----------");
                System.out.println("Qual produto deseja cadastrar?");
                System.out.println("1. CPU");
                System.out.println("2. GPU");
                System.out.println("3. Placa Mãe");
                System.out.println("4. Memóriam RAM");
                System.out.println("0. Sair");
                int opcao = Integer.parseInt(scanner.nextLine());
                if (opcao == 1) {
                    System.out.println("Digite o código do produto: ");
                    int cod_Produto = Integer.parseInt(scanner.nextLine());
                    if (verificarCod_Produto(cod_Produto, listaProdutos)) {
                        System.out.println("Digite a marca: ");
                        String marca = scanner.nextLine();
                        System.out.println("Digite o modelo: ");
                        String modelo = scanner.nextLine();
                        System.out.println("Digite a descrição: ");
                        String descricao = scanner.nextLine();
                        System.out.println("Digite o preço: ");
                        float preco = Float.parseFloat(scanner.nextLine());
                        System.out.println("Digite o número de núcleos: ");
                        int nucleos = Integer.parseInt(scanner.nextLine());
                        System.out.println("Digite o número de threads: ");
                        int threads = Integer.parseInt(scanner.nextLine());
                        System.out.println("Digite a frequência: ");
                        float frequencia = Float.parseFloat(scanner.nextLine());
                        System.out.println("Digite o TDP: ");
                        int tdp = Integer.parseInt(scanner.nextLine());
                        System.out.println("Digite o soquete: ");
                        String soquete = scanner.nextLine();
                        System.out.println("Digite o tipo da memória compatível: ");
                        String tipo = scanner.nextLine();
                        System.out.println("Digite a velocidade da memória compatível: ");
                        int velocidade = Integer.parseInt(scanner.nextLine());
                        System.out.println("Digite as GPUs: ");
                        String gpus = scanner.nextLine();
                        System.out.println("CPU cadastrada com sucesso!");
                        String tipoP = "CPU";

                        Produto cpu = new CPU(tipo, velocidade, threads, tdp, gpus, nucleos,
                                frequencia, soquete, descricao, preco, marca, modelo, tipoP, cod_Produto);
                        cpu.adicionarEstoque(listaProdutos);
                    } else {
                        System.out.println("Produto já cadastrado!!!");
                    }
                } else if (opcao == 2) {
                    System.out.println("Digite o código do produto: ");
                    int cod_Produto = Integer.parseInt(scanner.nextLine());
                    if (verificarCod_Produto(cod_Produto, listaProdutos)) {
                        System.out.println("Digite a marca: ");
                        String marca = scanner.nextLine();
                        System.out.println("Digite o modelo: ");
                        String modelo = scanner.nextLine();
                        System.out.println("Digite a descrição: ");
                        String descricao = scanner.nextLine();
                        System.out.println("Digite o preço: ");
                        float preco = Float.parseFloat(scanner.nextLine());
                        System.out.println("Digite o número de núcleos: ");
                        int nucleos = Integer.parseInt(scanner.nextLine());
                        System.out.println("Digite o tipo da memória: ");
                        String tipo = scanner.nextLine();
                        System.out.println("Digite a capacidade da memória: ");
                        int capacidade = Integer.parseInt(scanner.nextLine());
                        System.out.println("Digite a velocidade da memória: ");
                        int velocidade = Integer.parseInt(scanner.nextLine());
                        System.out.println("Digite o TDP: ");
                        int tdp = Integer.parseInt(scanner.nextLine());
                        System.out.println("Digite o PCIe: ");
                        String pcie = scanner.nextLine();
                        System.out.println("Digite o slot: ");
                        int slot = Integer.parseInt(scanner.nextLine());
                        System.out.println("Digite o tamanho: ");
                        int tamanho = Integer.parseInt(scanner.nextLine());
                        System.out.println("Digite o conector: ");
                        String conector = scanner.nextLine();
                        System.out.println("GPU cadastrada com sucesso!");
                        String tipoP = "GPU";

                        Produto gpu = new GPU(marca, modelo, descricao, preco, pcie, nucleos, capacidade, velocidade, tipo,
                                tdp, slot, tamanho, conector, cod_Produto, tipoP);
                        gpu.adicionarEstoque(listaProdutos);
                    } else {
                        System.out.println("Produto já cadastrado!!!");
                    }
                } else if (opcao == 3) {
                    System.out.println("Digite o código do produto: ");
                    int cod_Produto = Integer.parseInt(scanner.nextLine());
                    if (verificarCod_Produto(cod_Produto, listaProdutos)) {
                        System.out.println("Digite a marca: ");
                        String marca = scanner.nextLine();
                        System.out.println("Digite o modelo: ");
                        String modelo = scanner.nextLine();
                        System.out.println("Digite a descrição: ");
                        String descricao = scanner.nextLine();
                        System.out.println("Digite o preço: ");
                        float preco = Float.parseFloat(scanner.nextLine());
                        System.out.println("Digite o chipset: ");
                        String chipset = scanner.nextLine();
                        System.out.println("Digite o soquete: ");
                        String soquete = scanner.nextLine();
                        System.out.println("Digite o tipo da memória compatível: ");
                        String tipo = scanner.nextLine();
                        System.out.println("Digite a velocidade da memória compatível: ");
                        int velocidade = Integer.parseInt(scanner.nextLine());
                        System.out.println("Digite o PCIe: ");
                        String pcie = scanner.nextLine();
                        System.out.println("Digite a quantidade de M2: ");
                        int m2 = Integer.parseInt(scanner.nextLine());
                        System.out.println("Digite a quantidade de SATA: ");
                        int sata = Integer.parseInt(scanner.nextLine());
                        System.out.println("Digite o tamanho: ");
                        String tamanho = scanner.nextLine();
                        System.out.println("Placa mãe cadastrada com sucesso!");
                        String tipoP = "Placa_Mae";

                        Produto placaMae = new Placa_Mae(tipo, velocidade, pcie, m2, sata, tamanho, soquete, chipset,
                                descricao, preco, marca, modelo, cod_Produto, tipoP);
                        placaMae.adicionarEstoque(listaProdutos);
                    } else {
                        System.out.println("Produto já cadastrado!!!");
                    }
                } else if (opcao == 4) {
                    System.out.println("Digite o código do produto: ");
                    int cod_Produto = Integer.parseInt(scanner.nextLine());
                    if (verificarCod_Produto(cod_Produto, listaProdutos)) {
                        System.out.println("Digite a marca: ");
                        String marca = scanner.nextLine();
                        System.out.println("Digite o modelo: ");
                        String modelo = scanner.nextLine();
                        System.out.println("Digite a descrição: ");
                        String descricao = scanner.nextLine();
                        System.out.println("Digite o preço: ");
                        float preco = Float.parseFloat(scanner.nextLine());
                        System.out.println("Digite o tipo da memória: ");
                        String tipo = scanner.nextLine();
                        System.out.println("Digite a velocidade da memória: ");
                        int velocidade = Integer.parseInt(scanner.nextLine());
                        System.out.println("Digite a capacidade da memória: ");
                        int capacidade = Integer.parseInt(scanner.nextLine());
                        System.out.println("Memória RAM cadastrada com sucesso!");
                        String tipoP = "RAM";

                        Produto ram = new RAM(preco, capacidade, tipo, marca, modelo, descricao, velocidade,
                                cod_Produto, tipoP);
                        ram.adicionarEstoque(listaProdutos);
                    } else {
                        System.out.println("Produto já cadastrado!!!");
                    }
                } else if (opcao == 0) {
                    break;
                } else {
                    System.out.println("Opção inválida!!!");
                }
            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
            }
        }
    }

    public static void removerProduto(){
        try {
            if (verificarLista()) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Informe o código do produto que deseja remover: ");
                int cod_Produto = Integer.parseInt(scanner.nextLine());
                if (!verificarCod_Produto(cod_Produto, listaProdutos)){
                    descadastrarProduto(cod_Produto, listaProdutos);
                } else {
                    System.out.println("Produto não encontrado.");
                }
            } else {
                System.out.println("Nenhum produto está cadastrado!");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }

    public static void visualizarEstoque() {
        while (true){
            try {
                if(verificarLista()){
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("---------- Visualizar Estoque ----------");
                    System.out.println("Qual estoque deseja visualizar?");
                    System.out.println("1. CPU");
                    System.out.println("2. GPU");
                    System.out.println("3. Placa Mãe");
                    System.out.println("4. Memóriam RAM");
                    System.out.println("0. Sair");
                    int opcao = scanner.nextInt();
                    if (opcao == 1) {
                        visualizarEstoqueCPU();
                    } else if (opcao == 2){
                        visualizarEstoqueGPU();
                    } else if (opcao == 3) {
                        visualizarEstoquePlacaMae();
                    } else if (opcao == 4){
                        visualizarEstoqueRAM();
                    } else if (opcao == 0){
                        break;
                    } else {
                        System.out.println("Opção inválida!!!");
                    }
                } else {
                    System.out.println("Nenhum produto está cadastrado!");
                    break;
                }

            } catch (Exception e) {
                System.out.println("Ocorreu um erro: " + e.getMessage());
            }
        }
    }

    static ArrayList<Produto> listaProdutos = new ArrayList<>();

    public static void visualizarEstoqueCPU() {
        int i = 1;
        for (Produto produto : listaProdutos) {
            if (produto instanceof CPU) {
                System.out.println(i + "/ " +  produto);
                i++;
            }
        }
    }

    public static void visualizarEstoqueGPU() {
        int i = 1;
        for (Produto produto : listaProdutos) {
            if (produto instanceof GPU) {
                System.out.println(i + "/ " +  produto);
                i++;
            }
        }
    }

    public static void visualizarEstoquePlacaMae() {
        int i = 1;
        for (Produto produto : listaProdutos) {
            if (produto instanceof Placa_Mae) {
                System.out.println(i + "/ " +  produto);
                i++;
            }
        }
    }

    public static void visualizarEstoqueRAM() {
        int i = 1;
        for (Produto produto : listaProdutos) {
            if (produto instanceof RAM) {
                System.out.println(i + "/ " +  produto);
                i++;
            }
        }
    }

    public static boolean verificarLista(){
        return !listaProdutos.isEmpty();
    }

    public static void descadastrarProduto(int cod_Produto, ArrayList<Produto> listaProdutos) {
        for (int i = 0; i < listaProdutos.size(); i++) {
            if (listaProdutos.get(i).getCod_Produto() == cod_Produto) {
                listaProdutos.remove(i);
                System.out.println("Produto com código " + cod_Produto + " descadastrado.");
                break;
            }
        }
    }

    public static boolean verificarCod_Produto(int cod_Produto, ArrayList<Produto> listaProdutos) {
        for (Produto produto : listaProdutos) {
            if (produto.getCod_Produto() == cod_Produto) {
                return false; // O código de produto já está cadastrado
            }
        }
        return true; // O código de produto não está cadastrado
    }
}
