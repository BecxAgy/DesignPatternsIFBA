package AVDP20162.models.abstractfactory;

import AVDP20162.models.ChassiMergeable;
import AVDP20162.models.MergeablePneu;
import AVDP20162.models.MotorMergeable;
import AVDP20162.models.interfaces.IFlexibleFactory;
import AVDP20162.models.interfaces.IPrototype;
import AVDP20171.models.interfaces.IChassi;
import AVDP20171.models.interfaces.IMotor;
import AVDP20171.models.interfaces.IPneu;

public class FlexibleMergeableFactory implements IFlexibleFactory {

    @Override
    public IPneu createPneu() {
        return new MergeablePneu();
    }

    @Override
    public IChassi createChassi() {
        return new ChassiMergeable();
    }

    @Override
    public IMotor createMotor() {
        return new MotorMergeable();
    }


    @Override
    public IPrototype clone() {
        return new FlexibleMergeableFactory();
    }
}
