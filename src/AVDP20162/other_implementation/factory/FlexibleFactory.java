package AVDP20162.other_implementation.factory;

import AVDP20162.other_implementation.models.MotorMergeable;
import AVDP20162.other_implementation.models.MotorSerializable;
import AVDP20162.other_implementation.models.PneuMergeable;
import AVDP20162.other_implementation.models.PneuSerializable;
import AVDP20162.other_implementation.models.interfaces.IMergeable;
import AVDP20162.other_implementation.models.interfaces.IMotor;
import AVDP20162.other_implementation.models.interfaces.IPneu;
import AVDP20162.other_implementation.models.interfaces.ISerializable;
import AVDP20162.other_implementation.prototypes.IPrototype;

import java.util.HashMap;

import static javax.swing.UIManager.put;

public class FlexibleFactory implements IFlexibleFactory{
    private HashMap<String, IMergeable> prototipoMergeable = new HashMap<>();
    private HashMap<String, ISerializable> prototipoSerializable = new HashMap<>();

    public FlexibleFactory(){
        prototipoMergeable.put("Pneu", (IMergeable) new PneuMergeable());
        prototipoMergeable.put("Motor", (IMergeable) new MotorMergeable());
        prototipoSerializable.put("Pneu", (ISerializable) new PneuSerializable());
        prototipoSerializable.put("Motor", (ISerializable) new MotorSerializable());
    }


    @Override
    public IMergeable createMergeable(String typeProduct) {
       switch (typeProduct){
           case ("Pneu"):
               return (PneuMergeable) prototipoMergeable.get(typeProduct).clone();
           case("Motor"):
               return (MotorMergeable) prototipoMergeable.get(typeProduct).clone();

       }
       return null;
    }

    @Override
    public ISerializable createSerializable(String typeProduct) {
        switch (typeProduct){
            case ("Pneu"):
                return (PneuSerializable) prototipoSerializable.get(typeProduct).clone();
            case("Motor"):
                return (MotorSerializable) prototipoSerializable.get(typeProduct).clone();

        }
        return null;
    }
}
