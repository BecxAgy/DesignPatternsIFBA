package AVDP20162.other_implementation.factory;

import AVDP20162.other_implementation.models.interfaces.IMergeable;
import AVDP20162.other_implementation.models.interfaces.IMotor;
import AVDP20162.other_implementation.models.interfaces.IPneu;
import AVDP20162.other_implementation.models.interfaces.ISerializable;

public interface IFlexibleFactory {
    IMergeable createMergeable(String typeProduct);
    ISerializable createSerializable(String typeProduct);
}
