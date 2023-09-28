package AVDP2023.exceptions;

public  class Nutriente {


    private String nome;
    private String unidade;
    private double caloriaPorUnidade;

    public Nutriente(String nome, String unidade, double caloriaPorUnidade) {
        this.nome = nome;
        this.unidade = unidade;
        this.caloriaPorUnidade = caloriaPorUnidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public double getCaloriaPorUnidade() {
        return caloriaPorUnidade;
    }

    public void setCaloriaPorUnidade(double caloriaPorUnidade) {
        this.caloriaPorUnidade = caloriaPorUnidade;
    }
}
