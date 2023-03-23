package questao10;

public class Conta {

    private String titular;

    private Double saldo;

    private String agencia;

    private String numeroConta;


    public Conta(String titular, Double saldo, String agencia, String numeroConta) {
        this.titular = titular;
        this.saldo = saldo;
        this.agencia = agencia;
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
}
