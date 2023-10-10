package AVDP20211.modelos;

public class Maquina extends Equipamento{
    private String descricao;
    private String marca;

    public Maquina(int quantidade, String identificacao) {
        super(quantidade, identificacao);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
