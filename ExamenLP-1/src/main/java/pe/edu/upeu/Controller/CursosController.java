package pe.edu.upeu.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import pe.edu.upeu.Entity.Cursos;
import pe.edu.upeu.Service.CursosService;

@RestController
@RequestMapping("/api/cursoss")
public class CursosController {
	@Autowired
	private CursosService CursosService;
	@GetMapping
	public ResponseEntity<List<Cursos>> readAll(){
	        try {
	            List<Cursos> a = CursosService.readAll();
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
	 public ResponseEntity<Cursos> read(@PathVariable("id") Long id) {
	        Optional<Cursos> a = CursosService.read(id);
	        if (a != null) {
	                return new ResponseEntity<>(a.get(), HttpStatus.OK);
	        } else {
	                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	        }
}
	@PostMapping
	public ResponseEntity<Cursos> create(@Valid @RequestBody Cursos a){
	        try {
	            Cursos l = CursosService.create(a);
	            return new ResponseEntity<>(l, HttpStatus.ACCEPTED);
	        } catch (Exception e) {
	            // TODO: handle exception 
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }

	    }
	@DeleteMapping
	public ResponseEntity<Cursos> delete(@PathVariable("id") Long id){
       try {
           CursosService.delete(id);
           return new ResponseEntity<>(HttpStatus.NO_CONTENT);
       } catch (Exception e) {
           // TODO: handle exception
           return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
       }

   }
	
}
