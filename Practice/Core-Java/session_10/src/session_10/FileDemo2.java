package session_10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileDemo2 {
	
	public static void main(String[] args) throws IOException {

		
		FileReader f1=new FileReader("abc.txt");
		
		int i=0;
		
		while((i=f1.read())!=-1)
		{
			System.out.print((char) i);
		}
		
		
		
	}

}
