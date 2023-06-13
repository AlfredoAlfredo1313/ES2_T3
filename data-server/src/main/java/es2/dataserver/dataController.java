package es2.dataserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class dataController
{
    @Autowired
    private estudanteRepo estRepo;

    @Autowired
    private disciplinaRepo disRepo;

    @GetMapping("getEstudante")
    public List<Estudante> getTodos()
    {
        return estRepo.findAll();
    }

    @GetMapping("getEstudante/{matricula}")
    public Estudante getByMatricula(@PathVariable long matricula)
    {
        return estRepo.findByMatricula(matricula);
    }

    @GetMapping("getDisciplina")
    public List<Disciplina> findAll() 
    {
        return disRepo.findAll();
    }

    @GetMapping("getDisciplina/{codigo}/{turmacodigo}")
    public Disciplina findById(@PathVariable String codigo, @PathVariable long turmacodigo)
    {
        return disRepo.findByTurmacodigoAndCodigo(turmacodigo, codigo);
    }

    @GetMapping("getEstudante/{matricula}/Disciplinas")
    public List<DisciplinaDTO> findEstudanteDisciplinas(@PathVariable long matricula)
    {
        return getByMatricula(matricula).getDisciplinas().stream().map(d -> new DisciplinaDTO(d)).collect(Collectors.toList());
    }

    @GetMapping("getDisciplina/{codigo}/{turmacodigo}/Estudantes")
    public List<EstudanteDTO> findDisciplinaEstudante(@PathVariable String codigo, @PathVariable long turmacodigo)
    {
        return findById(codigo, turmacodigo).getEstudantes().stream().map(e -> new EstudanteDTO(e)).collect(Collectors.toList());
    }

    @PutMapping("matricular/{matricula}/{codigo}/{turmacodigo}")
    public boolean matricularEm(@PathVariable long matricula, @PathVariable String codigo, @PathVariable long turmacodigo)
    {
        Disciplina disciplina = findById(codigo, turmacodigo);
        Estudante estudante = getByMatricula(matricula);
        estudante.addDisciplina(disciplina);
        estRepo.save(estudante);
        return true;
    }

    @PostMapping("matricularEstudante")
    public boolean matricularEstudante(@RequestBody Estudante estudante)
    {
        estRepo.save(estudante);
        return true;
    }

    @PostMapping("cadastraDisciplina")
    public boolean cadastraDisciplina(@RequestBody Disciplina disciplina)
    {
        disRepo.save(disciplina);
        return true;
    }
}