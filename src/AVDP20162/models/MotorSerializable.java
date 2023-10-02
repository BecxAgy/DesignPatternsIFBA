package AVDP20162.models;


import AVDP20162.models.interfaces.IMotor;
import AVDP20162.models.interfaces.IPrototype;

public class MotorSerializable implements IMotor {
    @Override
    public IPrototype clone() {
        return new MotorSerializable();
    }
}
