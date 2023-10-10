package AVDP20211.modelos;

import java.util.ArrayList;
import java.util.List;

public class Exercicio {
    private String id;
    private String descricao;
    private List<TipoExercicio> tipos;
    private List<GrupoMuscular> gruposMusculares;
    private List<Equipamento> equipamentos;


    public Exercicio(String id, String descricao, List<TipoExercicio> tipos,
                     List<GrupoMuscular> gruposMusculares,
                     List<Equipamento> equipamentos) {
        this.id = id;
        this.descricao = descricao;
        this.tipos = new ArrayList<TipoExercicio>(tipos);
        this.gruposMusculares = new ArrayList<GrupoMuscular>(gruposMusculares);
        this.equipamentos = new ArrayList<Equipamento>(equipamentos);
    }
}
