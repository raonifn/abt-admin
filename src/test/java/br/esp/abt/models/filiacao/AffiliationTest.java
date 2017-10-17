package br.esp.abt.models.filiacao;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.esp.abt.models.affiliation.Affiliation;
import br.esp.abt.utils.EndpointTestCase;

public class AffiliationTest extends EndpointTestCase {

    @Test
    public void testCreate() {
        // TODO Auto-generated method stub
        String json = post("/affiliations", "{}");
        Affiliation filiacao = from(json, Affiliation.class);

        assertNotNull(filiacao);
    }

}
