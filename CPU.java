package PBL6;

import java.util.ArrayList;

public class CPU extends Produto {
    private String tipo;
    private int velocidade;
    private int threads;
    private int tdp;
    private String gpus;
    private int nucleos;
    private float frequencia;
    private String soquete;
    private static ArrayList<CPU> cpus = new ArrayList<CPU>();

    public CPU(String tipo, int velocidade, int threads, int tdp, String gpus, int nucleos,
               float frequencia,String soquete, String descricao, float preco, String marca, String modelo,
               int cod_Produto){
        super(marca, modelo, descricao, preco, cod_Produto);
        this.tipo = tipo;
        this.velocidade = velocidade;
        this.threads = threads;
        this.tdp = tdp;
        this.gpus = gpus;
        this.nucleos = nucleos;
        this.frequencia = frequencia;
        this.soquete = soquete;
    }

    public static void visualizarEstoqueCPU() {
        int i = 1;
        for (CPU cpuItem : cpus) {
            System.out.println(i + "// " +  cpuItem);
            i++;
        }
    }

    public static boolean verificarCod_ProdutoCPU(int Cod_Produto) {
        for (CPU cpu : cpus) {
            if (cpu.getCod_Produto() == Cod_Produto) {
                System.out.println(cpu);
                return true; // O código de produto já está cadastrado
            }
        }
        return false; // O código de produto não está cadastrado
    }

    public void adicionarEstoqueCPU(CPU cpu){
        cpus.add(cpu);
    }

    public static void removerCPU(int cod_Produto) {
        for (int i = 0; i < cpus.size(); i++) {
            CPU cpu = cpus.get(i);
            if (cpu.getCod_Produto() == cod_Produto) {
                cpus.remove(i); // Remove a CPU da lista
                break;
            }
        }
    }

    @Override
    public String toString(){
        return super.toString() +
                ", Núcleos: " + nucleos +
                ", Threads: " + threads +
                ", Frequência: " + frequencia +
                ", Soquete: " + soquete +
                ", TDP: " + tdp +
                ", Gráficos Integrados: " + gpus +
                ", Velocidade da Memória compatível: " + velocidade +
                ", Tipo de Memória compatível: " + tipo;
    }


    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public int getVelocidade(){
        return velocidade;
    }

    public void setVelocidade(int velocidade){
        this.velocidade = velocidade;
    }

    public int getThreads(){
        return threads;
    }

    public void setThreads(int threads){
        this.threads = threads;
    }

    public int getTdp(){
        return tdp;
    }

    public void setTdp(int tdp){
        this.tdp = tdp;
    }

    public int getNucleos(){
        return nucleos;
    }

    public void setNucleos(int nucleos){
        this.nucleos = nucleos;
    }

    public String getGpus(){
        return gpus;
    }

    public void setGpus(String gpus){
        this.gpus = gpus;
    }

    public String getSoquete(){
        return soquete;
    }

    public void setSoquete(String soquete){
        this.soquete = soquete;
    }

    public float getFrequencia(){
        return frequencia;
    }

    public void setFrequencia(float frequencia){
        this.frequencia = frequencia;
    }
}
