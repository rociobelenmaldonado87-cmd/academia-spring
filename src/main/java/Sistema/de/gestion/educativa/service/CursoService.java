package Sistema.de.gestion.educativa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import Sistema.de.gestion.educativa.model.Curso;
import Sistema.de.gestion.educativa.repository.CursoRepository;

@Service
public class CursoService {

    private final CursoRepository cursoRepository;

    public CursoService(CursoRepository cursoRepository) {
        this.cursoRepository = cursoRepository;
    }

    public List<Curso> listar() {
        return cursoRepository.findAll();
    }

    public Curso guardar(Curso curso) {
        return cursoRepository.save(curso);
    }

    public Optional<Curso> buscarPorId(Long id) {
        return cursoRepository.findById(id);
    }

    public void eliminar(Long id) {
        cursoRepository.deleteById(id);
    }
}