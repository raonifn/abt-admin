package br.esp.abt.models.organization;

import io.yawp.repository.IdRef;
import io.yawp.repository.annotations.Endpoint;
import io.yawp.repository.annotations.Id;
import io.yawp.repository.annotations.Index;

@Endpoint(path = "/organizations")
public class Organization {

    @Id
    private IdRef<Organization> id;

    private String name;
    
    private String headquarter;
    
    private String responsable;
    
    private String phone;
    
    @Index
    private String email;

    public IdRef<Organization> getId() {
      return id;
    }

    public void setId(IdRef<Organization> id) {
      this.id = id;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getHeadquarter() {
      return headquarter;
    }

    public void setHeadquarter(String headquarter) {
      this.headquarter = headquarter;
    }
    
    public String getResponsable() {
      return responsable;
    }

    public void setResponsable(String responsable) {
      this.responsable = responsable;
    }

    public String getPhone() {
      return phone;
    }

    public void setPhone(String phone) {
      this.phone = phone;
    }

    public String getEmail() {
      return email;
    }

    public void setEmail(String email) {
      this.email = email;
    }
    
}
