package AVDP20171.models.interfaces;

public interface ICarFactory {
    public IPneu createPneu();

    public IChassi createChassi();
    public IMotor createMotor();
}
