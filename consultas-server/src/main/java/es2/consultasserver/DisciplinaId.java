package es2.consultasserver;

import java.io.Serializable;

public class DisciplinaId implements Serializable{
    private long turmacodigo;
    private String codigo;

    public DisciplinaId() {}
    
    public DisciplinaId(long turmacodigo, String codigo) {
        this.turmacodigo = turmacodigo;
        this.codigo = codigo;
    }

}

