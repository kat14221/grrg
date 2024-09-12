package pe.edu.upeu.Controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import pe.edu.upeu.Entity.Alumnos;
import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import pe.edu.upeu.Service.AlumnosService;

@RestController
@RequestMapping("/api/alumnoss")
public class AlumnosController {
	@Autowired
	private AlumnosService alumnosService;
	
	@GetMapping
	public ResponseEntity<List<Alumnos>> readAll(){
	        try {
	            List<Alumnos> a = alumnosService.readAll();
	            if(a.isEmpty()) {
	                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	            }
	            return new ResponseEntity<>(a, HttpStatus.OK);
	        } catch (Exception e) {
	            // TODO: handle exception
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }

	    }
	
	@GetMapping("/{id}")
	 public ResponseEntity<Alumnos> read(@PathVariable("id") Long id) {
	        Optional<Alumnos> a = alumnosService.read(id);
	        if (a != null) {
	                return new ResponseEntity<>(a.get(), HttpStatus.OK);
	        } else {
	                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	        }
}
	@PostMapping
	public ResponseEntity<Alumnos> create(@Valid @RequestBody Alumnos a){
	        try {
	            Alumnos l = alumnosService.create(a);
	            return new ResponseEntity<>(l, HttpStatus.OK);
	        } catch (Exception e) {
	            // TODO: handle exception
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }

	    }
	@DeleteMapping
	public ResponseEntity<Alumnos> delete(@PathVariable("id") Long id){
        try {
            alumnosService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            // TODO: handle exception
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
	
}
