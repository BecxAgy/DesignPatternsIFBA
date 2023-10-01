package AVDP20231.builder;

import AVDP20231.models.Alimento;
import AVDP20231.models.Nutriente;
import AVDP20231.models.Receita;
import AVDP20231.singleton.CatalogoNutrientes;
import AVDP20231.singleton.NutrienteNaoEncontradoException;

public class Director {
    public Builder builder;
    public void setBuilder(Builder builder){
        this.builder = builder;
    }
    public void createOvoFrito() throws NutrienteNaoEncontradoException {
        Alimento ovo = new Alimento("Ovo", 2.9, 1.7,0.9);
        Alimento manteiga = new Alimento("MANTEIGA", 0.01, 0.08, 8.11);

        Nutriente sodio = CatalogoNutrientes.getInstance().create("SODIO", "MICROGRAMA", 0.0);

        Alimento sal = new Alimento("SAL");
        sal.addNutriente(sodio, 400.0);

        this.builder.reset();
        this.builder.addAlimento(ovo);
        this.builder.addAlimento(manteiga);
        this.builder.addAlimento(sal);
        this.builder.lowCarb();
        this.builder.semLactose();
        this.builder.setName("OVO FRITO");


    }
}
