package br.esp.abt.models.filiacao;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.esp.abt.utils.EndpointTestCase;

public class FiliacaoTest extends EndpointTestCase {

    @Test
    public void testCreate() {
        // TODO Auto-generated method stub
        String json = post("/filiacaos", "{}");
        Filiacao filiacao = from(json, Filiacao.class);

        assertNotNull(filiacao);
    }

}
