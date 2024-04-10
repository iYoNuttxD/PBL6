package PBL6;

import java.util.Scanner;

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
                    if (!Produto.verificarCod_Produto(cod_Produto)) {
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

                        Produto produto = new Produto(marca, modelo, descricao, preco, cod_Produto);
                        Produto.adicionarEstoqueProduto(produto);

                        CPU cpu = new CPU(tipo, velocidade, threads, tdp, gpus, nucleos,
                                frequencia, soquete, descricao, preco, marca, modelo, cod_Produto);
                        cpu.adicionarEstoqueCPU(cpu);
                    } else {
                        System.out.println("Produto já cadastrado!!!");
                    }
                } else if (opcao == 2) {
                    System.out.println("Digite o código do produto: ");
                    int cod_Produto = Integer.parseInt(scanner.nextLine());
                    if (!Produto.verificarCod_Produto(cod_Produto)) {
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

                        Produto produto = new Produto(marca, modelo, descricao, preco, cod_Produto);
                        Produto.adicionarEstoqueProduto(produto);

                        GPU gpu = new GPU(marca, modelo, descricao, preco, pcie, nucleos, capacidade, velocidade, tipo,
                                tdp, slot, tamanho, conector, cod_Produto);
                        gpu.adicionarEstoqueGPU(gpu);
                    } else {
                        System.out.println("Produto já cadastrado!!!");
                    }
                } else if (opcao == 3) {
                    System.out.println("Digite o código do produto: ");
                    int cod_Produto = Integer.parseInt(scanner.nextLine());
                    if (!Produto.verificarCod_Produto(cod_Produto)) {
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

                        Produto produto = new Produto(marca, modelo, descricao, preco, cod_Produto);
                        Produto.adicionarEstoqueProduto(produto);

                        Placa_Mae placaMae = new Placa_Mae(tipo, velocidade, pcie, m2, sata, tamanho, soquete, chipset,
                                descricao, preco, marca, modelo, cod_Produto);
                        placaMae.adicionarEstoquePM(placaMae);
                    } else {
                        System.out.println("Produto já cadastrado!!!");
                    }
                } else if (opcao == 4) {
                    System.out.println("Digite o código do produto: ");
                    int cod_Produto = Integer.parseInt(scanner.nextLine());
                    if (!Produto.verificarCod_Produto(cod_Produto)) {
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

                        Produto produto = new Produto(marca, modelo, descricao, preco, cod_Produto);
                        Produto.adicionarEstoqueProduto(produto);

                        RAM ram = new RAM(preco, capacidade, tipo, marca, modelo, descricao, velocidade, cod_Produto);
                        ram.adicionarEstoqueRAM(ram);
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
            while (true){
                if (!Produto.verificarLista()) {
                    Scanner scanner = new Scanner(System.in);
                    System.out.println("---------- Descadastrar Produto ----------");
                    System.out.println("O que você deseja fazer?");
                    System.out.println("1. Descadastrar Produto");
                    System.out.println("0. Sair");
                    int opcao = Integer.parseInt(scanner.nextLine());
                    if (opcao == 1){
                        System.out.println("Informe o código do produto que deseja remover: ");
                        int cod_Produto = Integer.parseInt(scanner.nextLine());
                        if (Produto.verificarCod_Produto(cod_Produto)){
                            if(CPU.verificarCod_ProdutoCPU(cod_Produto)){
                                System.out.println("Digite 1 para confirmar a exclusão: ");
                                int opcao1 = Integer.parseInt(scanner.nextLine());
                                if (opcao1 == 1){
                                    CPU.removerCPU(cod_Produto);
                                    System.out.println("CPU removida com sucesso!");
                                }
                            } else if (GPU.verificarCod_ProdutoGPU(cod_Produto)){
                                System.out.println("Digite 1 para confirmar a exclusão: ");
                                int opcao1 = Integer.parseInt(scanner.nextLine());
                                if (opcao1 == 1){
                                    GPU.removerGPU(cod_Produto);
                                    System.out.println("GPU removida com sucesso!");
                                }
                            } else if (Placa_Mae.verificarCod_ProdutoPM(cod_Produto)){
                                System.out.println("Digite 1 para confirmar a exclusão: ");
                                int opcao1 = Integer.parseInt(scanner.nextLine());
                                if (opcao1 == 1){
                                    Placa_Mae.removerPM(cod_Produto);
                                    System.out.println("Placa mãe removida com sucesso!");
                                }
                            } else {
                                System.out.println("Digite 1 para confirmar a exclusão: ");
                                int opcao1 = Integer.parseInt(scanner.nextLine());
                                if (opcao1 == 1){
                                    RAM.removerRAM(cod_Produto);
                                    System.out.println("Memória RAM removida com sucesso!");
                                }
                            }
                        } else {
                            System.out.println("Produto não encontrado.");
                        }
                    } else if (opcao == 0) {
                        break;
                    } else {
                        System.out.println("Opção inválida!!!");
                    }
                } else {
                    System.out.println("Nenhum produto está cadastrado!");
                    break;
                }
            }

        } catch (Exception e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }

    public static void visualizarEstoque() {
        while (true){
            try {
                if(!Produto.verificarLista()){
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
                        CPU.visualizarEstoqueCPU();
                    } else if (opcao == 2){
                        GPU.visualizarEstoqueGPU();
                    } else if (opcao == 3) {
                        Placa_Mae.visualizarEstoquePlacaMae();
                    } else if (opcao == 4){
                        RAM.visualizarEstoqueRAM();
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
}
