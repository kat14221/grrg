package pe.edu.upeu.Dao;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.Entity.Grados;

public interface GradosDao {
	Grados create(Grados g);
	Grados update(Grados g);
	void delete(Long id);
	Optional<Grados> read(Long id);
	List<Grados> readAll();
}
