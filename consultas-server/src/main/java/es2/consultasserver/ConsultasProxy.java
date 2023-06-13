package es2.consultasserver;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "data-server")
public interface ConsultasProxy {
    
    @GetMapping("getEstudante/{matricula}")
    public Estudante getEstudanteByMatricula(@PathVariable long matricula);

    @GetMapping("getEstudante/{nome}")
    public Estudante getParteNome(@PathVariable String nome);

    @GetMapping("getDisciplina/Codigo/TurmaCodigo/Estudantes")
    public Disciplina getodosEstudantes();

    @GetMapping("getEstudante/{matricula}/Disciplinas")
    public Estudante getDisciplinasEmEstudante(@PathVariable long matricula);

    @GetMapping("getDisciplina/{codigo}/{turmacodigo}/Estudantes")
    public Disciplina getEstudantesEmDisciplina(@PathVariable String codigo, @PathVariable String turmacodigo);
    
}

