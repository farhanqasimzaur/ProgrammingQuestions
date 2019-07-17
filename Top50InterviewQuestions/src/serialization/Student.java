package serialization;

import java.io.Serializable;

public class Student implements Serializable{

	public static final long serialVersionUID = 993123123L;
	transient public int id;
	public String name;
	transient public String fatherName;
	
	Student(int id, String name, String fatherName){
		this.id = id;
		this.name = name;
		this.fatherName = fatherName;
	}
	
	
}
