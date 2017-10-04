package br.esp.abt.models.affiliation;

import io.yawp.repository.IdRef;
import io.yawp.repository.annotations.Endpoint;
import io.yawp.repository.annotations.Id;
import io.yawp.repository.annotations.Index;

@Endpoint(path = "/affiliates")
public class Affiliate {

    @Id
    private IdRef<Affiliate> id;
    
    @Index
    private Integer register;
    
    private String name;
    
    private String email;
    
    private Integer gup;
    
    @Index
    private Integer degree;

    public IdRef<Affiliate> getId() {
      return id;
    }

    public void setId(IdRef<Affiliate> id) {
      this.id = id;
    }

    public Integer getRegister() {
      return register;
    }

    public void setRegister(Integer register) {
      this.register = register;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getEmail() {
      return email;
    }

    public void setEmail(String email) {
      this.email = email;
    }

    public Integer getGup() {
      return gup;
    }

    public void setGup(Integer gup) {
      this.gup = gup;
    }

    public Integer getDegree() {
      return degree;
    }

    public void setDegree(Integer degree) {
      this.degree = degree;
    }

    
    
}
