package io_programming;

import java.io.FileOutputStream;

public class FileWriteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "./src/resources/cartoons.txt";
		try(FileOutputStream fout = new FileOutputStream(filePath, true)){
			//In the above statement 'true' indicates APPEND mode is ON
			//By default it is OFF
			String cartoons = "\nTom and Jerry\nDoraemon";
			//Convert String into byte array
			byte cartoonData[] = cartoons.getBytes();
			fout.write(cartoonData);
			System.out.println("Data is written to file.");			
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}

	}

}
