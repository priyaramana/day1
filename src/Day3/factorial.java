package Day3;

public class factorial {

	public static void main(String[] args) {
		// calculate the factorial of a given number using a while loop.
		int n = 5;
		int result = 1;
		while(n>0){
			result *= n;
			n--;
		}
		System.out.println(result);
	}

}
