package com.dodemath.app;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EditFile {
	
	private String recordedScore;
	BufferedReader br;
	
	public EditFile(){
		br = null;
	}

	public void writeFile(String playerscore) throws IOException {
		 File file = new File("src\\main\\java\\PlayerScore.txt");
		 FileWriter fw = new FileWriter(file.getAbsoluteFile());
		 BufferedWriter bw = new BufferedWriter(fw);
		 bw.write(playerscore);
		 bw.close();
	 }
	
	public String readFile() throws IOException {

		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader("src\\main\\java\\PlayerScore.txt"));
			while ((sCurrentLine = br.readLine()) != null) {
				recordedScore = sCurrentLine;
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return recordedScore;

	}
}
