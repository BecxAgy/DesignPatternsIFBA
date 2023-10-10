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
    private Map<String, String> configuracao;

    private static CatalogoEquipamentos instance = null;

    private CatalogoEquipamentos( ){
        factories.put("Acessorio", new AcessorioFactory());
        factories.put("Maquina", new MaquinaFactory());
        factories.put("Halter", new HalteresFactory());
    }
    public static CatalogoEquipamentos getInstance(){
        if(instance == null) return new CatalogoEquipamentos();

        return instance;
    }
    public Equipamento criarEquipamento(String tipo, String identificacao, int quantidade) {
        if (equipamentos.containsKey(identificacao)) {
            Equipamento equipamentoExistente = equipamentos.get(identificacao);
            equipamentoExistente.adicionarQuantidade(quantidade);
            return equipamentoExistente;
        } else {
            EquipamentoFactory factory = factories.get(tipo);
            if (factory != null) {
                try {
                    Equipamento novoEquipamento = factory.create( quantidade, identificacao);
                    return novoEquipamento;
                } catch (Exception e) {
                    e.printStackTrace();
                    throw new IllegalArgumentException("Tipo de equipamento não suportado");
                }
            } else {
                throw new IllegalArgumentException("Tipo de equipamento não encontrado na fábrica");
            }
        }
    }



}
