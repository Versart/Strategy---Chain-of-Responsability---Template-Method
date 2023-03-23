package questao4;

public class ServicoVenda {


    public double valorCompra(Double preco, Descontavel descontavel){
        return preco - descontavel.desconto(preco);
    }
}
