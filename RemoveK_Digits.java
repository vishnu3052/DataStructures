import java.util.Scanner;
import java.util.Stack;

public class RemoveK_Digits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String Number:");
		String num=sc.next();
		System.out.println("Enter the number of digits removed:");
		int k=sc.nextInt();
		String ans=removeKDigits(num,k);
		System.out.println(ans);
	}

	private static String removeKDigits(String num, int k) {
		Stack<Character> st=new Stack<>();
        for(int i=0;i<num.length();i++){
            char ch=num.charAt(i);
            while(!st.isEmpty() && k>0 && st.peek()-'0'>ch-'0'){
                st.pop();
                k-=1;
            }
            st.push(ch);
        }
        while(k>0){
            st.pop();
            k-=1;
        }
        if(st.size()==0)return "0";
        StringBuffer res=new StringBuffer();
        while(!st.isEmpty())res.append(st.pop());
        res.reverse();
        while(res.length()!=0 && res.charAt(0)=='0')res.deleteCharAt(0);
        if(res.length()==0)return "0";
		return res.toString();
	}

}
