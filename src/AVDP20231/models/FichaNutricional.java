package AVDP20231.models;

public class FichaNutricional {
    public FichaNutricional(Double quantidadeProt, Double quantiddadeCarb, Double getQuantidadeGord) {
        this.quantidadeProt = quantidadeProt;
        this.quantiddadeCarb = quantiddadeCarb;
        this.quantidadeGord = getQuantidadeGord;
    }

    public Double quantidadeProt;
    public Double quantiddadeCarb;
    public Double quantidadeGord;


    @Override
    public String toString() {
        return "FichaNutricional{" +
                "quantidadeProt=" + quantidadeProt +
                ", quantiddadeCarb=" + quantiddadeCarb +
                ", QuantidadeGord=" + quantidadeGord +
                '}';
    }
}
