package questao10;

import java.time.LocalDateTime;
import java.util.List;

public class RelatorioComplexo extends Relatorio{

    @Override
    public String cabecalho(Banco banco) {
        return banco.getNome() + " Endereço: " + banco.getEndereco() + " Telefone: " + banco.getTelefone();
    }

    @Override
    public String corpo(List<Conta> contaList) {
        String corpo ="";
        for(Conta conta : contaList){
            corpo+= conta.getTitular() + " Agencia: " + conta.getAgencia() +" Número: " +
                    conta.getNumeroConta() + " Saldo: " + conta.getSaldo() +"\n";
        }
        return corpo;
    }

    @Override
    public String rodape(Banco banco) {
        return banco.getEmail() +" " + LocalDateTime.now();
    }
}
