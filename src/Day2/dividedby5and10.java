package Day2;

public class dividedby5and10 {

	public static void main(String[] args) {
		// program to check whether a number is divisible by 5 and 10
		int num = 5;
		if(num%5 == 0 && num%10 != 0) {
			System.out.println("divided by 5");
		}else if(num%5 == 0 && num%10 == 0) {
			System.out.println("divided by 5 and 10");
		}
		
		else {
			System.out.println("fail");
		}

	}

}
