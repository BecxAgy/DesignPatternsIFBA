package AVDP20162.models.abstractfactory;

import AVDP20162.models.interfaces.IFlexibleFactory;
import AVDP20162.models.interfaces.IPrototype;
import AVDP20171.models.interfaces.IChassi;
import AVDP20171.models.interfaces.IMotor;
import AVDP20171.models.interfaces.IPneu;

public class FlexibleSerializableFactory implements IFlexibleFactory {

    @Override
    public IPneu createPneu() {
        return null;
    }

    @Override
    public IChassi createChassi() {
        return null;
    }

    @Override
    public IMotor createMotor() {
        return null;
    }

    @Override
    public IPrototype clone() {
        return null;
    }
}
