package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student = new Student(1, "Asad", "Khan");
		String fileName = "serialized.txt";
		try{
			//Saving of object in a file 
            FileOutputStream file = new FileOutputStream(fileName); 
            ObjectOutputStream out = new ObjectOutputStream(file); 
              
            // Method for serialization of object 
            out.writeObject(student); 
              
            out.close(); 
            file.close(); 
              
            System.out.println("Object has been serialized"); 
		}catch(IOException ioe){
			ioe.printStackTrace();
		}
		
		 Student anotherOne = null; 
		   
	        try
	        {    
	            // Reading the object from a file 
	            FileInputStream file = new FileInputStream(fileName); 
	            ObjectInputStream in = new ObjectInputStream(file); 
	              
	            // Method for deserialization of object 
	            anotherOne = (Student)in.readObject(); 
	              
	            in.close(); 
	            file.close(); 
	              
	            System.out.println("Object has been deserialized "); 
	            System.out.println("ID = " + anotherOne.id); 
	            System.out.println("Name = " + anotherOne.name);
	            System.out.println("Father Name = " + anotherOne.fatherName); 
	        } 
	          
	        catch(IOException ex) 
	        { 
	            System.out.println("IOException is caught"); 
	        } 
	          
	        catch(ClassNotFoundException ex) 
	        { 
	            System.out.println("ClassNotFoundException is caught"); 
	        } 
	}

}
