package es2.dataserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class dataController
{
    @Autowired
    private estudanteRepo repository;

    @GetMapping("getEstudante")
    public List<Estudante> getTodos()
    {
        return repository.findAll();
    }

    @GetMapping("getEstudante/{matricula}")
    public Estudante getByMatricula(@PathVariable long matricula)
    {
        return repository.findByMatricula(matricula);
    }
}