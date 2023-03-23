package questao6;

public class JSON implements View{

    private TypeView typeView = TypeView.JSON;

    private View proximo = new XML();

    @Override
    public void show(Conta conta) {
        System.out.println(String.format("Imprimindo dados do cliente: %s em JSON", conta.getTitular()));
    }

    public void isFormat(TypeView typeView, Conta conta){
        if(typeView == this.typeView){
            show(conta);
        }
        else{
            proximo.isFormat(typeView, conta);
        }

    }
}
