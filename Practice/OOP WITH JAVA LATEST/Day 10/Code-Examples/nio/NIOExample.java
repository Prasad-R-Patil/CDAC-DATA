package nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NIOExample {
	
	private static void directoryExample() throws IOException {
		String dirPath = "./src/mywork";
		Path currentPath = Paths.get(dirPath);
		boolean dirAvailable = Files.exists(currentPath);
		if(dirAvailable)
			System.out.println("Dir exists");
		else {
			System.out.println("Dir does not exist. Creating it now");
			Files.createDirectory(currentPath);
			System.out.println("Directory created...");
		}
	}
	
	private static void fileExample() throws IOException {
		String filePath = "./src/mywork/myfile.txt";
		Path currentPath = Paths.get(filePath);
		boolean fileAvailable = Files.exists(currentPath);
		if(fileAvailable)
			System.out.println("File exists");
		else {
			System.out.println("File does not exist. Creating it now");
			Files.createFile(currentPath);
			System.out.println("File created.");
		}
		
	}
	
	private static void writeToFileExample() throws IOException {
		String filePath = "./src/mywork/myfile.txt";
		Path currentPath = Paths.get(filePath);
		String info = "Demonstrating NIO";
		byte data[] = info.getBytes();
		Files.write(currentPath, data);
		System.out.println("Data is written to file");
	}
	
	private static void readFromFileExample() throws IOException {
		//I want you to complete this
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//directoryExample();
			//fileExample();
			writeToFileExample();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
