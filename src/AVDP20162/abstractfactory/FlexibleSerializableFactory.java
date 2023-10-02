package AVDP20162.abstractfactory;

import AVDP20162.models.interfaces.IFlexibleFactory;
import AVDP20162.models.interfaces.IMotor;
import AVDP20162.models.interfaces.IPneu;

public class FlexibleSerializableFactory implements IFlexibleFactory {

    @Override
    public IPneu createPneu() {
        return null;
    }

    @Override
    public IMotor createMotor() {
        return null;
    }


}
