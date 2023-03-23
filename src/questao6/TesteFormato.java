package questao6;

public class TesteFormato {

    public static void main(String[] args) {
        Conta conta = new Conta("Maria", 1000d);
        ViewConta viewConta = new ViewConta();
        viewConta.viewConta(TypeView.CSV,conta);
        viewConta.viewConta(TypeView.JSON,conta);
        viewConta.viewConta(TypeView.XML,conta);
    }
}
