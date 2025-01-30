import java.util.Scanner;

public class RemoveOuterMostParenthesis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String ans=removeOuterParentheses(str);
	}

	private static String removeOuterParentheses(String s) {
		int left=0;
        int ind=-1;
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='('){
                if (left==0)ind=i;
                left++;
            }
            if(ch==')'){
                left--;
                if(left==0){
                    ans+=s.substring(ind+1,i);
                    ind=-1;
                }
            }
        }
        return ans;
	}

}
