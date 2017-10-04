package br.esp.abt.models.anofiliacao;

import java.util.List;

import br.esp.abt.models.escola.Escola;
import io.yawp.commons.http.annotation.PUT;
import io.yawp.repository.actions.Action;

public class GeradorAnoFiliacao extends Action<AnoFiliacao> {

  @PUT("gerar")
  public void gerar() {
    List<Escola> gymns = yawp(Escola.class).where("active", "=", "true").list();
  }
}
