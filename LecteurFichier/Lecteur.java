package LecteurFichier;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

public abstract class Lecteur implements LecteurdeFichier {

	File file;
	private ArrayList<String> content;
	
	public Lecteur() {
		this.content = new ArrayList<String>();
		this.file = file;
	}

	public ArrayList<String> getContent() {
		return content;
	}
	
	public boolean CheckFile(String fileName) {
		file = new File(fileName);
		
		if(this.file.exists() && this.file.canRead()) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public void readFile() {
		
		try{
			InputStream f = new FileInputStream(file);
			InputStreamReader fread = new InputStreamReader(f);
			BufferedReader fbuf = new BufferedReader(fread);
			
			String line;
			
			while((line = fbuf.readLine())!=null) {
				getContent().add(line);
			}
			
			fbuf.close();
			
		} catch(Exception e) {
			e.printStackTrace();
		}

	}
	
	public abstract void Display();

}
