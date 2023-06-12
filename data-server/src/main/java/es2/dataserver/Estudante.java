package es2.dataserver;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import java.util.List;

@Entity
public class Estudante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long matricula;
    private String docnum;
    private String nome;
    private String endereco;
    @ManyToMany
    private List<Disciplina> disciplinas;

    public Estudante(){}

    public Estudante(long matricula, String docnum, String nome, String endereco) {
        this.matricula = matricula;
        this.docnum = docnum;
        this.nome = nome;
        this.endereco = endereco;
    }

    public long getMatricula() {
        return matricula;
    }

    public String getDocNum() {
        return docnum;
    }

    public String getNome() {
        return nome;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public void setDocNum(String docnum) {
        this.docnum = docnum;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public String getEndereco() {
        return endereco;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public boolean addDisciplina(Disciplina disciplina)
    {
        return disciplinas.add(disciplina);
    }


    
}
