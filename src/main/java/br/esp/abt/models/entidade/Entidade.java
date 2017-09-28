package br.esp.abt.models.entidade;

import io.yawp.repository.IdRef;
import io.yawp.repository.annotations.Endpoint;
import io.yawp.repository.annotations.Id;

@Endpoint(path = "/entidades")
public class Entidade {

    @Id
    IdRef<Entidade> id;

    String nome;
    
    String sede;
    
    String nomeReponsavel;
    
    String telefoneResponsavel;
    
    String emailResponsavel;
}
