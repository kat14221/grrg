package pe.edu.upeu.Dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.Entity.Matriculas;

public interface MatriculasDao {
	Matriculas create(Matriculas m);
	Matriculas update(Matriculas m);
	void delete(Long id);
	Optional<Matriculas> read(Long id);
	List<Matriculas> readAll();
}
