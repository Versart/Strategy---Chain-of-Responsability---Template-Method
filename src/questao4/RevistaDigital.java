package questao4;

public class RevistaDigital {

    private Double preco;

    private ProdutoDigital produtoDigital = new ProdutoDigital();


    public RevistaDigital(Double preco) {
        this.preco = preco;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public ProdutoDigital getProdutoDigital() {
        return produtoDigital;
    }

    public void setProdutoDigital(ProdutoDigital produtoDigital) {
        this.produtoDigital = produtoDigital;
    }
}
