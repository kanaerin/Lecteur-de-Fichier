package LecteurFichier;

public class ReverseLecteur extends Lecteur {

	private String fileName;
	
	public ReverseLecteur(String fileName) {
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
			for (i = getContent().size()-1; i >= 0; i--){
				System.out.println(getContent().get(i));
			}
			
		}
		else {
			System.out.println("Fichier vide");
		}
		
	}

}
