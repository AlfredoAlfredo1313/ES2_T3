package es2.dataserver;

import org.springframework.data.repository.CrudRepository;
import java.util.List;
import java.util.Optional;

public interface estudanteRepo extends CrudRepository<Estudante, Long> {
    List<Estudante> findAll();
    Estudante findByMatricula(long matricula);
    Optional<Estudante> findByDocnum(String docnum);
}
