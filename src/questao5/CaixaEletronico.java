package questao5;

public class CaixaEletronico {

    private Nota100 nota100 = new Nota100();

    public int sacar(int valor){
       return nota100.notas(valor);
    }
}
