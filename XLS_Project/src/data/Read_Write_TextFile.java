package data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read_Write_TextFile {

	public static void main(String[] args) throws IOException {

//		Create text file
		File f = new File("E:\\Computer Science\\Software Testing\\Projects\\testing\\temp.text");
		f.createNewFile();

//		Write into text file
		FileWriter fw = new FileWriter("E:\\Computer Science\\Software Testing\\Projects\\testing\\temp.text");
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("Hi, I am writing line 1 using java code"); // Cursor stays on the same line
		bw.newLine(); // Sets cursor onto the next line
		bw.write("This is line 2");
		bw.newLine();
		bw.write("This is line 3");
		bw.newLine();
		bw.write("This is line 4");

//		Save file from java memory to our local folder
		bw.flush();

//		Close BufferedWriter
		bw.close();

//		Read from the text file
		FileReader fr = new FileReader("E:\\Computer Science\\Software Testing\\Projects\\testing\\temp.text");
		BufferedReader br = new BufferedReader(fr);

		// Read first line and sets cursor to the next line
		/*
		 * System.out.println(rd.readLine()); System.out.println(rd.readLine());
		 * System.out.println(rd.readLine()); System.out.println(rd.readLine()); Prints
		 * null if the line is empty
		 */

		int i = 0;
		String str;
		while ((str = br.readLine()) != null) {
			System.out.println(str);
			i++;
		}
		System.out.println(i);

//		Close Buffered Reader
		br.close();

	}

}
