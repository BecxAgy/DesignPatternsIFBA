package AVDP20162.other_implementation.models;

import AVDP20162.other_implementation.models.interfaces.IMotor;
import AVDP20162.other_implementation.models.interfaces.ISerializable;
import AVDP20162.other_implementation.prototypes.IPrototype;

public class MotorSerializable implements IMotor, ISerializable {

    @Override
    public IPrototype clone() {
        return new MotorSerializable();
    }
}
