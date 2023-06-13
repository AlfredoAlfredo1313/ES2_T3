package es2.consultasserver;

public class Disciplina {
    private long turmacodigo;
    private String codigo;
    private String nome;
    private String horario;

    public Disciplina(){}

    public Disciplina(long turmacodigo, String codigo, String nome, String horario) {
        this.turmacodigo = turmacodigo;
        this.codigo = codigo;
        this.nome = nome;
        this.horario = horario;
    }
    
    public long getTurmacodigo() {
        return turmacodigo;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getHorario() {
        return horario;
    }
}
