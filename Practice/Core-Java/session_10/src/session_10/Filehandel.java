package session_10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Filehandel {
	
	public static void main(String[] args) throws IOException {
		//int no=65;
		Scanner s=new Scanner(System.in);
		FileOutputStream  fos=null;
		System.out.print("Enter String:--->  ");
		String str=s.nextLine();
		
		
		
		
		
		fos=new FileOutputStream("abc.txt",true);
		
		//fos.write(no);
		
		byte[] b=str.getBytes();
		fos.write(b);
		
		System.out.println("Success");
		
		
		
		
		
		
		
		fos.close();
	}

}
