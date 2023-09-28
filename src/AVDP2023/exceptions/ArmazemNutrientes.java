package AVDP2023.exceptions;

import AVDP2023.exceptions.NutrienteNaoEncontradoException;

public interface ArmazemNutrientes {

        public Nutriente create(String nome, String unidade, Double caloriaPorUnidade);
        public Nutriente create(String nome) throws NutrienteNaoEncontradoException;

    }
