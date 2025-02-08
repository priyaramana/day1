package Day2;

public class divideby3not5 {

	public static void main(String[] args) {
		// program that checks whether a number is divisible by 3 but not 5
        int num = 21;
        if(num%3 == 0 && num%5 != 0) {
        	System.out.println("divided by 3 but not 5");
        }else if(num%3 != 0 && num%5 == 0) {
        	System.out.println("divided by 5 but not 3");
        }else {
        	System.out.println("not divided by 3 and 5");
        }
	}

}
