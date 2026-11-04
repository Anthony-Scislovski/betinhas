package model;

public class Receita {

    private String origem;
    private double valor;

    // Construtor padrão (vazio)
    public Receita() {
    }

    // Construtor com parâmetros
    public Receita(String origem, double valor) {
        this.origem = origem;
        this.valor = valor;
    }

    // Getters e Setters
    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
