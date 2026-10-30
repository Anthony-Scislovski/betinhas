package model;

public class Receita {
    
    // Atributos
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
        return this.origem;
    }
    
    public void setOrigem(String origem) {
        this.origem = origem;
    }
    
    public double getValor() {
        return this.valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
}
