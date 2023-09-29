package AVDP20231.builder;

import AVDP20231.models.Alimento;

public interface Builder {
    public void reset();
    public void setName(String name);
    public void addAlimento(Alimento alimento);
    public void semLactose();
    public void lowCarb();
    public void semGluten();

}
