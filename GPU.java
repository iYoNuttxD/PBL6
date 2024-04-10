package PBL6;

import java.util.ArrayList;

public class GPU extends Produto {
    private String pcie;
    private int nucleos;
    private int tam_Mem;
    private int vel_Mem;
    private String tipo_Mem;
    private int tdp;
    private int slot;
    private int tamanho;
    private String conector;
    private static ArrayList<GPU> gpus = new ArrayList<GPU>();

    public GPU(String marca, String modelo, String descricao, float preco, String pcie, int nucleos,
               int tam_Mem, int vel_Mem, String tipo_Mem, int tdp, int slot, int tamanho, String conector,
               int cod_Produto){
        super(marca, modelo, descricao, preco, cod_Produto);
        this.pcie = pcie;
        this.nucleos = nucleos;
        this.tam_Mem = tam_Mem;
        this.vel_Mem = vel_Mem;
        this.tipo_Mem = tipo_Mem;
        this.tdp = tdp;
        this.slot = slot;
        this.tamanho = tamanho;
        this.conector = conector;

    }

    public static void visualizarEstoqueGPU() {
        int i = 1;
        for (GPU gpuItem : gpus) {
            System.out.println(i + "// " +  gpuItem);
            i++;
        }
    }

    public static boolean verificarCod_ProdutoGPU(int Cod_Produto) {
        for (GPU gpu : gpus) {
            if (gpu.getCod_Produto() == Cod_Produto) {
                System.out.println(gpu);
                return true; // O código de produto já está cadastrado
            }
        }
        return false; // O código de produto não está cadastrado
    }

    public void adicionarEstoqueGPU(GPU gpu){
        gpus.add(gpu);
    }

    public static void removerGPU(int cod_Produto) {
        for (int i = 0; i < gpus.size(); i++) {
            GPU gpu = gpus.get(i);
            if (gpu.getCod_Produto() == cod_Produto) {
                gpus.remove(i); // Remove a CPU da lista
                break;
            }
        }
    }


    @Override
    public String toString() {
        return super.toString() +
                ", Núcleos: " + nucleos +
                ", Tamanho da Memória: " + tam_Mem +
                ", Velocidade da Memória: " + vel_Mem +
                ", Tipo de Memória: " + tipo_Mem +
                ", TDP: " + tdp +
                ", Conector: " + conector +
                ", PCIe: " + pcie +
                ", Slot: " + slot +
                ", Tamanho: " + tamanho;
    }

    public String getPcie(){
        return pcie;
    }
    public int getNucleos(){
        return nucleos;
    }

    public int getTam_Mem(){
        return tam_Mem;
    }

    public int getVel_Mem(){
        return  vel_Mem;
    }

    public String getTipo_Mem(){
        return tipo_Mem;
    }

    public int getTdp(){
        return tdp;
    }

    public int getSlot() {
        return slot;
    }

    public int getTamanho() {
        return tamanho;
    }

    public String getConector(){
        return conector;
    }

    public void setPcie(String pcie){
        this.pcie = pcie;
    }

    public void setNucleos(int nucleos){
        this.nucleos = nucleos;
    }

    public void setTam_Mem(int tam_Mem){
        this.tam_Mem= tam_Mem;
    }

    public void setVel_Mem(int vel_Mem){
        this.vel_Mem = vel_Mem;
    }

    public void setTipo_Mem(String tipo_Mem){
        this.tipo_Mem = tipo_Mem;
    }

    public void setTdp(int tdp){
        this.tdp = tdp;
    }

    public void setSlot(int slot){
        this.slot = slot;
    }

    public void setTamanho(int tamanho){
        this.tamanho = tamanho;
    }

    public void setConector(String conector){
        this.conector = conector;
    }
}
