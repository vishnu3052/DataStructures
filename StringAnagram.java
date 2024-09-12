public class Anagram {
	public static void main(String[] args) {
		String s1="bat";
		String s2="ball";
		
		int a[]=new int[26];
		int b[]=new int[26];
		for(int i=0;i<s1.length();i++) {
			char ch=s1.charAt(i);
			int ans=ch-'a';
			a[ans]=a[ans]+1;
		}
		for(int i=0;i<s2.length();i++) {
			b[s2.charAt(i)-'a']++;
		}
		boolean flag=true; 
		for(int i=0;i<26;i++) {
			if(a[i]!=b[i]) {
				flag=false;
			}	
		}
		if(flag) {
			System.out.println("Anagrams");
		}
		else
			System.out.println("Not Anagram");
	}

	
}
