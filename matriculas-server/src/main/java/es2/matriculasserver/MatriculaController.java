package es2.matriculasserver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MatriculaController {
    @Autowired
    matriculasProxy proxy;

    @PostMapping("matricula-server/matricularEstudante")
    public boolean matricularEstudante(@RequestBody Estudante estudante)
    {
        return proxy.matricularEstudante(estudante);
    }

    @PostMapping("matricula-server/matricularEstudantes")
    public boolean matricularEstudante(@RequestBody List<Estudante> estudantes)
    {
        boolean bool = true;
        for (Estudante estudante : estudantes) {
            bool &= matricularEstudante(estudante);
        }
        return bool;
    }

    @PostMapping("matricula-server/cadastraDisciplina")
    public boolean cadastraDisciplina(@RequestBody Disciplina disciplina)
    {
        return proxy.cadastraDisciplina(disciplina);
    }

    @PostMapping("matricula-server/cadastraDisciplinas")
    public boolean cadastraDisciplina(@RequestBody List<Disciplina> disciplinas)
    {
        boolean bool = true;
        for (Disciplina disciplina : disciplinas) {
            bool &= cadastraDisciplina(disciplina);
        }
        return bool;
    }

    @PutMapping("matricula-server/matricula/estudante{matricula}/disciplina{codigo}/turma{turmacodigo}")
    public boolean matricularEm(@PathVariable long matricula, @PathVariable String codigo, @PathVariable long turmacodigo)
    {
        return proxy.matricularEm(matricula, codigo, turmacodigo);
    }
}
