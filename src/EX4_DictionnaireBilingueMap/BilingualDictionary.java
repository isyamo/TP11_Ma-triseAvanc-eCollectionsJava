package EX4_DictionnaireBilingueMap;

import java.util.HashMap;
import java.util.Map;

public class BilingualDictionary {
	public static void main(String[] args) {

		Map<String, String> dictionary = new HashMap<>();

		dictionary.put("car", "voiture");
		dictionary.put("window", "fenetre");
		dictionary.put("sun", "soleil");

		// affichage individuel par la methode "get"

		System.out.println("\n <<< Affichage individuel par la methode \"get\" >>> ");
		System.out.println("\n Traduction de 'car' : " + dictionary.get("car"));
		System.out.println("\n Traduction de 'window' : " + dictionary.get("window"));
		System.out.println("\n Traduction de 'sun' : " + dictionary.get("sun"));

		System.out.println("\n <<< Dictionnaire complet >>> ");

		// affichage complet par " Entry "

		for (Map.Entry<String, String> entry : dictionary.entrySet()) {

			System.out.println("\n " + entry.getKey() + " -> " + entry.getValue());
		}
	}
}
