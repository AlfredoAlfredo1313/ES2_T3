package es2.dataserver;

import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface disciplinaRepo extends CrudRepository<Disciplina, DisciplinaId> {

    List<Disciplina> findAll();
    Disciplina findByTurmacodigoAndCodigo(Long turmacodigo, String codigo);
    List<Disciplina> findByTurmacodigo(Long turmacodigo);
    List<Disciplina> findByCodigo(String codigo);

}
