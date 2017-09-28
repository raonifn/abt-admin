package br.esp.abt.models.entidade;

import io.yawp.repository.shields.Shield;

public class EntidadeShield extends Shield<Entidade> {

    @Override
    public void defaults() {
        // TODO Auto-generated method stub
        allow();
    }

}
