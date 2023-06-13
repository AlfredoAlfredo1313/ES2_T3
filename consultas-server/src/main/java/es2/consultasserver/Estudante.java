package es2.consultasserver;

import java.util.List;

public class Estudante 
{
    private long matricula;
    private String nome;
    private String docnum;
    private String endereco;

    public Estudante(){}

    public Estudante(long matricula, String docnum, String nome, String endereco) {
        this.matricula = matricula;
        this.nome = nome;
        this.endereco = endereco;
        this.docnum = docnum;
    }
    
    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public String getDocnum() {
        return docnum;
    }

    public void setDocnum(String docnum) {
        this.docnum = docnum;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}

