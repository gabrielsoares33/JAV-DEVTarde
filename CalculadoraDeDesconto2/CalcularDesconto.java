package CalculadoraDeDesconto2;

public class CalcularDesconto {
    public void calcula20(){
        double precoProduto;
        precoProduto = 200;
        int desconto = 20;
        double precoComDesconto = precoProduto - (precoProduto*desconto/100);
        System.out.println("o Valor do Produto com Desconto é" +precoComDesconto+" R$");
    }

}
