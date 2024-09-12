package pe.edu.upeu.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Dao.CursosDao;
import pe.edu.upeu.Entity.Cursos;
import pe.edu.upeu.Service.CursosService;

@Service
public class CursosServiceImpl implements CursosService{
	@Autowired
	private CursosDao cursosDao;

	@Override
	public Cursos create(Cursos a) {
		// TODO Auto-generated method stub
		return cursosDao.create(a);
	}

	@Override
	public Cursos update(Cursos a) {
		// TODO Auto-generated method stub
		return cursosDao.update(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		cursosDao.delete(id);
	}

	@Override
	public Optional<Cursos> read(Long id) {
		// TODO Auto-generated method stub
		return cursosDao.read(id);
	}

	@Override
	public List<Cursos> readAll() {
		// TODO Auto-generated method stub
		return cursosDao.readAll();
	}
	
}
