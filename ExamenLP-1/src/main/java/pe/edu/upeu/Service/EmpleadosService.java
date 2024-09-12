package pe.edu.upeu.Service;

import java.util.List;
import java.util.Optional;

import pe.edu.upeu.Entity.Empleados;

public interface EmpleadosService {
	Empleados create(Empleados e);
	Empleados update(Empleados e);
	void delete(Long id);
	Optional<Empleados> read(Long id);
	List<Empleados> readAll();
}