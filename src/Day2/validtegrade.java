package Day2;

public class validtegrade {

	public static void main(String[] args) {
		// program that takes a grade and prints the corresponding message (A, B, C, F).
		String grade = "F";
		switch (grade){
		case "A":
			System.out.println("distinct");
			break;
		case "B":
			System.out.println("first");
			break;	
		case "C":
			System.out.println("second");
			break;	
		case "F":
			System.out.println("fail");
			break;	
		}
	}

}
