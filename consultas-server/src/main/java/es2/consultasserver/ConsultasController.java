package es2.consultasserver;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultasController {
    
    @Autowired
    private ConsultasProxy proxy;

    //matricula
    @GetMapping("/consultas-server-feign/consulta-estudante-by-matricula/{matricula}")
    public Estudante getEstudanteMatriculaFeign(@PathVariable long matricula) {
        Estudante estudante = proxy.getEstudanteByMatricula(matricula); 
        return proxy.getEstudanteByMatricula(matricula);
    }

    //parte do nome
    @GetMapping("/consultas-server-feign/consulta-estudante-parte-nome/{nome}")
    public List<Estudante> getParteNome(@PathVariable String nome) {
        List<Estudante> estudantes = proxy.getodosEstudantes();
        return estudantes.stream().filter(n -> n.getNome().contains(nome)).collect(Collectors.toList());
    }

    //todos estudantes
    @GetMapping("/consultas-server-feign/todos-estudantes")
    public List<Estudante> getTodosEstudantesx() {
        return proxy.getodosEstudantes();
    }

    //consultar disciplinas de um estudante
    @GetMapping("/consultas-server-feign/consultar-disciplinas-estudante/{matricula}")
    public List<Disciplina> getDisciplinaPorEstudante(@PathVariable long matricula) {
        return proxy.findEstudanteDisciplinas(matricula);
    }

    //consultar estudantes de uma disciplina
    @GetMapping("/consultas-server-feign/consultar-disciplinas-estudante/{codigo}/{turmacodigo}")
    public List<Estudante> getDisciplinaPorEstudante(@PathVariable String codigo, @PathVariable long turmacodigo) {
        return proxy.findDisciplinaEstudante(codigo, turmacodigo);
    }
}
