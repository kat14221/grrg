package pe.edu.upeu.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.upeu.Dao.GradosDao;
import pe.edu.upeu.Entity.Grados;
import pe.edu.upeu.Service.GradosService;
@Service
public class GradosServiceimpl implements GradosService{
	@Autowired
	private GradosDao gradosDao;

	@Override
	public Grados create(Grados g) {
		// TODO Auto-generated method stub
		return gradosDao.create(g);
	}

	@Override
	public Grados update(Grados g) {
		// TODO Auto-generated method stub
		return gradosDao.update(g);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		gradosDao.delete(id);
	}

	@Override
	public Optional<Grados> read(Long id) {
		// TODO Auto-generated method stub
		return gradosDao.read(id);
	}

	@Override
	public List<Grados> readAll() {
		// TODO Auto-generated method stub
		return gradosDao.readAll();
	}

}
