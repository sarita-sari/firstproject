package com.lanos.ecommerce.project.ecommerce.project.ecommerce.project;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;

@RestController
public class ControllerWaliClass {
	@Autowired
	private ServiceWaliClass serviceWaliClass;
	
	@GetMapping("/api")
	List<PropertywaliClass>getListofpROPERTY(){
		return serviceWaliClass.getList();
	}
	
	
	@GetMapping("/api/id/{id}")
	Optional<PropertywaliClass> getListofpROPERTYbyId(@PathVariable int id){
		return serviceWaliClass.getList(id);
	}
	
	@PostMapping("/api/write")
	String writeList(@Valid @RequestBody PropertywaliClass propertywaliClass) {
		serviceWaliClass.writeList(propertywaliClass);
		return "list added succeesuflly.......";
	}
	
	@DeleteMapping("/api/delete/{id}")
	String delelelist(@PathVariable int id) {
		serviceWaliClass.deleteList(id);
		return "deleted succefully";
	}
	
	@PutMapping("/api/update/{id}")
	String updatedList(@RequestBody PropertywaliClass propertywaliClass,@PathVariable int id) {
		return serviceWaliClass.updateList(propertywaliClass, id);
		
	}

}
