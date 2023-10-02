package AVDP20162.other_implementation.models;

import AVDP20162.other_implementation.models.interfaces.IMergeable;
import AVDP20162.other_implementation.models.interfaces.IPneu;
import AVDP20162.other_implementation.prototypes.IPrototype;

public class PneuMergeable implements IPneu, IMergeable {
    @Override
    public IPrototype clone() {
        return new PneuMergeable();
    }
}
