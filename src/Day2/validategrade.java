package Day2;

public class validategrade {

	public static void main(String[] args) {
		// program that takes a grade and prints the corresponding message (A, B, C, F).
		String grade = "95";
		switch (grade){
		case "90":
			System.out.println("distinct");
			break;
		case "80":
			System.out.println("first");
			break;	
		case "70":
			System.out.println("second");
			break;	
		case "60":
			System.out.println("fail");
			break;	
		}
	}

}
