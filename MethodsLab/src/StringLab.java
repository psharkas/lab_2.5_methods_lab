
public class StringLab {
	
	
	public static String capitalize(String word) {
		word = word.toLowerCase();
		word = word.substring(0,1).toUpperCase() + word.substring(1);
		return word;
	}
	
	public static int wheresWaldo(String phrase) {
		int index = phrase.indexOf("Waldo");
		return index;
	}
	
	public static String firstThingsFirst(String a, String b){		
		int comparison = a.compareToIgnoreCase(b);
		
		if (comparison > 0) {
			return (b + " " + a);
		}
		else if (comparison < 0) {
			return (a + " " + b);
		}
		
		else {
			return (a + " " + b);
		}
	}
	
	public static String reverse(String s) {
		String reversed = "";
		
		for (int i = s.length()-1; i >= 0; i--) {
			reversed += s.charAt(i);
		}
		return(reversed);
		
	}
	
	public static String soLong(String a, String b) {
		int aLength = a.length();
		int bLength = b.length();
		
		if (aLength > bLength) {
			return (a);
		}
		else if (bLength > aLength) {
			return (b);
		}
		else {
			return (a + " " + b);
		}

	}
	
	public static String afterMath(String phrase) {
		int index = phrase.indexOf("math");
		
		if (index > 0) {
			String sentence = phrase.substring(index);
			return (sentence);
		}
		else {
			return ("dud");
		}	
	}
	
	public static String letterize(String word) {
		int wordLength = word.length();
		String output = "";
		for (int i = 0; i < wordLength; i++) {
			output += (word.charAt(i));
			output += "\n";
		}
		System.out.println(output);
		return output;
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
