package AVDP20211.builder;

import AVDP20211.modelos.Equipamento;
import AVDP20211.modelos.Exercicio;
import AVDP20211.modelos.GrupoMuscular;
import AVDP20211.modelos.TipoExercicio;

public interface IExercicioBuilder {
    public IExercicioBuilder clear();
    public IExercicioBuilder descricao(String descricao);
    public IExercicioBuilder withTipo(TipoExercicio tipo);
    public IExercicioBuilder withGrupoMuscular(GrupoMuscular grupoMuscular);
    public IExercicioBuilder withEquipamento(Equipamento equipamento);
    public Exercicio build(String id);

}
