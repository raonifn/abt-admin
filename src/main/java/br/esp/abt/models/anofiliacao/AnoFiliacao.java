package br.esp.abt.models.anofiliacao;

import br.esp.abt.models.escola.Escola;
import io.yawp.repository.IdRef;
import io.yawp.repository.annotations.Endpoint;
import io.yawp.repository.annotations.Id;
import io.yawp.repository.annotations.Index;

@Endpoint(path = "/anos-filiacao")
public class AnoFiliacao {

    @Id
    private IdRef<AnoFiliacao> id;
    
    @Index
    private Integer ano;

    private IdRef<Escola> escola;
    
    @Index
    private String uuid;


    public IdRef<AnoFiliacao> getId() {
      return id;
    }

    public void setId(IdRef<AnoFiliacao> id) {
      this.id = id;
    }

    public Integer getAno() {
      return ano;
    }

    public void setAno(Integer ano) {
      this.ano = ano;
    }

    public IdRef<Escola> getEscola() {
      return escola;
    }

    public void setEscola(IdRef<Escola> escola) {
      this.escola = escola;
    }
    
    public String getUuid() {
      return uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
}
