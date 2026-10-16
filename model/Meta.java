package model;

public class Meta {

    private String objetivo;
    private double valorAlvo;
    private double valorPoupado;

    // Construtor padrão   (vazio) 
    public Meta() {
    }

    // Construtor com todos os parâmetros - AJUSTADO
    public Meta(String objetivo, double valorAlvo, double valorPoupado) {
        this.objetivo = objetivo;
        this.valorAlvo = valorAlvo;
        this.valorPoupado = valorPoupado;
    }

    // Getters e Setters 
    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public double getValorAlvo() {
        return valorAlvo;
    }

    public void setValorAlvo(double valorAlvo) {
        this.valorAlvo = valorAlvo;
    }

    public double getValorPoupado() {
        return valorPoupado;
    }

    public void setValorPoupado(double valorPoupado) {
        this.valorPoupado = valorPoupado;
    }
}
