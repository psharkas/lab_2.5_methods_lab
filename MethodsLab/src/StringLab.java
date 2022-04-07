
public class StringLab {
	
	
	public static void capitalize(String word) {
		word = word.toLowerCase();
		word = word.substring(0,1).toUpperCase() + word.substring(1);
		System.out.println(word);
	}
	
	public static void wheresWaldo(String phrase) {
		int index = phrase.indexOf("Waldo");
		System.out.println(index);
	}
	
	public static void firstThingsFirst(String a, String b){		
		int comparison = a.compareToIgnoreCase(b);
		
		if (comparison > 0) {
			System.out.println(b + " " + a);
		}
		else if (comparison < 0) {
			System.out.println(a + " " + b);
		}
		
		else {
			System.out.println(a + " " + b);
		}
	}
	
	public static void reverse(String s) {
		String reversed = "";
		
		for (int i = s.length()-1; i >= 0; i--) {
			reversed += s.charAt(i);
		}
		System.out.println(reversed);
		
	}
	
	public static void soLong(String a, String b) {
		int aLength = a.length();
		int bLength = b.length();
		
		if (aLength > bLength) {
			System.out.println(a);
		}
		else if (bLength > aLength) {
			System.out.println(b);
		}
		else {
			System.out.println(a + " " + b);
		}

	}
	
	public static void afterMath(String phrase) {
		int index = phrase.indexOf("math");
		
		if (index > 0) {
			String sentence = phrase.substring(index);
			System.out.println(sentence);
		}
		else {
			System.out.println("dud");
		}	
	}
	
	public static void letterize(String word) {
		int wordLength = word.length();
		
		for (int i = 0; i < wordLength; i++) {
			System.out.println(word.charAt(i));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		capitalize("blAZes");
		wheresWaldo("Striped Waldo!");
		firstThingsFirst("tree","pine");
		reverse("happy");
		soLong("bean","pea");
		afterMath("She aced the mathematics test!");
		afterMath("My floor mat is so keen!");
		letterize("Java");
		
		
		
	}

}