package AVDP20222.models.abstractfactory;

import AVDP20222.models.Obra;

public interface IConversorFactory {
    public Obra convertToXML();
    public Obra convertToJson();

}
