package br.esp.abt.models.organization;

import java.util.List;

import io.yawp.repository.IdRef;
import io.yawp.repository.annotations.Endpoint;
import io.yawp.repository.annotations.Id;
import io.yawp.repository.annotations.Json;

@Endpoint(path = "/gymns")
public class Gymn {

    @Id
    private IdRef<Gymn> id;

    @Id
    private IdRef<Organization> organizationId;
    
    private boolean active;
    
    private String name;
    
    @Json
    private List<Intructor> instructors;

    public IdRef<Gymn> getId() {
      return id;
    }

    public void setId(IdRef<Gymn> id) {
      this.id = id;
    }

    public IdRef<Organization> getOrganizationId() {
      return organizationId;
    }

    public void setOrganizationId(IdRef<Organization> organizationId) {
      this.organizationId = organizationId;
    }

    public boolean isActive() {
      return active;
    }

    public void setActive(boolean active) {
      this.active = active;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public List<Intructor> getInstructors() {
      return instructors;
    }

    public void setInstructors(List<Intructor> instructors) {
      this.instructors = instructors;
    }

   
}
