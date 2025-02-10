package Day3;

public class fibonacci {

	public static void main(String[] args) {
		// Fibonacci Series up to N Terms
		int a = 0;
		int b = 1;
		int n = 25;
		int count = 0;
		int nextTerm ;
		
		for(int i = 0; i<=n;i++) {
			System.out.println(a);
			nextTerm = a+b;
			a = b;
			b = nextTerm;
			count++;
		}

	}

}
