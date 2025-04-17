package io_programming;

import java.io.File;
import java.io.RandomAccessFile;

public class RandomAccessFileExaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "./src/resources/cartoons.txt";
		File currentFile = new File(filePath);
		boolean fileAvailable =currentFile.exists();
		if(fileAvailable) {
			//System.out.println("Found the file");
			try(RandomAccessFile rf = new RandomAccessFile(currentFile, "r")){
				//In the above statement, value 'r' represents READ mode
				//Obtain the file size
				long size = rf.length();
				//Obtain the midPosition
				long midPosition = size / 2;
				//Place the file pointer at this midPosition
				rf.seek(midPosition);
				while(true) {
					int data = rf.read();
					if(data == -1)
						break;
					System.out.print((char)data);
				}
				
				
			}
			catch(Exception ex) {
				ex.printStackTrace();
			}
			
		}
		else {
			System.out.println("The file does not exist.");
		}

	}

}
