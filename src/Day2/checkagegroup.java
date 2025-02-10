package Day2;

public class checkagegroup {

	public static void main(String[] args) {
		//  program that takes the age of a person as input and prints the age group
		//take age variable
		int age = 29;
		//if age is less than 12 print child
		if(age<12) {
			System.out.println("child");
		}else if(age == 12 || age<=18) {
			System.out.println("teenage");
		} else if(age == 19 || age<=59) {
			System.out.println("adult");
		} else if(age>=60) {
			System.out.println("senior");
		}

	}

}
