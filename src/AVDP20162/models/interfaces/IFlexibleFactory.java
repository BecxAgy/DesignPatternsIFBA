package AVDP20162.models.interfaces;


import AVDP20162.models.interfaces.IMotor;
import AVDP20162.models.interfaces.IPneu;

public interface IFlexibleFactory {
    public IPneu createPneu();
    public IMotor createMotor();
}
