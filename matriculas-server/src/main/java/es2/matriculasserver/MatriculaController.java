package es2.matriculasserver;

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

    @PostMapping("matricularEstudante")
    public boolean maticulaEstudante(@RequestBody Estudante estudante)
    {
        return proxy.matricularEstudante(estudante);
    }

    @PostMapping("cadastraDisciplina")
    public boolean cadastraDisciplina(@RequestBody Disciplina disciplina)
    {
        return proxy.cadastraDisciplina(disciplina);
    }

    @PutMapping("matricula/estudante{matricula}/disciplina{codigo}/turma{turmacodigo}")
    public boolean matricularEm(@PathVariable long matricula, @PathVariable String codigo, @PathVariable long turmacodigo)
    {
        return proxy.matricularEm(matricula, codigo, turmacodigo);
    }
}
