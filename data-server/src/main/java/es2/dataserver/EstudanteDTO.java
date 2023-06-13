package es2.dataserver;

public class EstudanteDTO {
    private long matricula;
    private String docnum;
    private String nome;
    private String endereco;

    public EstudanteDTO(long matricula, String docnum, String nome, String endereco) {
        this.matricula = matricula;
        this.docnum = docnum;
        this.nome = nome;
        this.endereco = endereco;
    }

    public EstudanteDTO() {
    }

    public EstudanteDTO(Estudante estudante)
    {
        this.matricula = estudante.getMatricula();
        this.docnum = estudante.getDocnum();
        this.nome = estudante.getNome();
        this.endereco = estudante.getEndereco();
    }

    public long getMatricula() {
        return matricula;
    }

    public String getDocnum() {
        return docnum;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    
    
}
