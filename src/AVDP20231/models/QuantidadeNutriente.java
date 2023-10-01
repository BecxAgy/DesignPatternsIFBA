package AVDP20231.models;

public class QuantidadeNutriente {
    private Double fracaoUnidade;
    private Nutriente nutriente;

    public QuantidadeNutriente(Nutriente nutriente, Double fracaoUnidade) {
        this.nutriente = nutriente;
        this.fracaoUnidade = fracaoUnidade;
    }

    public String getNome() {
        return this.nutriente.getNome();
    }


    public Double getFracaoUnidade() {
        return this.fracaoUnidade;
    }

    public String toString() {
        return this.nutriente.getNome() + ": " + this.fracaoUnidade * this.nutriente.getCaloriaPorUnidade();
    }
}
