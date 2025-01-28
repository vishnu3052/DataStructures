import java.util.Scanner;

public class MaximumNestingDepthOfTheParanthesis {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int ans=maximumDepthParanthesis(str);
		System.out.println(ans);

	}

	private static int maximumDepthParanthesis(String s) {
		int len=0;
        int left=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='(')left++;
            if(ch==')'){
                if(left>len){
                    len=left;
                }
                left--;
            }
        }
        return len;
	}

}
