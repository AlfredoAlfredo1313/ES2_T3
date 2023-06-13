package es2.consultasserver;

import java.util.List;

public class Estudante {

    private long matricula;
    private String docnum;
    private String nome;
    private String endereco;
    private List<Disciplina> disciplinas;

     public Estudante(){}

    public Estudante(long matricula, String docnum, String nome, String endereco, List<Disciplina> disciplinas) {
        this.matricula = matricula;
        this.docnum = docnum;
        this.nome = nome;
        this.endereco = endereco;
        this.disciplinas = disciplinas;
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





    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }





    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }





    public boolean addDisciplina(Disciplina disciplina)
    {
        return disciplinas.add(disciplina);
    }

}
