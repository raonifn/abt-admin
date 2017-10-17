package br.esp.abt.models.entidade;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.esp.abt.models.organization.Gymn;
import br.esp.abt.utils.EndpointTestCase;

public class GymnTest extends EndpointTestCase {

    @Test
    public void testCreate() {
        // TODO Auto-generated method stub
        String json = post("/gymns", "{}");
        Gymn escola = from(json, Gymn.class);

        assertNotNull(escola);
    }

}
