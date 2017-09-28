package br.esp.abt.models.filiado;

import io.yawp.repository.IdRef;
import io.yawp.repository.annotations.Endpoint;
import io.yawp.repository.annotations.Id;
import io.yawp.repository.annotations.Index;

@Endpoint(path = "/filiados")
public class Filiado {

    @Id
    private IdRef<Filiado> id;
    
    @Index
    private Integer registro;
    
    private String nome;
    
    private String email;
    
    private Integer graduacaoGup;
    
    @Index
    private Integer graduacaoDan;

    public IdRef<Filiado> getId() {
      return id;
    }

    public void setId(IdRef<Filiado> id) {
      this.id = id;
    }

    public Integer getRegistro() {
      return registro;
    }

    public void setRegistro(Integer registro) {
      this.registro = registro;
    }

    public String getNome() {
      return nome;
    }

    public void setNome(String nome) {
      this.nome = nome;
    }

    public String getEmail() {
      return email;
    }

    public void setEmail(String email) {
      this.email = email;
    }

    public Integer getGraduacaoGup() {
      return graduacaoGup;
    }

    public void setGraduacaoGup(Integer graduacaoGup) {
      this.graduacaoGup = graduacaoGup;
    }

    public Integer getGraduacaoDan() {
      return graduacaoDan;
    }

    public void setGraduacaoDan(Integer graduacaoDan) {
      this.graduacaoDan = graduacaoDan;
    }
    
    
}
