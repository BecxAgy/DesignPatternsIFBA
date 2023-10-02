package AVDP20162.other_implementation.models;

import AVDP20162.other_implementation.models.interfaces.IPneu;
import AVDP20162.other_implementation.models.interfaces.ISerializable;
import AVDP20162.other_implementation.prototypes.IPrototype;

public class PneuSerializable implements IPneu , ISerializable {
    @Override
    public IPrototype clone() {
        return new PneuSerializable();
    }
}
