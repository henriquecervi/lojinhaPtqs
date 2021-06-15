package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

import java.util.List;

public class Produto {
    // String nome; variável
    private String nome; //atributo
    private String marca;
    protected double valor; // só pode ser alterado dentro dessa classe, vamos encapsular
    private Tamanho tamanho;
    private List<ItemIncluso> itensInclusos;

    public Produto(String marcaInicial, Tamanho tamanhoInicial) {
        // construtor
        this.marca = marcaInicial;
        this.tamanho = tamanhoInicial;
    }

    public double getValor() {
        // método
        return this.valor;
    }

    public void setValor(double novoValor) { //void pois não temos que retornar nada
        if (novoValor > 0) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException("Valores devem ser maiores que zero (0)");
        }
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }

    public Tamanho getTamanho() {
        return this.tamanho;
    }

    // uma forma utilizando o equalsIgnoreCase
//    public void setTamanho(String novoTamanho) {
//        if (novoTamanho.equalsIgnoreCase("Pequeno") ||
//                novoTamanho.equalsIgnoreCase("Grande") ||
//                novoTamanho.equalsIgnoreCase("Médio")) {
//            this.tamanho = novoTamanho;
//        } else {
//            throw new IllegalArgumentException("O tamanho deve ser Pequeno, Médio ou Grande.");
//        }
//    }

    public void setTamanho(Tamanho novoTamanho) {
        this.tamanho = novoTamanho;
    }

    public List<ItemIncluso> getItensInclusos() {
        return this.itensInclusos;
    }

    public void setItensInclusos(List<ItemIncluso> novosItensInclusos) {
        this.itensInclusos = novosItensInclusos;
    }
}
