package questao6;

public class ViewConta {

    private JSON json = new JSON();
    public void viewConta(TypeView typeView,Conta conta){
        json.isFormat(typeView,conta);
    }
}
