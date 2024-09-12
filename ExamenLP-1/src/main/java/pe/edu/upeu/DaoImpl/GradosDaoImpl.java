package pe.edu.upeu.DaoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import pe.edu.upeu.Dao.GradosDao;
import pe.edu.upeu.Entity.Grados;
import pe.edu.upeu.Repository.GradosRps;

@Component
public class GradosDaoImpl implements GradosDao{
@Autowired
private GradosRps gradosRps;

@Override
public Grados create(Grados g) {
	// TODO Auto-generated method stub
	return gradosRps.save(g)
			;
}

@Override
public Grados update(Grados g) {
	// TODO Auto-generated method stub
	return gradosRps.save(g);
}

@Override
public void delete(Long id) {
	// TODO Auto-generated method stub
	gradosRps.deleteById(id);
}

@Override
public Optional<Grados> read(Long id) {
	// TODO Auto-generated method stub
	return gradosRps.findById(id);
}

@Override
public List<Grados> readAll() {
	// TODO Auto-generated method stub
	return gradosRps.findAll();
}

}
