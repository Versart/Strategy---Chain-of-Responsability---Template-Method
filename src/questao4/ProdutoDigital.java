package questao4;

public  class ProdutoDigital implements Descontavel {


    @Override
    public final double desconto(Double preco) {
        return preco * 0.15;
    }
}
