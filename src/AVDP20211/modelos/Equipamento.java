package AVDP20211.modelos;

public abstract class Equipamento {
    private String identifcador;
    private  int quantidade;

    public String getIdentifcador() {
        return identifcador;
    }

    public void setIdentifcador(String identifcador) {
        this.identifcador = identifcador;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public void adicionarQuantidade(int quantidade){
        this.quantidade ++;
    }
}
