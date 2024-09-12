package pe.edu.upeu.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.Dao.EmpleadosDao;
import pe.edu.upeu.Entity.Empleados;
import pe.edu.upeu.Repository.EmpleadosRps;

@Component
public class EmpleadosDaoImpl implements EmpleadosDao{
	@Autowired
	private EmpleadosRps empleadosRps;

	@Override
	public Empleados create(Empleados e) {
		// TODO Auto-generated method stub
		return empleadosRps.save(e);
	}

	@Override
	public Empleados update(Empleados e) {
		// TODO Auto-generated method stub
		return empleadosRps.save(e);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		empleadosRps.deleteById(id);
		
	}

	@Override
	public Optional<Empleados> read(Long id) {
		// TODO Auto-generated method stub
		return empleadosRps.findById(id);
	}

	@Override
	public List<Empleados> readAll() {
		// TODO Auto-generated method stub
		return empleadosRps.findAll();
	}
	
}
