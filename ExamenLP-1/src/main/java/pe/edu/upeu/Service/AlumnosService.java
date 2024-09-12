package pe.edu.upeu.Service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.Entity.Alumnos;

public interface AlumnosService {
	Alumnos create(Alumnos a);
	Alumnos update(Alumnos a);
	void delete(Long id);
	Optional<Alumnos> read(Long id);
	List<Alumnos> readAll();
}
