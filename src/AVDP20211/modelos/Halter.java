package AVDP20211.modelos;

public class Halter extends Equipamento{
    private double peso;

    public Halter(int quantidade, String identificacao) {
        super(quantidade, identificacao);
        peso = 0.0;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }




}
