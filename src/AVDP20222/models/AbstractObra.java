package AVDP20222.models;

public abstract class AbstractObra implements Obra {

    private String titulo;
    private String ano;
    private Double avaliacao;
    @Override
    public String getTitulo() {
        return titulo;
    }

    @Override
    public String getAno() {
        return ano;
    }

    @Override
    public Double getAvaliacao() {
        return avaliacao;
    }
}
