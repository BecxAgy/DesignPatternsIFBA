package AVDP20171.abstractfactory;

import AVDP20171.models.ChassiA;
import AVDP20171.models.MotorA;
import AVDP20171.models.PneuA;
import AVDP20171.models.interfaces.ICarFactory;
import AVDP20171.models.interfaces.IChassi;
import AVDP20171.models.interfaces.IMotor;
import AVDP20171.models.interfaces.IPneu;

import java.util.ArrayList;
import java.util.List;

public class CarAFactory implements ICarFactory {
    private static CarAFactory carFactorySingleton = null;
    private List<IPneu> pneuList;
    private List<IChassi> chassiList;
    private List<IMotor> motorList;
    private int pneuIndex;
    private int chassiIndex;
    private int motorIndex;

    private CarAFactory(int maxPneus, int maxChassis,int maxMotors) {
        this.pneuList = new ArrayList<IPneu>();
        this.chassiList = new ArrayList<IChassi>();
        this.motorList = new ArrayList<IMotor>();


    }

    public static CarAFactory getInstance(int maxPneus, int maxChassis,int maxMotors){
        if(carFactorySingleton != null) return carFactorySingleton;

        return new CarAFactory( maxPneus,  maxChassis, maxMotors);
    }

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
}
