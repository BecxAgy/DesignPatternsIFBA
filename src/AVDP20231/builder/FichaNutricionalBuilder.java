package AVDP20231.builder;

import AVDP20231.models.Alimento;
import AVDP20231.models.FichaNutricional;

public class FichaNutricionalBuilder implements Builder{

    public Double quantidadeProt;
    public Double quantiddadeCarb;
    public Double QuantidadeGord;


    @Override
    public void reset() {
        this.QuantidadeGord = 0.0;
        this.quantiddadeCarb = 0.0;
        this.quantidadeProt = 0.0;

    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void addAlimento(Alimento alimento) {
        this.quantiddadeCarb += alimento.getQuantidadeNutrientes("CARBOIDRATO");
        this.QuantidadeGord += alimento.getQuantidadeNutrientes("GORDURA");
        this.quantidadeProt += alimento.getQuantidadeNutrientes("PROTEINA");

    }

    @Override
    public void semLactose() {

    }

    @Override
    public void lowCarb() {

    }

    @Override
    public void semGluten() {

    }

    public FichaNutricional get() {
        return new FichaNutricional(this.quantidadeProt,this.quantiddadeCarb, this.QuantidadeGord);
    }
}
