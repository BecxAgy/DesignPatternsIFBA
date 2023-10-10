package AVDP20211.factory;

import AVDP20211.modelos.Equipamento;
import AVDP20211.modelos.Halter;
import AVDP20211.modelos.Maquina;

public class HalteresFactory implements EquipamentoFactory{

    @Override
    public Equipamento create() {
        return new Halter();
    }
}
