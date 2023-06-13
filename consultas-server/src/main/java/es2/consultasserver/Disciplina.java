package es2.consultasserver;

import java.util.List;

public class Disciplina {
    private long turmacodigo;
    private String codigo;
    private String nome;
    private String horario;
    private List<Estudante> estudantes;

     public Disciplina(){}

    public Disciplina(long turmacodigo, String codigo, String nome, String horario, List<Estudante> estudantes) {
        this.turmacodigo = turmacodigo;
        this.codigo = codigo;
        this.nome = nome;
        this.horario = horario;
        this.estudantes = estudantes;
    }

    
    public long getTurmacodigo() {
        return turmacodigo;
    }

    public void setTurmacodigo(long turmacodigo) {
        this.turmacodigo = turmacodigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public List<Estudante> getEstudantes() {
        return estudantes;
    }

    public void setEstudantes(List<Estudante> estudantes) {
        this.estudantes = estudantes;
    }

    

    
}
