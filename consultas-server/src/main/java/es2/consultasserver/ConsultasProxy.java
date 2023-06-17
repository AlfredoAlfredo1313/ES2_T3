package es2.consultasserver;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "data-server")
public interface ConsultasProxy {
    
    @GetMapping("data/getEstudante/{matricula}")
    public Estudante getEstudanteByMatricula(@PathVariable long matricula);

    @GetMapping("data/getEstudante")
    public List<Estudante> getodosEstudantes();

    @GetMapping("data/getDisciplina/{codigo}/{turmacodigo}/Estudantes")
    public Disciplina getDisciplina(@PathVariable String codigo, @PathVariable long turmacodigo);

    @GetMapping("data/getEstudante/{matricula}/Disciplinas")
    public List<Disciplina> findEstudanteDisciplinas(@PathVariable long matricula);

    @GetMapping("data/getDisciplina/{codigo}/{turmacodigo}/Estudantes")
    public List<Estudante> findDisciplinaEstudante(@PathVariable String codigo, @PathVariable long turmacodigo);
    
}

