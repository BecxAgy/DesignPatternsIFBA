package AVDP2023.exceptions;

import java.util.HashMap;
import java.util.Map;

//sets this class to Singleton
public class CatalogoNutrientes implements ArmazemNutrientes {

    public Map<String, Nutriente> listaDoCatalogo = new HashMap<>();

    //lazy instanciation
    private static CatalogoNutrientes catalogo = null;

    public static CatalogoNutrientes getInstance() {
        if(catalogo!=null) return catalogo;

        return catalogo = new CatalogoNutrientes();
    }
    private CatalogoNutrientes(){}

    @Override
    public Nutriente create(String nome, String unidade, Double caloriaPorUnidade) {

        //first, verify if already exist in list
        Nutriente nutrienteExists = listaDoCatalogo.get(nome);

        if(nutrienteExists != null) {
            nutrienteExists.setUnidade(unidade);
            nutrienteExists.setCaloriaPorUnidade(caloriaPorUnidade);

            return nutrienteExists;
        }

        Nutriente nutriente = new Nutriente(nome, unidade, caloriaPorUnidade);
        listaDoCatalogo.put(nome, nutriente);
        return nutriente;

    }

    @Override
    public Nutriente create(String nome) throws NutrienteNaoEncontradoException {
        Nutriente nutrienteExists = listaDoCatalogo.get(nome);

        if(nutrienteExists != null) return  nutrienteExists;

       throw new NutrienteNaoEncontradoException();
    }
}
