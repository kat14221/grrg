package pe.edu.upeu.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.Dao.MatriculasDao;
import pe.edu.upeu.Entity.Matriculas;
import pe.edu.upeu.Repository.MatriculasRps;

@Component
public class MatriculasDaoImp implements MatriculasDao{
	@Autowired
	private MatriculasRps matriculasRps;

	@Override
	public Matriculas create(Matriculas m) {
		// TODO Auto-generated method stub
		return matriculasRps.save(m);
	}

	@Override
	public Matriculas update(Matriculas m) {
		// TODO Auto-generated method stub
		return matriculasRps.save(m);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		matriculasRps.deleteById(id);
	}

	@Override
	public Optional<Matriculas> read(Long id) {
		// TODO Auto-generated method stub
		return matriculasRps.findById(id);
	}

	@Override
	public List<Matriculas> readAll() {
		// TODO Auto-generated method stub
		return matriculasRps.findAll();
	}
	
}
