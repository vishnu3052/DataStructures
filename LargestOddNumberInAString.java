import java.util.Scanner;

public class LargestOddNumberInAString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String s=largestOddNumber(str);
		System.out.println(s);

	}

	private static String largestOddNumber(String s) {
		for(int i=s.length()-1;i>=0;i--){
            int a=Integer.parseInt(String.valueOf(s.charAt(i)));
            if(a%2!=0) return s.substring(0,i+1);
        }
        return "";
	}

}
