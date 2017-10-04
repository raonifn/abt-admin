package br.esp.abt.models.organization;

import io.yawp.repository.shields.Shield;

public class OrganizationShield extends Shield<Organization> {

    @Override
    public void defaults() {
        // TODO Auto-generated method stub
        allow();
    }

}
