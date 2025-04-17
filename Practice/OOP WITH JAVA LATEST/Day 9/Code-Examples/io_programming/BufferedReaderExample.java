package io_programming;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedReaderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "./src/resources/players.txt";
		File currentFile = new File(filePath);
		boolean fileAvailable =currentFile.exists();
		if(fileAvailable) {
			try(FileReader fr = new FileReader(currentFile);
					BufferedReader br = new BufferedReader(fr)){
				while(true) {
					String playerInfo = br.readLine();
					if(playerInfo == null)//Checking for EOF
						break;
					//Split playerInfo into pieces based upon the delimiter: '='
					String[] playerData = playerInfo.split("=");
					String name = playerData[0];
					String nickName = playerData[1];
					System.out.println("Name: " + name + ", Nickname: " + nickName);
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


