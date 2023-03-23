package questao5;

public class Nota50 implements Notavel{

    private int valorNota = 50;

    private Notavel proximo = new Nota20();
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
