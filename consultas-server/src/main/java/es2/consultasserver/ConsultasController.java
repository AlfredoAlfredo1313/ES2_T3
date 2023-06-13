package es2.consultasserver;


import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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

    //parte do nome
    @GetMapping("/consultas-server-feign/consulta-estudante-parte-nome/{nome}")
    public List<Estudante> getParteNome(@PathVariable String nome) {
        List<Estudante> estudantes = proxy.getodosEstudantes();
        return estudantes.stream().filter(n -> n.getNome().contains(nome)).collect(Collectors.toList());
        
    //    Estudante currencyConversion = proxy.getParteNome(nome);
        // 
    //    String regexNome = currencyConversion.getNome();
        // 
        // String tiraEspeciais = Pattern.quote(regexNome);
        // Pattern pattern = Pattern.compile(tiraEspeciais);
        // Matcher matcher = pattern.matcher(nome);
// 
        // if (matcher.find()) {
        // return new Estudante(currencyConversion.getMatricula(),  
			// currencyConversion.getDocnum(), 
			// currencyConversion.getNome(), 
			// currencyConversion.getEndereco(),
            // currencyConversion.getDisciplinas()
        // );
        // }
        // return currencyConversion;
    }

    
    /*
    //todos estudantes
    @GetMapping("/consultas-server-feign/todos-estudantes")
    public Disciplina getTodosEstudantesx() {
        Disciplina currencyConversion = proxy.getodosEstudantes();
        return new Disciplina(currencyConversion.getTurmacodigo(), 
			currencyConversion.getCodigo(), 
			currencyConversion.getNome(),
            currencyConversion.getHorario(),
            currencyConversion.getEstudantes());
    }

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
    */

    
}
