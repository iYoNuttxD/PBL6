package PBL6;


public class RAM extends Produto {
    private int capacidade;
    private String tipo;
    private int velocidade;

    public RAM(float preco, int capacidade, String tipo, String marca, String modelo, String descricao, int velocidade,
               int cod_Produto, String tipoP) {
        super(marca, tipoP, modelo, descricao, preco, cod_Produto);
        this.velocidade = velocidade;
        this.capacidade = capacidade;
        this.tipo = tipo;
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
