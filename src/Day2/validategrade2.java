package Day2;

public class validategrade2 {

	public static void main(String[] args) {
		// program that takes a student's score (0-100) as input and prints the grade
		int num =95;
		if(num>=90) {
			System.out.println("A");		
			} else if(num<89 && num>80) {
				System.out.println("B");
			}else if (num<79 && num>70) {
				System.out.println("C");
			}else if(num<69 && num>60) {
				System.out.println("D");
			}else if (num< 60) {
				System.out.println("fail");
			}
	}

}
