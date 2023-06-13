package es2.matriculasserver;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient(name = "data-server")
public interface matriculasProxy {
    
    @PostMapping("matricularEstudante")
    public boolean matricularEstudante(@RequestBody Estudante estudante);

    @PostMapping("cadastraDisciplina")
    public boolean cadastraDisciplina(@RequestBody Disciplina disciplina);

    @PutMapping("matricular/{matricula}/{codigo}/{turmacodigo}")
    public boolean matricularEm(@PathVariable long matricula, @PathVariable String codigo, @PathVariable long turmacodigo);
}
