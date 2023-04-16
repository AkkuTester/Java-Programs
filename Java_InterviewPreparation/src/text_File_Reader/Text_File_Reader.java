package text_File_Reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Text_File_Reader {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		/*
		 * Approach 1 - using file and scanner class
		 */
		String filePath = "E:\\Text-Reader\\Text1.txt";
		
		File file = new File(filePath);
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
		sc.close();
		
		/*
		 * Approach 2 - using fileReader and bufferReader classs
		 */
		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		
		String str;
		while((str = br.readLine())!=null){
			System.out.println(str);
		}
	}
	
	

}
