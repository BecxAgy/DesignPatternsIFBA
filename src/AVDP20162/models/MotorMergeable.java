package AVDP20162.models;


import AVDP20162.models.interfaces.IMotor;
import AVDP20162.models.interfaces.IPrototype;

public class MotorMergeable implements IMotor {
    @Override
    public IPrototype clone() {
        return new MotorMergeable();
    }
}
