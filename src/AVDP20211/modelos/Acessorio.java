package AVDP20211.modelos;

public class Acessorio extends Equipamento{
    public Acessorio(int quantidade, String identificacao) {
        super(quantidade, identificacao);
        this.descricao = "";
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private String descricao;


}
