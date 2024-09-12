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
import pe.edu.upeu.Entity.Grados;
import pe.edu.upeu.Service.GradosService;

@RestController
@RequestMapping("/api/gradoss")
public class GradosController {
	@Autowired 
	private GradosService gradoservice;
	
	@GetMapping
	public ResponseEntity<List<Grados>> readAll(){
	        try {
	            List<Grados> a = gradoservice.readAll();
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
	 public ResponseEntity<Grados> read(@PathVariable("id") Long id) {
	        Optional<Grados> a = gradoservice.read(id);
	        if (a != null) {
	                return new ResponseEntity<>(a.get(), HttpStatus.OK);
	        } else {
	                return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
	        }
}
	@PostMapping
	public ResponseEntity<Grados> create(@Valid @RequestBody Grados a){
	        try {
	        	Grados l = gradoservice.create(a);
	            return new ResponseEntity<>(l, HttpStatus.OK);
	        } catch (Exception e) {
	            // TODO: handle exception
	            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
	        }

	    }
	@DeleteMapping
	public ResponseEntity<Grados> delete(@PathVariable("id") Long id){
     try {
    	 gradoservice.delete(id);
         return new ResponseEntity<>(HttpStatus.NO_CONTENT);
     } catch (Exception e) {
         // TODO: handle exception
         return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
     }

 }
	
}
