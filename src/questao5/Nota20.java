package questao5;

public class Nota20 implements Notavel{

    private int valorNota = 20;

    private Notavel proximo = new Nota5();
    @Override
    public int notas(int valor) {
        int notasAdar;
        if(valor < valorNota){
            notasAdar = 0;
            System.out.println(String.format("%d notas de %d",notasAdar,valorNota));
            return  notasAdar;
        }
        else{
            notasAdar = valor / valorNota;
            System.out.println(String.format("%d notas de %d",notasAdar,valorNota));
            valor-= notasAdar * valorNota;
            proximo.notas(valor);
            return notasAdar;
        }
    }
}
