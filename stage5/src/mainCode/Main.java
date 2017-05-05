package mainCode;

import java.io.IOException;

public class Main {
	
	public static void main (String [] args){
		try {
			ReadFromFile.fileReader ("C:\\users\\administrator\\Documents\\stage_5_input.txt");
		} catch (IOException e) {
			System.out.println("file not found");
			e.printStackTrace();
		}
	}
}
