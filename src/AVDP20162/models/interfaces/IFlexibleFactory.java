package AVDP20162.models.interfaces;

import AVDP20171.models.interfaces.IChassi;
import AVDP20171.models.interfaces.IMotor;
import AVDP20171.models.interfaces.IPneu;

public interface IFlexibleFactory extends IPrototype{
    public IPneu createPneu();
    public IChassi createChassi();
    public IMotor createMotor();
}
