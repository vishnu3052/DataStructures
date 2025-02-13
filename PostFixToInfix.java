import java.util.Scanner;
import java.util.Stack;

public class PostFixToInfix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(postfixToInfix(str));

	}

	private static String postfixToInfix(String str) {
		Stack<String> st=new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9'))st.push(String.valueOf(ch));
            else{
                String s2=st.pop();
                String s1=st.pop();
                String con='('+s1+ch+s2+')';
                st.push(con);
            }
        }
        return st.peek();
	}

}
