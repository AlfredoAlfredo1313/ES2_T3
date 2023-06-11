package es2.dataserver;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.CascadeType;
import java.util.List;

@Entity
public class Disciplina {
    @Id
    private String codigo;
    private int turmaCodigo;
    private String nome;
    private String horario;
    @ManyToMany(mappedBy = "disciplinas",
                cascade = CascadeType.ALL)
    private List<Estudante> estudantes;

    public Disciplina(){}

    public Disciplina(String codigo, String nome, String horario, int turmaCodigo) {
        this.codigo = codigo;
        this.nome = nome;
        this.horario = horario;
        this.turmaCodigo = turmaCodigo;
    }
    

}
