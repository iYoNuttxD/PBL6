package PBL6;

import java.util.ArrayList;

public class Produto {
    protected int cod_Produto;
    protected String tipoP;
    protected String marca;
    protected String modelo;
    protected String descricao;
    protected float preco;

    public Produto(String marca, String tipoP, String modelo, String descricao, float preco, int cod_Produto) {
        this.marca = marca;
        this.tipoP = tipoP;
        this.modelo = modelo;
        this.descricao = descricao;
        this.preco = preco;
        this.cod_Produto = cod_Produto;
    }

    public void adicionarEstoque(ArrayList<Produto> listaProdutos){
        listaProdutos.add(this);
    }

    @Override
    public String toString() {
        return "Marca: " + marca +
                ", Modelo: " + modelo +
                ", Descrição: " + descricao +
                ", Preço: " + preco +
                ", Código do Produto: " + cod_Produto;
    }

    public int getCod_Produto(){
        return cod_Produto;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public String getDescricao(){
        return descricao;
    }

    public float getPreco(){
        return preco;
    }

    public void setCod_Produto(int cod_Produto){
        this.cod_Produto = cod_Produto;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public void setPreco(float preco){
        this.preco = preco;
    }
}
