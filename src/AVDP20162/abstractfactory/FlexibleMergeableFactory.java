package AVDP20162.abstractfactory;

import AVDP20162.models.PneuMergeable;
import AVDP20162.models.MotorMergeable;
import AVDP20162.models.interfaces.IFlexibleFactory;

import AVDP20162.models.interfaces.IMotor;
import AVDP20162.models.interfaces.IPneu;

public class FlexibleMergeableFactory implements IFlexibleFactory {

    @Override
    public IPneu createPneu() {
        return new PneuMergeable();
    }



    @Override
    public IMotor createMotor() {
        return new MotorMergeable();
    }



}
