package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Intel", Tamanho.MÉDIO);


//        System.out.println(meuProduto.getMarca());
//        System.out.println(meuProduto.getTamanho());
        meuProduto.setNome("Play Station 4");
        meuProduto.setValor(100.23);
        meuProduto.setMarca("Sony");
        meuProduto.setTamanho(Tamanho.PEQUENO);

        List<ItemIncluso> itensInclusos = new ArrayList<>();

        ItemIncluso primeiroItemIncluso = new ItemIncluso("Controle", 2);
        itensInclusos.add(primeiroItemIncluso);

        ItemIncluso segundoItemIncluso = new ItemIncluso("VR", 1);
        itensInclusos.add(segundoItemIncluso);

        ItemIncluso terceiroItemIncluso = new ItemIncluso("The Day Before", 190);
        itensInclusos.add(terceiroItemIncluso);

        meuProduto.setItensInclusos(itensInclusos);

//        System.out.println(meuProduto.getValor());
//        System.out.println(meuProduto.getNome());
//        System.out.println(meuProduto.getTamanho());
//        System.out.println(meuProduto.getItensInclusos());
//        System.out.println(meuProduto.getItensInclusos().get(0));
//        System.out.println(meuProduto.getMarca());
//        System.out.println(meuProduto.getItensInclusos().get(0).getNome());
//        System.out.println(meuProduto.getItensInclusos().get(0).getQuantidade());

        System.out.println("Inicio do laço FOR");

        for (ItemIncluso itemAtual : meuProduto.getItensInclusos() ) {
            System.out.println(itemAtual.getNome());
            System.out.println(itemAtual.getQuantidade());
        }

        System.out.println("Fim do laço FOR");

        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Microsoft", Tamanho.MÉDIO);
        System.out.println(meuProdutoNacional.getMarca() + " " + meuProdutoNacional.getTamanho());


        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Dior", Tamanho.MÉDIO);
        System.out.println(meuProdutoInternacional.getTamanho() + " " + meuProdutoInternacional.getMarca());

        meuProdutoInternacional.setValor(-99.99);
    }
}
