package es2.dataserver;

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
