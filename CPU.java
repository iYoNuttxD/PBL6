public class CPU extends Produto {
    private String tipo;
    private int velocidade;
    private int threads;
    private int tdp;
    private String gpus;
    private int nucleos;
    private float frequencia;
    private String soquete;

    public CPU(String tipo, int velocidade, int threads, int tdp, String gpus, int nucleos,
               float frequencia,String soquete, String descricao, float preco, String tipoP, String marca, String modelo,
               int cod_Produto){
        super(marca, tipoP, modelo, descricao, preco, cod_Produto);
        this.tipo = tipo;
        this.velocidade = velocidade;
        this.threads = threads;
        this.tdp = tdp;
        this.gpus = gpus;
        this.nucleos = nucleos;
        this.frequencia = frequencia;
        this.soquete = soquete;
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
