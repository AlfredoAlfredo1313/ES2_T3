package es2.dataserver;

public class DisciplinaDTO {
    private long turmacodigo;
    private String codigo;
    private String nome;
    private String horario;
    
    public DisciplinaDTO(long turmacodigo, String codigo, String nome, String horario) {
        this.turmacodigo = turmacodigo;
        this.codigo = codigo;
        this.nome = nome;
        this.horario = horario;
    }

    public DisciplinaDTO() {
    }

    public DisciplinaDTO(Disciplina disciplina)
    {
        this.turmacodigo = disciplina.getTurmacodigo();
        this.codigo = disciplina.getCodigo();
        this.nome = disciplina.getNome();
        this.horario = disciplina.getHorario();
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
