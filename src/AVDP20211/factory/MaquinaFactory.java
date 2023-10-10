package AVDP20211.factory;

import AVDP20211.modelos.Equipamento;
import AVDP20211.modelos.Maquina;

public class MaquinaFactory implements EquipamentoFactory {
    @Override
    public Equipamento create(int quantidade, String identificacao) {
        return new Maquina(quantidade,identificacao);
    }
}
