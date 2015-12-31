package LecteurFichier;

public class LecteurFichier extends Lecteur {

	private String fileName;
	
	public LecteurFichier(String fileName) {
		super();
		this.fileName= fileName;
		// TODO Auto-generated constructor stub
	}

	
	
	public void Display() {
		// TODO Auto-generated method stub
		int i;
		
		boolean reverse  = super.CheckFile(fileName);
		if(reverse == true) {
			super.readFile();
			for (i = 0; i < getContent().size(); i++){
				System.out.println(getContent().get(i));
			}
			
		}
		else {
			System.out.println("Fichier vide");
		}
		
	}

}
