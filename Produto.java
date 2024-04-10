package PBL6;

import java.util.ArrayList;

public class Produto {
    protected int cod_Produto;
    protected String marca;
    protected String modelo;
    protected String descricao;
    protected float preco;
    private static ArrayList<Produto> produtos = new ArrayList<Produto>();

    public Produto(String marca, String modelo, String descricao, float preco, int cod_Produto) {
        this.marca = marca;
        this.modelo = modelo;
        this.descricao = descricao;
        this.preco = preco;
        this.cod_Produto = cod_Produto;
    }

    public static boolean verificarLista(){
        if (produtos.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void adicionarEstoqueProduto(Produto produto){
        produtos.add(produto);
    }

    public static boolean verificarCod_Produto(int Cod_Produto) {
        for (Produto produto : produtos) {
            if (produto.getCod_Produto() == Cod_Produto) {
                return true; // O código de produto já está cadastrado
            }
        }
        return false; // O código de produto não está cadastrado
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
