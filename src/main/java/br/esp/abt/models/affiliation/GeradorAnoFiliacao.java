package br.esp.abt.models.affiliation;

import java.util.List;

import br.esp.abt.models.organization.Gymn;
import io.yawp.commons.http.annotation.PUT;
import io.yawp.repository.actions.Action;

public class GeradorAnoFiliacao extends Action<AffiliatedGymn> {

  @PUT("gerar")
  public void gerar() {
    List<Gymn> gymns = yawp(Gymn.class).where("active", "=", "true").list();
  }
}
