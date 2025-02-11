import java.util.Scanner;

public class RemoveAllOccurrencesOfASubString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String part=sc.next();
		String ans=removeOccurrences(str,part);
		System.out.println(ans);

	}

	private static String removeOccurrences(String str, String part) {
		 StringBuffer s=new StringBuffer(str);
			boolean flag=true;
			while(flag) {
				int ind=s.indexOf(part);
	            if(ind!=-1)
				    s.delete(ind,ind+part.length());
				if(s.indexOf(part)==-1) {
					flag=false;
				}	
			}
			return s.toString();
	}

}
