package questao10;

import java.util.List;

public abstract class Relatorio {

    public abstract String cabecalho(Banco banco);

    public abstract String corpo(List<Conta> contaList);

    public abstract String rodape(Banco banco);

}
