package questao10;

import java.util.List;

public class RelatorioSimples extends Relatorio{


    @Override
    public String cabecalho(Banco banco) {
        return banco.getNome();
    }

    @Override
    public String corpo(List<Conta> contaList) {
        String corpo ="";
        for(Conta conta : contaList){
            corpo+= conta.getTitular() +" Saldo: " + conta.getSaldo() +"\n";
        }
        return corpo;
    }

    @Override
    public String rodape(Banco banco) {
        return banco.getTelefone();
    }
}
