package session_10;

import java.io.FileInputStream;
import java.io.IOException;

public class Fileinput {
	public static void main(String[] args) throws IOException {
		FileInputStream fos= new FileInputStream("abc.txt");
		int i=0;
		while((i =fos.read())!=-1)
		{
			System.out.print((char)i);
		}
	}

}
