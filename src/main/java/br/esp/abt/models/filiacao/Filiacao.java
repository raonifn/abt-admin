package br.esp.abt.models.filiacao;

import java.util.Date;

import br.esp.abt.models.anofiliacao.AnoFiliacao;
import br.esp.abt.models.filiado.Filiado;
import io.yawp.repository.IdRef;
import io.yawp.repository.annotations.Endpoint;
import io.yawp.repository.annotations.Id;

@Endpoint(path = "/filiacoes")
public class Filiacao {

    @Id
    private IdRef<Filiacao> id;
    
    private IdRef<AnoFiliacao> anoFiliacao;
    
    private IdRef<Filiado> idFiliado;
        
    private Date dataConfirmacaoPagamento;
    
    public IdRef<AnoFiliacao> getAnoFiliacao() {
      return anoFiliacao;
    }

    public void setAnoFiliacao(IdRef<AnoFiliacao> anoFiliacao) {
      this.anoFiliacao = anoFiliacao;
    }

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


    public Date getDataConfirmacaoPagamento() {
      return dataConfirmacaoPagamento;
    }

    public void setDataConfirmacaoPagamento(Date dataConfirmacaoPagamento) {
      this.dataConfirmacaoPagamento = dataConfirmacaoPagamento;
    }    

}
