public class WordReverse {
	static void perform(String s1) {
		String s[]=s1.split(" ");
		int n=s.length-1;
		for(int i=0;i<n/2;i++) {
			String temp=s[i];
			s[i]=s[n-i];
			s[n-i]=temp;
		}
		for(int i=0;i<=n;i++) {
			System.out.print(s[i]+" ");
		}
		System.out.println();
		
		
	}
	static String reverse(String s,int l, int r) {
		String ans="";
		for(int i=r;i>=l;i--) {
			ans+=s.charAt(i);
		}
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="I am the boss";
		System.out.println(s1);
//		perform(s1);
		int l=0,r=0;
		String ans="";
		while(r<s1.length()) {
			if(s1.charAt(r)==' ') {
				ans+=reverse(s1,l,r-1);
				ans+=" ";
				l=r+1;
				
			}
			r++;
		}
		ans+=reverse(s1,l,r-1);
		ans=reverse(ans,0,ans.length()-1);
		System.out.println(ans);
	}

}
