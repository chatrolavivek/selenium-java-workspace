package practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import common.resources.CommonResources;

public class PracticeClass {

	public static void main(String[] args) throws IOException {

		File f = new File("D:\\demoText.txt");
		
		
		FileWriter fw = new FileWriter("D:\\demoText.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("hey");
		bw.newLine();
		bw.write("heya");
		bw.newLine();
		bw.write("heyaa");
		bw.newLine();
		
		bw.flush();
		
		BufferedReader br = new BufferedReader(new FileReader("D:\\demoText.txt"));

		String str;
		while((str = br.readLine()) != null) {
			System.out.println(str);
		}
		
		
		
		
	}

}
