package Sistema.de.gestion.educativa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Sistema.de.gestion.educativa.model.Curso;

@Repository
public interface CursoRepository extends JpaRepository<Curso, Long> {
}