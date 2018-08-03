package ex1;

public class Application {

	public static void main(String[] args) {
		
		/* Créer une instance ImplInterface1 qui va donner la note minimale entre deux étudiants.
		 * v1 = 14
		 * v2 = 12
		 * Puis donner la note maximale.
		 */
		ImplInterface1 note = new ImplInterface1();
		
		note.setV1(14);
		note.setV2(12);
		
		System.out.println("La note minimale entre les deux étudients est: " + note.minimum() + ".");
		System.out.println("La note maximale entre les deux étudients est: " + note.maximum() + ".");
		
		/* Créer une instance ImplInterface2 qui va donner la taille minimum et la taille maximum entre trois étudiants.
		 * v1 = 165
		 * v2 = 189
		 * v3 = 171
		 */
		ImplInterface2 taille = new ImplInterface2();
		
		taille.setV1(165);
		taille.setV2(189);
		taille.setV3(171);
		
		System.out.println("La taille minimum entre les trois étudiants est : " + taille.minimum() + ".");
		System.out.println("La taille maximum entre les trois étudiants est : " + taille.maximum() + ".");
		
	}

}
