package session_06;
import java.io.FileOutputStream;
import java.io.IOException;

public class D {
	public static void main(String[] args) throws IOException {
		int  no=65;
		 //String star = "Hello World!!";
		
		FileOutputStream fos=new FileOutputStream("C:\\Users\\group024\\Desktop\\Core_Java\\abc.txt",true);
		
		fos.write(no);
		
		//byte[] b=star.getBytes();
		//fos.write(b);
		
		System.out.println("Success");
		
		fos.close();
		
	}
}
