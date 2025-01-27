import java.util.Scanner;
class ReverseWordsInAString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String ans=reverseString(s);
		System.out.println(ans);
	}
	private static String reverseString(String s) {
		if(s.length()==1) {
			return s;
		}
		String ans="";
		int l=-1;
		int m=-1;
		for(int i=0;i<s.length()-1;i++) {
			if(l==-1 && s.charAt(i)!=' ') {
				l=i;
			}
			if(s.charAt(i+1)==' ') {
				if(l==-1)m=-1;
				else 
					m=i;
			}
			if(i==s.length()-2 ) {
				if(l==-1 && s.charAt(i+1)!=' ')ans+=s.charAt(i+1);
				if(s.charAt(i+1)!=' ')m=i+1;
				else m=i;
			}
			if(l!=-1 && m!=-1) {
				ans+=s.substring(l,m+1);
				ans+=" ";
				l=-1;
				m=-1;
			}
		}
		String arr[]=ans.split(" ");
		ans="";
		for(int i=arr.length-1;i>=0;i--) {
			ans+=arr[i];
			ans+=" ";
		}
		return ans;	
		}
}
