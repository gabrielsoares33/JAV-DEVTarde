package CalculadoraDeDesconto2;

public class CalcularDesconto2 {
    public void calcula30(){
    double precoProduto;
    precoProduto = 200;
    int desconto = 30;
    double precoComDesconto = precoProduto - (precoProduto*desconto/100);
    System.out.println("o Valor do Produto com Desconto é" +precoComDesconto+" R$");
    


    }

}
