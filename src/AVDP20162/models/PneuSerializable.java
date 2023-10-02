package AVDP20162.models;

import AVDP20162.models.interfaces.IPneu;
import AVDP20162.models.interfaces.IPrototype;

public class PneuSerializable implements IPneu {

    @Override
    public IPrototype clone() {
        return new PneuSerializable();
    }
}
