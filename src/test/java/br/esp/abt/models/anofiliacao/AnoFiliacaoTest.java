package br.esp.abt.models.anofiliacao;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.esp.abt.utils.EndpointTestCase;

public class AnoFiliacaoTest extends EndpointTestCase {

    @Test
    public void testCreate() {
        // TODO Auto-generated method stub
        String json = post("/ano-filiacaos", "{}");
        AnoFiliacao anoFiliacao = from(json, AnoFiliacao.class);

        assertNotNull(anoFiliacao);
    }

}
