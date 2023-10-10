package AVDP20211.builder;

import AVDP20211.modelos.Equipamento;
import AVDP20211.modelos.Exercicio;
import AVDP20211.modelos.GrupoMuscular;
import AVDP20211.modelos.TipoExercicio;

import java.util.ArrayList;
import java.util.List;

public class ExercicioBuilder  implements  IExercicioBuilder{
    private String descricao;
    private List<TipoExercicio> tipos;
    private List<GrupoMuscular> gruposMusculares;
    private List<Equipamento> equipamentos;
    @Override
    public IExercicioBuilder clear() {
        this.descricao = null;
        this.tipos = new ArrayList<TipoExercicio>();
        this.gruposMusculares = new ArrayList<GrupoMuscular>();
        this.equipamentos = new ArrayList<Equipamento>();

        return this;
    }

    @Override
    public IExercicioBuilder descricao(String descricao) {
        this.descricao = descricao;
        return this;
    }

    @Override
    public IExercicioBuilder withTipo(TipoExercicio tipo) {
        tipos.add(tipo);

        return this;
    }

    @Override
    public IExercicioBuilder withGrupoMuscular(GrupoMuscular grupoMuscular) {
        gruposMusculares.add(grupoMuscular);

        return this;
    }

    @Override
    public IExercicioBuilder withEquipamento(Equipamento equipamento) {
        equipamentos.add(equipamento);
        return this;
    }

    @Override
    public Exercicio build(String id) {
        return new Exercicio(id, this.descricao, tipos,gruposMusculares, equipamentos);
    }
}
