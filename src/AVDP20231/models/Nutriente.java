package AVDP20231.models;

public  class Nutriente {


    private String nome;

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

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


    public String getUnidade() {
        return unidade;
    }

    public double getCaloriaPorUnidade() {
        return caloriaPorUnidade;
    }

    public void setCaloriaPorUnidade(double caloriaPorUnidade) {
        this.caloriaPorUnidade = caloriaPorUnidade;
    }
}
