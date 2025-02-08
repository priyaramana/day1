package Day2;

public class largestof3 {

	public static void main(String[] args) {
		// program to find the largest of three numbers.
		int n1 = 20;
		int n2 = 60;
		int n3 = 8;
		if(n1 > n2 && n1 > n3) {
			System.out.println("n1 is big");
		} else if(n2 > n1 && n2 > n3) {
			System.out.println("n2 is big");
		}else {
			System.out.println("n3 is big");
		}

	}

}
