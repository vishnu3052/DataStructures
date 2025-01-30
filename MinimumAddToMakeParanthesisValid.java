import java.util.Scanner;

public class MinimumAddToMakeParanthesisValid {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int count=minAddToMakeValid(str);

	}

	private static int minAddToMakeValid(String s) {
		int left=0;
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch==')'){
                if(left==0){
                    ans++; 
                }else left--;   
            }
            if(ch=='(')left++;
        }  
        return left+ans;
	}

}
