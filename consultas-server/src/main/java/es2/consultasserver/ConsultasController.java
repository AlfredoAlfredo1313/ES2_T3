package es2.consultasserver;


import java.math.BigDecimal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsultasController {
    
    @Autowired
    private ConsultasProxy proxy;

    //matricula
    @GetMapping("/consultas-server-feign/consulta-estudante-by-matricula/{matricula}")
    public Estudante getEstudanteMatriculaFeign(@PathVariable long matricula) {
        Estudante currencyConversion = proxy.getEstudanteByMatricula(matricula);
        return new Estudante(currencyConversion.getMatricula(),  
			currencyConversion.getDocnum(), 
			currencyConversion.getNome(), 
			currencyConversion.getEndereco(),
            currencyConversion.getDisciplinas()
        );
    }

    //parte nome
    @GetMapping("/consultas-server-feign/consulta-estudante-parte-nome/{nome}")
    public List<Estudante> getParteNome(@PathVariable String nome) {
        List <Estudante> currencyConversion = proxy.getParteNome(nome);
        
        return currencyConversion;
    }

    
    //todos estudantes
    /*@GetMapping("/consultas-server-feign/todos-estudantes")
    public List<Estudante> getTodosEstudantesx(@PathVariable String nome) {
        List <Estudante> currencyConversion = proxy.getodosEstudantes();
        
        return currencyConversion;
    }*/

    //consultar disciplinas de um estudante
    @GetMapping("/consultas-server-feign/consultar-disciplinas-estudante/{matricula}")
    public List<Estudante> getDisciplinaPorEstudante(@PathVariable long matricula) {
        List <Estudante> currencyConversion = proxy.getDisciplinasEmEstudante(matricula);
        
        return currencyConversion;
    }

     //consultar estudantes de uma disciplina
    @GetMapping("/consultas-server-feign/consultar-disciplinas-estudante/{codigo}/{turmacodigo}")
    public List<Disciplina> getDisciplinaPorEstudante(@PathVariable String codigo, @PathVariable String turmacodigo) {
        List <Disciplina> currencyConversion = proxy.getEstudantesEmDisciplina(codigo, turmacodigo);
        
        return currencyConversion;
    }

    
}
