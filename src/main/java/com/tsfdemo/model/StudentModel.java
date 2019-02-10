package com.tsfdemo.model;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="student_model")
public class StudentModel {  
	
	@Id
	@Column(name = "Id")
	private long id; 
	
	@Column(name = "Name")
	private String name;    
	 
	
	public StudentModel()
	{
		
	}
	public StudentModel(long id,String name) {
		this.id = id;
		this.name = name;
		
	}
	
	public long getId() {    
	    return id;    
	}    
	public void setId(long l) {    
	    this.id = l;    
	}    
	public String getName() {    
	    return name;    
	}    
	public void setName(String name) {    
	    this.name = name;    
	}
	

  
	
}
public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
  
  
	
}
