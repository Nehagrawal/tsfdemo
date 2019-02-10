package com.tsfdemo.controller;




import java.util.List;

import javax.validation.Valid;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tsfdemo.model.StudentModel;
import com.tsfdemo.model.StudentModel.*;
import com.tsfdemo.repository.StudentRepo;
import com.tsfdemo.repository.StudentRepo.*;

@RestController
@RequestMapping("/")
public class StudentController {

StudentModel stuMod;
	
	@Autowired
	StudentRepo studRepo;
	//Read
	@GetMapping("/showAll")
	private List<StudentModel> getAll(){
		return studRepo.findAll();
	}

	//search
	@GetMapping("search/{id}")
	private StudentModel getOne(@PathVariable(value="id") long id){
		return studRepo.findById(id).orElse(new StudentModel());
	}
	
	//Create
	@PostMapping("/addStudent")
	private StudentModel createStud(@Valid @RequestBody StudentModel studM) {
		return studRepo.save(studM);
	}
	//Update
		@PutMapping("/updateStudent/{id}")
		private StudentModel updateStudent(@PathVariable(value="id") long id, @RequestBody StudentModel st) {
				StudentModel s = new StudentModel(); 
				s = studRepo.findById(id).orElse(new StudentModel());
				s.setName(st.getName());
				
	            return studRepo.save(s);
		}

		//Delete by ID
		@DeleteMapping("/delete1/{id}")
		private void deleteStudent(@PathVariable(value="id") long id) {
			StudentModel s;
			s = studRepo.findById(id).orElse(new StudentModel());
			studRepo.delete(s);
		}

	
	
	
	
}
