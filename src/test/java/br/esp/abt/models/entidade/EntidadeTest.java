package br.esp.abt.models.entidade;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.esp.abt.utils.EndpointTestCase;

public class EntidadeTest extends EndpointTestCase {

    @Test
    public void testCreate() {
        // TODO Auto-generated method stub
        String json = post("/entidades", "{}");
        Entidade entidade = from(json, Entidade.class);

        assertNotNull(entidade);
    }

}