package ifto.Aula2.model.entity;

import javax.persistence.Id;
import java.io.Serializable;
public class Pessoa implements Serializable {
    private Long id;
    private  String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
