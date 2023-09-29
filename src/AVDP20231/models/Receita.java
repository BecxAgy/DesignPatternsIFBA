package AVDP20231.models;

import java.util.ArrayList;

public class Receita {
    private String name;
    private ArrayList<Alimento> foods;
    private boolean lowCarb;
    private boolean lowVegano;
    private boolean semLactose;
    private boolean semGluten;
    private boolean reduzidoSodio;


    public Receita(String name, ArrayList<Alimento> foods, boolean lowCarb, boolean lowVegano, boolean semLactose,
                   boolean semGluten, boolean reduzidoSodio) {
        this.name = name;
        this.foods = foods;
        this.lowCarb = lowCarb;
        this.lowVegano = lowVegano;
        this.semLactose = semLactose;
        this.semGluten = semGluten;
        this.reduzidoSodio = reduzidoSodio;

    }



}
