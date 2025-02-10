package Day2;

public class primenumber {

	public static void main(String[] args) {
		// program that takes an integer as input and checks if it is a prime number
		int num = 4;
		if(num%1 == 0 && num%num == 0) {
			System.out.println("prime");
		}else {
			System.out.println("not a prime");
		}

	}

}
