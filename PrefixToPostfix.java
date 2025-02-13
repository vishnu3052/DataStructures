import java.util.Scanner;
import java.util.Stack;

public class PrefixToPostfix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(prefixToPostfix(str));

	}

	private static String prefixToPostfix(String str) {
		Stack<String>st=new Stack<>();
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9'))st.push(String.valueOf(ch));
            else{
                String s1=st.pop();
                String s2=st.pop();
                String con=s1+s2+ch;
                st.push(con);
            }
        }
        return st.peek();
	}

}
