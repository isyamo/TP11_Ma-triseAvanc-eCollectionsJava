package EX5_GestionBibliothèque;

public class Main {
	public static void main(String[] args) {

		Library lib = new Library();
		Book b1 = new Book("132-45658", "Java Avance", "Auteur A");
		Book b2 = new Book("132-67859", "C++", "Auteur B");

		// ajout de livre dans la biblio en indexant par son ISBN
		lib.addBookIndexed(b1);
		
		//Emprunter le livre 
		lib.borrowBook(b1, " Salima ");
		lib.borrowBook(b2,"Saad");

		System.out.println("\n Livre trouve par ISBN : " + lib.findByIsbn("132-45658"));
		
		System.out.println("\n "+lib.borrowBook(b1, "Salima"));
		System.out.println("\n "+lib.borrowBook(b2, "Saad"));
		
		//Retourner le livre
		lib.returnBook(b2);
		
		System.out.println("\n "+lib.borrowBook(b2, "Saad"));
	}

}
