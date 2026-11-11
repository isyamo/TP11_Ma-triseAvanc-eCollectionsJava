package EX1_IntroductionListeCourses;

import java.util.ArrayList;
import java.util.List;

public class ShoppingListApp {
	public static void main(String[] args) {
		List<String> shoppingList = new ArrayList<>();
		shoppingList.add("Pomme");
		shoppingList.add("Lait");
		shoppingList.add("Pain");

		System.out.println("Articles de la liste : ");

		for (String item : shoppingList) {
			System.out.println("- " + item);
		}

		shoppingList.remove("Lait");
		
		for (String item : shoppingList) {
			System.out.println("\t - " + item);
		}
		
		boolean hasApples = shoppingList.contains("Pommes");
		System.out.println("Contient des pommes ? " + hasApples);
		System.out.println("Taille finale de la liste : " + shoppingList.size());

	}

}
