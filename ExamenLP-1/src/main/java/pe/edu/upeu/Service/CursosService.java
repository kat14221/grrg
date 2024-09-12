package pe.edu.upeu.Service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.Entity.Cursos;

public interface CursosService {
	Cursos create(Cursos a);
	Cursos update(Cursos a);
	void delete(Long id);
	Optional<Cursos> read(Long id);
	List<Cursos> readAll();
}