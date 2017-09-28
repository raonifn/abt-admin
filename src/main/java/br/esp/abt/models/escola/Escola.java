package br.esp.abt.models.escola;

import java.util.List;

import br.esp.abt.models.entidade.Entidade;
import io.yawp.repository.IdRef;
import io.yawp.repository.annotations.Endpoint;
import io.yawp.repository.annotations.Id;
import io.yawp.repository.annotations.Json;

@Endpoint(path = "/escolas")
public class Escola {

    @Id
    private IdRef<Escola> id;

    @Id
    private IdRef<Entidade> idEntidade;
    
    private String nome;
    
    @Json
    private List<Intrutor> instrutores;

    public IdRef<Escola> getId() {
      return id;
    }

    public void setId(IdRef<Escola> id) {
      this.id = id;
    }

    public IdRef<Entidade> getIdEntidade() {
      return idEntidade;
    }

    public void setIdEntidade(IdRef<Entidade> idEntidade) {
      this.idEntidade = idEntidade;
    }

    public List<Intrutor> getInstrutores() {
      return instrutores;
    }

    public void setInstrutores(List<Intrutor> instrutores) {
      this.instrutores = instrutores;
    }

    public String getNome() {
      return nome;
    }

    public void setNome(String nome) {
      this.nome = nome;
    } 
}
