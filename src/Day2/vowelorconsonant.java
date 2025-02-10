package Day2;

public class vowelorconsonant {

	public static void main(String[] args) {
		// program that takes a character as input and checks whether the character is a vowel (a, e, i, o, u) or a consonant
		char ch = 'p';
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
			System.out.println("vowel");
		}else {
			System.out.println("consonant");
		}
	}

}
