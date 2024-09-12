package pe.edu.upeu.Service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.Entity.Matriculas;

public interface MatriculasService {
	Matriculas create(Matriculas m);
	Matriculas update(Matriculas m);
	void delete(Long id);
	Optional<Matriculas> read(Long id);
	List<Matriculas> readAll();
}
