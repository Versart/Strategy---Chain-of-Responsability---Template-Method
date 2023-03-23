package questao6;

public class CSV implements View{
    private TypeView typeView = TypeView.CSV;
    @Override
    public void show(Conta conta) {
        System.out.println(String.format("Imprimindo dados do cliente %s em CSV",conta.getTitular()));
    }

    @Override
    public void isFormat(TypeView typeView, Conta conta) {
            show(conta);
    }
}
