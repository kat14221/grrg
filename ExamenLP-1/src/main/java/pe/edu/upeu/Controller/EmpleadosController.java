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
import pe.edu.upeu.Entity.Empleados;
import pe.edu.upeu.Service.EmpleadosService;

@RestController
@RequestMapping("/api/empleadoss")
public class EmpleadosController {
	@Autowired 
	private EmpleadosService empleadosService;
	@GetMapping
	public ResponseEntity<List<Empleados>> readAll(){
	        try {
	            List<Empleados> a = empleadosService.readAll();
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
	 public ResponseEntity<Empleados> read(@PathVariable("id") Long id) {
	        Optional<Empleados> a = empleadosService.read(id);
	        if (a != null) {
	                return new ResponseEntity<>(a.get(), HttpStatus.OK);
	        } else {
	                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	        }
}
	@PostMapping
	public ResponseEntity<Empleados> create(@Valid @RequestBody Empleados a){
	        try {
	            Empleados l = empleadosService.create(a);
	            return new ResponseEntity<>(l, HttpStatus.CREATED);
	        } catch (Exception e) {
	            // TODO: handle exception
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }

	    }
	@DeleteMapping
	public ResponseEntity<Empleados> delete(@PathVariable("id") Long id){
      try {
          empleadosService.delete(id);
          return new ResponseEntity<>(HttpStatus.NO_CONTENT);
      } catch (Exception e) {
          // TODO: handle exception
          return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
      }

  }
}
