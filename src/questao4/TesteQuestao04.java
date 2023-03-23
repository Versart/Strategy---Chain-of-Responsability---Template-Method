package questao4;

public class TesteQuestao04 {
    public static void main(String[] args) {
        LivroDigital livroDigital = new LivroDigital(22d);
        ServicoVenda servicoVenda = new ServicoVenda();
        System.out.println(servicoVenda.valorCompra(livroDigital.getPreco(), livroDigital.getProdutoDigital()));

    }
}
