package mainCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ReadFromFile {
	public static void fileReader(String fileName) throws IOException{
		
		//method to read from a file, requires the file name as String input.
		ArrayList <String> textFromFile = new ArrayList <String>();
		BufferedReader bfrIn = new BufferedReader (new FileReader(fileName));
		String line = " ";
		while (((line = bfrIn.readLine()) != null)){
			textFromFile.add(line);
		}
		//stored the info from file in arraylist called textFromFile.
		bfrIn.close();
		
		for(int i = 0; i < textFromFile.size(); i++){  //quick print out to check it works
			System.out.print(textFromFile.get(i) + " ");
		}
	}	
}
