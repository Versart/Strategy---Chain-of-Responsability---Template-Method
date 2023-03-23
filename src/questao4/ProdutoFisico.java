package questao4;

public  class ProdutoFisico implements Descontavel {

    @Override
    public final double desconto(Double preco) {
        return preco * 0.3;
    }
}
