package AVDP20231.singleton;

import AVDP20231.models.Nutriente;

public interface ArmazemNutrientes {

        public Nutriente create(String nome, String unidade, Double caloriaPorUnidade);
        public Nutriente create(String nome) throws NutrienteNaoEncontradoException;

    }
