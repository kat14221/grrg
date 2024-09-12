package pe.edu.upeu.Dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.Entity.Alumnos;

public interface AlumnosDao {
	Alumnos create(Alumnos a);
	Alumnos update(Alumnos a);
	void delete(Long id);
	Optional<Alumnos> read(Long id);
	List<Alumnos> readAll();
}
