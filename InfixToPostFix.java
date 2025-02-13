import java.util.*;
public class InfixToPostFix {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String ans=infixToPostfix(str);
		System.out.println(ans);
	}
  static int priority(char op) {
		if(op=='+'||op=='-')return 1;
		if(op=='*'||op=='/')return 2;
		if(op=='^')return 3;
		return -1;
	}

	 static String infixToPostfix(String s) {
		String ans="";
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9'))ans+=ch;
            else if(ch=='(')st.push(ch);
            else if(ch==')'){
                while(!st.isEmpty() && st.peek()!='(')ans+=st.pop();
                st.pop();
            }
            else{
                while(!st.isEmpty() && priority(ch)<=priority(st.peek()))ans+=st.pop();
                st.push(ch);
            }
        }
        while(!st.isEmpty())ans+=st.pop();
        return ans;
	}

}
