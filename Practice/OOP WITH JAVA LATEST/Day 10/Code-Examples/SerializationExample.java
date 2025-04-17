package io_programming;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "./src/resources/course.txt";
		try(FileOutputStream fout = new FileOutputStream(filePath);
				ObjectOutputStream out = new ObjectOutputStream(fout)
				){
			Course cr = new Course("Spring", 5);
			out.writeObject(cr);//Serializing the Course Object referred as 'cr'
			System.out.println("Object serialized.");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
