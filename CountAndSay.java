import java.util.Scanner;

public class CountAndSay {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String ans=countAndSay(n);
		System.out.println(ans);

	}

	private static String countAndSay(int n) {
		int count=1;
		String ans="1";
		while(count<n) {
			ans=helper(ans);
			count++;
		}
		return ans;
	}

	private static String helper(String ans) {
		int i=0;
		int j=0;
		String str="";
		int count=0;
		while(j<ans.length()) {
			char ch1=ans.charAt(i);
			char ch2=ans.charAt(j);
			if(ch1==ch2) {
				j++;
				count++;
			}
			else if(ch1!=ch2) {
				str+=String.valueOf(j-i);
				str+=String.valueOf(ch1);
				i=j;
				count=1;
				j++;
			}
		}
		str+=String.valueOf(j-i);
		str+=String.valueOf(ans.charAt(i));
		System.out.println(str);
		return str;
	}

}
