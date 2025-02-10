package Day3;

public class reverse {

	public static void main(String[] args) {
		// reverse number
		int n = 234;
		String str1 = Integer.toString(n);
		char ch[] = str1.toCharArray();
		String str2 = "";
        int n1;
        for(int i=str1.length()-1;i>=0;i--) {
        	str2 += ch[i];
        }
        System.out.println("reverse " +str2);
       
	}

}
