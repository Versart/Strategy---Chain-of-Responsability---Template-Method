package questao5;

public class Nota100 implements Notavel {

    private int valorNota = 100;
    private Notavel proximo = new Nota50();

    @Override
    public int notas(int valor) {
        int notasAdar;
        if(valor < valorNota){
            notasAdar = 0;
            System.out.println(String.format("%d notas de %d",notasAdar,valorNota));
            return  notasAdar;
        }
        else{
            notasAdar = valor / 100;
            System.out.println(String.format("%d notas de %d",notasAdar,valorNota));
            valor-= notasAdar * valorNota;
            proximo.notas(valor);
            return notasAdar;
        }
    }
}
