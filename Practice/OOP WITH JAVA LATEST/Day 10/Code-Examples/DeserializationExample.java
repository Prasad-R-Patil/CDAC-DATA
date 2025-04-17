package io_programming;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "./src/resources/course.txt";
		try(
				FileInputStream fin = new FileInputStream(filePath);
				ObjectInputStream in = new ObjectInputStream(fin)
				) {
			Object deserializedObject = in.readObject();//De-serializing the Course object
			System.out.println(deserializedObject);
			System.out.println("-------------------------------");
			//To invoke individual methods e.g. getters, type casting is required
			Course foundCourse = (Course)deserializedObject;
			String courseTitle = foundCourse.getTitle();
			int courseDuration = foundCourse.getDuration();
			System.out.println("Title is " + courseTitle + " and Duration is " + courseDuration);
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
