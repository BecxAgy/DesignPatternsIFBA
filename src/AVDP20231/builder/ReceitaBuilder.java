package AVDP20231.builder;

import AVDP20231.models.Alimento;
import AVDP20231.models.Receita;

import java.util.ArrayList;

public class ReceitaBuilder implements  Builder{
    private String name;
    private ArrayList<Alimento> foods;
    private boolean lowCarb;
    private boolean vegano;
    private boolean semLactose;
    private boolean semGluten;
    private boolean reduzidoSodio;


    @Override
    public void reset() {
        this.name = null;
        this.foods = new ArrayList<Alimento>();
        this.lowCarb = false;
        this.vegano = false;
        this.semLactose = false;
        this.semGluten = false;
        this.reduzidoSodio = false;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void addAlimento(Alimento alimento) {
        foods.add(alimento);
    }
    @Override
    public void lowCarb() {
        this.lowCarb = true;
    }

    @Override
    public void semGluten() {
        this.semGluten = true;
    }
    @Override
    public void semLactose() {
        this.semLactose = true;
    }

    public Receita getResult(){
        return new Receita(this.name, this.foods, this.lowCarb,
                this.vegano, this.semLactose, this.semGluten,
                this.reduzidoSodio);
    }
}
