package AVDP20162.other_implementation.models;

import AVDP20162.other_implementation.models.interfaces.IMergeable;
import AVDP20162.other_implementation.models.interfaces.IMotor;
import AVDP20162.other_implementation.prototypes.IPrototype;

public class MotorMergeable implements IMotor, IMergeable {
    @Override
    public IPrototype clone() {
        return new MotorMergeable();
    }
}
