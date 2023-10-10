package AVDP20211.factory;

import AVDP20211.modelos.Acessorio;
import AVDP20211.modelos.Maquina;

public class AcessorioFactory implements EquipamentoFactory{
    @Override
    public Acessorio create() {
        return new Acessorio();
    }
}
