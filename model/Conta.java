package model;

public class Conta {

    private int numero;
    private String cliente;
    private double saldo;
    private double limite;

    // Construtor padrão (vazio)
    public Conta() {
    }

    // Construtor com parâmetros
    public Conta(int numero, String cliente, double saldo, double limite) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = saldo;
        this.limite = limite;
    }



    // Aumenta o saldo da conta
    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado na conta " + numero);
        } else {
            System.out.println("Valor de depósito inválido.");
        }
    }

    // Valida se o valor respeita a soma do saldo + limite. Se sim, reduz o saldo
    public boolean sacar(double valor) {
        if (this.saldo + this.limite >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso na conta " + numero);
            return true;
        } else {
            System.out.println("Erro: Saldo e limite insuficientes para o saque de R$ " + valor + " na conta " + numero);
            return false;
        }
    }

    // Verifica se há saldo/limite, efetua o débito e altera o status da despesa para "Paga"
    public boolean pagarDespesa(Despesa despesa) {
        if (sacar(despesa.getValor())) {
            despesa.setStatus("Paga");
            System.out.println("Despesa '" + despesa.getDescricao() + "' paga com sucesso!");
            return true;
        } else {
            System.out.println("Não foi possível pagar a despesa '" + despesa.getDescricao() + "'.");
            return false;
        }
    }

    // Transfere o valor do saldo para o valorPoupado da meta
    public boolean poupar(Meta meta, double valor) {
        if (sacar(valor)) {
            meta.setValorPoupado(meta.getValorPoupado() + valor);
            System.out.println("R$ " + valor + " guardados na meta: " + meta.getObjetivo());
            return true;
        } else {
            System.out.println("Saldo insuficiente para poupar R$ " + valor);
            return false;
        }
    }

    // --- GETTERS E SETTERS ---

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
}
