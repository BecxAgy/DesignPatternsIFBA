package AVDP20211.singleton;


import AVDP20211.factory.AcessorioFactory;
import AVDP20211.factory.EquipamentoFactory;
import AVDP20211.factory.HalteresFactory;
import AVDP20211.factory.MaquinaFactory;
import AVDP20211.modelos.Equipamento;
import AVDP20231.singleton.CatalogoNutrientes;

import java.util.HashMap;
import java.util.Map;

public class CatalogoEquipamentos {
    private Map<String, Equipamento> equipamentos;
    private Map<String, EquipamentoFactory> factories;

    private static CatalogoEquipamentos catalogo = null;

    private CatalogoEquipamentos(){
        factories.put("AcessorioFactory", new AcessorioFactory());
        factories.put("MaquinaFactory", new MaquinaFactory());
        factories.put("HalterFactory", new HalteresFactory());
    }
    public static CatalogoEquipamentos getInstance(){
        if(catalogo == null) return new CatalogoEquipamentos();

        return catalogo;
    }
    public Equipamento criarOuRecuperarEquipamento(String tipo, String identificador, int quantidade) {
        return null;
    }



}
