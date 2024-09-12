package pe.edu.upeu.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.Dao.AlumnosDao;
import pe.edu.upeu.Entity.Alumnos;
import pe.edu.upeu.Repository.AlumnosRps;

@Component
public class AlumnosDaoImpl implements AlumnosDao {
	@Autowired
	private AlumnosRps alumnosRps;

	@Override
	public Alumnos create(Alumnos a) {
		// TODO Auto-generated method stub
		return alumnosRps.save(a);
	}

	@Override
	public Alumnos update(Alumnos a) {
		// TODO Auto-generated method stub
		return alumnosRps.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		alumnosRps.deleteById(id);;
	}

	@Override
	public Optional<Alumnos> read(Long id) {
		// TODO Auto-generated method stub
		return alumnosRps.findById(id);
	}

	@Override
	public List<Alumnos> readAll() {
		// TODO Auto-generated method stub
		return alumnosRps.findAll();
	}
}
