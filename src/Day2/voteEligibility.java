package Day2;

public class voteEligibility {

	public static void main(String[] args) {
		//program that takes five numbers as input and finds the second largest number among them
		int num1[] = {44,121,6,9,15};
		int highest = num1[0];
		int second = num1[0];
        for(int i = 0; i<=num1.length-1;i++) {
        	if(num1[i]>highest) {
        		highest = num1[i];
        	}
        }
        System.out.println("highest " +highest);
        for(int j=0;j<num1.length;j++) {
        	if(num1[j] != highest && num1[j]>second) {
        		second = num1[j];
        	}
        }
        System.out.println("second " +second);
	}

}
