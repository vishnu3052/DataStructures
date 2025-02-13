import java.util.Scanner;
import java.util.Stack;

public class InfixToPrefix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(infixToPostfix(str));

	}
	static String reverse(String str){
        String ans="";
        for(int i=str.length()-1;i>=0;i--){
            char ch=str.charAt(i);
            if(ch=='(')ans+=')';
            else if(ch==')')ans+='(';
            else ans+=ch;
        }
        return ans;
    }
    static int priority(char op){
        if(op=='+'||op=='-')return 1;
		if(op=='*'||op=='/')return 2;
		if(op=='^')return 3;
		return -1;
    }

	private static String infixToPostfix(String str) {
		str=reverse(str);
        Stack<Character>st=new Stack<>();
        String ans="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9'))ans+=ch;
            else if(ch=='(')st.push(ch);
            else if(ch==')'){
                while(!st.isEmpty() && st.peek()!='(')ans+=st.pop();
                st.pop();
            }
            else{
                if(ch=='^'){
                    while(!st.isEmpty() && priority(ch)<=priority(st.peek())){
                     ans+=st.pop();
                     }
                }
                else{
                    while(!st.isEmpty() && priority(ch)<priority(st.peek())){
                        ans+=st.pop();
                     }
                }
                st.push(ch);
            }
        }
        while(!st.isEmpty())ans+=st.pop();
        return reverse(ans);
	}
	

}
