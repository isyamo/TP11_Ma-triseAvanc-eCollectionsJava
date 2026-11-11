package EX3_MaîtriseSetAnalyseMotUniques;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetComparison {
	public static void main(String[] args) {
		Set<String> hashSet = new HashSet<>(Arrays.asList("Chat", "Voiture", "Universite"));
		Set<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList("Chat", "Voiture", "Universite"));
		Set<String> treeSet = new TreeSet<>(Arrays.asList("Chat", "Voiture", "Universite"));
		
		System.out.println("\n -> HashSet non ordonne : "+hashSet);
		System.out.println("\n -> LinkedHashSet  ordre  d'insertion : "+linkedHashSet);
		System.out.println("\n -> TreeSet trie alphabetiquement  : "+treeSet);
		
		
		
		
	}

}
