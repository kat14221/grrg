package pe.edu.upeu.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Dao.AlumnosDao;
import pe.edu.upeu.Entity.Alumnos;
import pe.edu.upeu.Service.AlumnosService;
@Service
public class AlumnosServiceImpl implements AlumnosService{
	
	@Autowired
	private AlumnosDao alumnosDao;

	@Override
	public Alumnos create(Alumnos a) {
		// TODO Auto-generated method stub
		return alumnosDao.create(a);
	}

	@Override
	public Alumnos update(Alumnos a) {
		// TODO Auto-generated method stub
		return alumnosDao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		alumnosDao.delete(id);
	}

	@Override
	public Optional<Alumnos> read(Long id) {
		// TODO Auto-generated method stub
		return alumnosDao.read(id);
	}

	@Override
	public List<Alumnos> readAll() {
		// TODO Auto-generated method stub
		return alumnosDao.readAll();
	}
	

}
