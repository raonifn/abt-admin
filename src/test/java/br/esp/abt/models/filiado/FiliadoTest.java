package br.esp.abt.models.filiado;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.esp.abt.models.affiliation.Affiliate;
import br.esp.abt.utils.EndpointTestCase;

public class FiliadoTest extends EndpointTestCase {

    @Test
    public void testCreate() {
        // TODO Auto-generated method stub
        String json = post("/filiadoes", "{}");
        Affiliate filiado = from(json, Affiliate.class);

        assertNotNull(filiado);
    }

}
