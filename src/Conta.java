// classe abstrata para gerar um modelo base de CONTA e ter que especificar o tipo

public class Conta  {
    // Atributos privados
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total;
    private double saldo;

    // Construtor
    public Conta(Cliente titular, int numero, int agencia) {
        this.agencia = agencia;
        this.numero = numero;
        this.titular = titular;
        Conta.total++;
    }

    // Método estático
    public static int getTotal() {
        return Conta.total;
    }

    // Métodos para operações de saldo
    public void depositar(double valorDeposito) {
        this.saldo += valorDeposito;
    }



    public void sacar(double valorSaque) {
        if (this.saldo < valorSaque) {
            // enviando exception caso o saldo seja insuficiente
            throw new SaldoInsuficienteException("Motivo do erro: Saldo insuficiente"+ "\nSaldo atual: " + this.saldo +"\nValor do saque: " + valorSaque);
        }
        saldo -= valorSaque;
    }

    void transferir(double valorTransferencia, Conta destino) {
        this.sacar(valorTransferencia);
        destino.depositar(valorTransferencia);
    }

    // Métodos getters e setters
    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public void setAgencia(int agencia) {
        if (agencia > 0) {
            this.agencia = agencia;
        }
        this.agencia = agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return this.titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", titular=" + titular +
                ", saldo=" + saldo +
                '}';
    }
}
