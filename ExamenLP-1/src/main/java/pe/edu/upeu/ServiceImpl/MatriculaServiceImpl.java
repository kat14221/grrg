package pe.edu.upeu.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Dao.MatriculasDao;
import pe.edu.upeu.Entity.Matriculas;
import pe.edu.upeu.Service.MatriculasService;

@Service
public class MatriculaServiceImpl implements MatriculasService{
@Autowired
private MatriculasDao matriculasDao;

@Override
public Matriculas create(Matriculas m) {
	// TODO Auto-generated method stub
	return matriculasDao.create(m);
}

@Override
public Matriculas update(Matriculas m) {
	// TODO Auto-generated method stub
	return matriculasDao.update(m);
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	matriculasDao.delete(id);;
}

@Override
public Optional<Matriculas> read(Long id) {
	// TODO Auto-generated method stub
	return matriculasDao.read(id);
}

@Override
public List<Matriculas> readAll() {
	// TODO Auto-generated method stub
	return matriculasDao.readAll();
}

}
