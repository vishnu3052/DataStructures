import java.util.Scanner;

public class ClearDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String ans=clearDigits(s);
		System.out.println(ans);

	}

	private static String clearDigits(String s) {
		StringBuffer str=new StringBuffer(s);
		int digit=-1;
		int character=-1;
		boolean flag=false;
		int i=0;
		for(i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(Character.isDigit(ch)) {
				digit=i;
			}else character=i;
			if(digit!=-1 && character!=-1) {
				str.deleteCharAt(digit);
				str.deleteCharAt(character);
				i=-1;
				digit=-1;
				character=-1;
			}
		}
		return str.toString();
	}

}
