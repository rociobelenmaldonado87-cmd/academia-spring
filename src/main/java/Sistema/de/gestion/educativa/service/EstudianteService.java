package Sistema.de.gestion.educativa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import Sistema.de.gestion.educativa.model.Estudiante;
import Sistema.de.gestion.educativa.repository.EstudianteRepository;

@Service
public class EstudianteService {

    private final EstudianteRepository estudianteRepository;

    public EstudianteService(EstudianteRepository estudianteRepository) {
        this.estudianteRepository = estudianteRepository;
    }

    public List<Estudiante> listar() {
        return estudianteRepository.findAll();
    }

    public Estudiante guardar(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    public Optional<Estudiante> buscarPorId(Long id) {
        return estudianteRepository.findById(id);
    }

    public void eliminar(Long id) {
        estudianteRepository.deleteById(id);
    }
}