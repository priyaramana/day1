package Day2;

public class Studentmarks {

	public static void main(String[] args) {
		// program that takes the marks of a student in three subjects (out of 100) as input and calculates the overall grade
		int subj1 =70;
		int subj2 =70;
		int subj3 =70;
		int avg = (subj1+subj2+subj3)/3;
		if(avg >= 90) {
			System.out.println("A+");
		}else if(avg<=89 && avg>=75) {
			System.out.println("A");
		}else if(avg<=74 && avg>=60) {
			System.out.println("B");
		}else if(avg<=59 && avg>=50) {
			System.out.println("C");
		}else if(avg<50) {
			System.out.println("Fail");
		}
	}

}
