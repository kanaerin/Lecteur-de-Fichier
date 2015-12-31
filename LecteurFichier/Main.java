package LecteurFichier;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Lecture normal :");
		LecteurFichier lineNormal = new LecteurFichier("text.txt");
		lineNormal.Display();
		
		System.out.println("\n");
		
		System.out.println("Lecture ˆ l'envers :");
		ReverseLecteur lineReverse = new ReverseLecteur("text.txt");
		lineReverse.Display();
	
	}

}
