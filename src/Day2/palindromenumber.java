package Day2;

public class palindromenumber {

	public static void main(String[] args) {
		// program that checks if a given number is a palindrome.
		int num = 1214;
		String num1 = Integer.toString(num);
		char ch[] = num1.toCharArray();
		String num2 = "";
		for(int i=num1.length()-1;i>=0;i--) {
			num2 += ch[i];
			
		}
		System.out.println("after reverse " +num2);
		int finalnum = Integer.parseInt(num2);
        if(num == finalnum) {
        	System.out.println("palindrome");
        }else {
        	System.out.println("not a palindrome");
        }
	}

}
