package model;

public class Despesa {

    private String descricao;
    private double valor;
    private String status;

    // Construtor padrão  (vazio)
    public Despesa() {
    }

    // Construtor com todos os parâmetros
    public Despesa(String descricao, double valor, String status) {
        this.descricao = descricao;
        this.valor = valor;
        this.status = status;
    }

    // Getters e Setters (já estavam corretos)
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
