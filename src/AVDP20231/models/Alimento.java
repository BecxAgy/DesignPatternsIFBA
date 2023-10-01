package AVDP20231.models;

import AVDP20231.singleton.CatalogoNutrientes;
import AVDP20231.singleton.NutrienteNaoEncontradoException;

import java.util.HashSet;
import java.util.Set;

public class Alimento {
    private String name;
    private Set<QuantidadeNutriente> nutrientes;
    public Alimento(String nome) {
        this.name = nome;
        this.nutrientes = new HashSet<QuantidadeNutriente>();
    }

    public Alimento(String name, Double qtdProt,Double qtdGord,Double qtdCarb) throws NutrienteNaoEncontradoException {
        this.name = name;
        this.addNutriente(CatalogoNutrientes.getInstance().create("PROTEINA"), qtdProt);
        this.addNutriente(CatalogoNutrientes.getInstance().create("GORDURA"), qtdGord);
        this.addNutriente(CatalogoNutrientes.getInstance().create("CARBOIDRATO"), qtdCarb);

    }

    public void addNutriente(Nutriente nutriente, Double fracaoUnidade){
        QuantidadeNutriente qtdNutri = new QuantidadeNutriente(nutriente, fracaoUnidade);
        nutrientes.add(qtdNutri);
    }

    public Double getQuantidadeNutrientes(String nome){

        for (QuantidadeNutriente quantidadeNutriente: nutrientes) {
            if(quantidadeNutriente.getNome().equalsIgnoreCase(nome)){
                return quantidadeNutriente.getFracaoUnidade();
            }
        }
        return 0.0;
    }

}
