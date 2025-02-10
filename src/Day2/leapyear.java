package Day2;

public class leapyear {

	public static void main(String[] args) {
		// program that checks if a given year is a leap year
		int year = 2008;
		if(year%4 == 0 && year%100 != 0 || year%400 ==0 ) {
			System.out.println("leap year");
		}else {
			System.out.println("not a leap year");
		}

	}

}
