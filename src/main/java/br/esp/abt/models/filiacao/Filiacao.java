package br.esp.abt.models.filiacao;

import java.util.Date;

import br.esp.abt.models.escola.Escola;
import br.esp.abt.models.filiado.Filiado;
import io.yawp.repository.IdRef;
import io.yawp.repository.annotations.Endpoint;
import io.yawp.repository.annotations.Id;
import io.yawp.repository.annotations.Index;

@Endpoint(path = "/filiacoes")
public class Filiacao {

    @Id
    private IdRef<Filiacao> id;
    
    private IdRef<Filiado> idFiliado;
    
    private IdRef<Escola> escola;
    
    @Index
    private Integer ano;
    
    private Date dataConfirmacaoPagamento;

    public IdRef<Filiacao> getId() {
      return id;
    }

    public void setId(IdRef<Filiacao> id) {
      this.id = id;
    }

    public IdRef<Filiado> getIdFiliado() {
      return idFiliado;
    }

    public void setIdFiliado(IdRef<Filiado> idFiliado) {
      this.idFiliado = idFiliado;
    }

    public IdRef<Escola> getEscola() {
      return escola;
    }

    public void setEscola(IdRef<Escola> escola) {
      this.escola = escola;
    }

    public Integer getAno() {
      return ano;
    }

    public void setAno(Integer ano) {
      this.ano = ano;
    }

    public Date getDataConfirmacaoPagamento() {
      return dataConfirmacaoPagamento;
    }

    public void setDataConfirmacaoPagamento(Date dataConfirmacaoPagamento) {
      this.dataConfirmacaoPagamento = dataConfirmacaoPagamento;
    }    

}
