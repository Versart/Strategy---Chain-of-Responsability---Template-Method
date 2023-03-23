package questao4;

public class LivroDigital  {

    public Double preco;

    private ProdutoDigital produtoDigital = new ProdutoDigital();
    public LivroDigital(Double preco) {
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
