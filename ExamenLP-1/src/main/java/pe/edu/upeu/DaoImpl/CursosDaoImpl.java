package pe.edu.upeu.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.Dao.CursosDao;
import pe.edu.upeu.Entity.Cursos;
import pe.edu.upeu.Repository.CursoRps;

@Component
public class CursosDaoImpl implements CursosDao{
	@Autowired
	private CursoRps cursoRps;

	@Override
	public Cursos create(Cursos a) {
		// TODO Auto-generated method stub
		return cursoRps.save(a);
	}

	@Override
	public Cursos update(Cursos a) {
		// TODO Auto-generated method stub
		return cursoRps.save(a);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		cursoRps.deleteById(id);
	}

	@Override
	public Optional<Cursos> read(Long id) {
		// TODO Auto-generated method stub
		return cursoRps.findById(id);
	}

	@Override
	public List<Cursos> readAll() {
		// TODO Auto-generated method stub
		return cursoRps.findAll();
	}

}
