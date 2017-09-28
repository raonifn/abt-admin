package br.esp.abt.models.escola;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.esp.abt.utils.EndpointTestCase;

public class EscolaTest extends EndpointTestCase {

    @Test
    public void testCreate() {
        // TODO Auto-generated method stub
        String json = post("/escolas", "{}");
        Escola escola = from(json, Escola.class);

        assertNotNull(escola);
    }

}
