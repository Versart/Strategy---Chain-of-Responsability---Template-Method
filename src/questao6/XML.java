package questao6;

public class XML implements View{

    private TypeView typeView = TypeView.XML;

    private View proximo = new CSV();
    @Override
    public void show(Conta conta) {
        System.out.println(String.format("Imprimindo dados do cliente: %s em XML",conta.getTitular()));
    }

    @Override
    public void isFormat(TypeView typeView, Conta conta) {
        if(typeView == this.typeView){
            show(conta);
        }
        else{
            proximo.isFormat(typeView, conta);
        }
    }
}
