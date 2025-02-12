import java.util.Scanner;
import java.util.Stack;

public class ValidParanthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		boolean flag=isvalid(s);

	}

	private static boolean isvalid(String s) {
		Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{')st.push(ch);
            else if(ch==')'){
                if(!st.isEmpty() && st.peek()=='('){
                    st.pop();
                }else return false;
            }
            else if(ch==']'){
                if(!st.isEmpty() && st.peek()=='['){
                    st.pop();
                }else return false;
            }
            else if(ch=='}'){
                if(!st.isEmpty() && st.peek()=='{'){
                    st.pop();
                }else return false;
            }
        }
        if(st.isEmpty()) return true;
        return false;
	}

}
