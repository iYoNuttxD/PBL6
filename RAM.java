package PBL6;

import java.util.ArrayList;

public class RAM extends Produto {
    private int capacidade;
    private String tipo;
    private int velocidade;
    private static ArrayList<RAM> rams = new ArrayList<RAM>();

    public RAM(float preco, int capacidade, String tipo, String marca, String modelo, String descricao, int velocidade,
               int cod_Produto) {
        super(marca, modelo, descricao, preco, cod_Produto);
        this.velocidade = velocidade;
        this.capacidade = capacidade;
        this.tipo = tipo;
    }

    public static void visualizarEstoqueRAM() {
        int i = 1;
        for (RAM ramItem : rams) {
            System.out.println(i + "// " +  ramItem);
            i++;
        }
    }

    public static boolean verificarCod_ProdutoRAM(int Cod_Produto) {
        for (RAM ram : rams) {
            if (ram.getCod_Produto() == Cod_Produto) {
                System.out.println(ram);
                return true; // O código de produto já está cadastrado
            }
        }
        return false; // O código de produto não está cadastrado
    }

    public void adicionarEstoqueRAM(RAM ram){
        rams.add(ram);
    }

    public static void removerRAM(int cod_Produto) {
        for (int i = 0; i < rams.size(); i++) {
            RAM ram = rams.get(i);
            if (ram.getCod_Produto() == cod_Produto) {
                rams.remove(i); // Remove a CPU da lista
                break;
            }
        }
    }

    @Override
    public String toString(){
        return super.toString() +
                ", Velocidade da Memória: " + velocidade +
                ", Tipo de Memória: " + tipo +
                ", Capacidade da Memória: " + capacidade;
    }


    public int getCapacidade() {
        return capacidade;
    }

    public String getTipo() {
        return tipo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

}
