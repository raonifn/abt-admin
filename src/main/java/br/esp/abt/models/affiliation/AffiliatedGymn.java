package br.esp.abt.models.affiliation;

import br.esp.abt.models.organization.Gymn;
import io.yawp.repository.IdRef;
import io.yawp.repository.annotations.Endpoint;
import io.yawp.repository.annotations.Id;
import io.yawp.repository.annotations.Index;

@Endpoint(path = "/affiliated-gymn")
public class AffiliatedGymn {

    @Id
    private IdRef<AffiliatedGymn> id;
    
    @Index
    private Integer year;

    private IdRef<Gymn> gymn;
    
    @Index
    private String uuid;


    public IdRef<AffiliatedGymn> getId() {
      return id;
    }

    public void setId(IdRef<AffiliatedGymn> id) {
      this.id = id;
    }
    
    public Integer getYear() {
      return year;
    }

    public void setYear(Integer year) {
      this.year = year;
    }

    public IdRef<Gymn> getGymn() {
      return gymn;
    }

    public void setGymn(IdRef<Gymn> gymn) {
      this.gymn = gymn;
    }

    public String getUuid() {
      return uuid;
    }

    public void setUuid(String uuid) {
      this.uuid = uuid;
    }
}
