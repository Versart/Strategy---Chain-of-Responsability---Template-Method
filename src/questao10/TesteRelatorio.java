package questao10;

import java.util.List;

public class TesteRelatorio {

    public static void main(String[] args) {
        Banco banco = new Banco("Banco B","989898","Rua B","bancob@email.com");
        List<Conta> contas = List.of(new Conta("Maria",1000d,"1212","21212"),
                new Conta("Pedro",1000d,"1212","21212"));

        RelatorioSimples relatorioSimples = new RelatorioSimples();
        System.out.println("Relatório Simples");
        System.out.println(relatorioSimples.cabecalho(banco));
        System.out.println(relatorioSimples.corpo(contas));
        System.out.println(relatorioSimples.rodape(banco));

        RelatorioComplexo relatorioComplexo = new RelatorioComplexo();
        System.out.println("Relatório Complexo");
        System.out.println(relatorioComplexo.cabecalho(banco));
        System.out.println(relatorioComplexo.corpo(contas));
        System.out.println(relatorioComplexo.rodape(banco));
    }
}
