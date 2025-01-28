import java.util.Scanner;

public class StringToIntegerATOI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int ans=atoi(str);
		System.out.println(ans);
	}

	private static int atoi(String str) {
        String ans="";
        char temp;
        if(str.length()!=0)temp=str.charAt(0);
        else temp='\u0000';
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==' '){
                if(ans.length()!=0)break;
            }
			if(ch=='-' || ch=='+') {
				if(temp=='0')return 0;
				if(ans.length()==0)ans+=ch;
				else break;
			}
			if(ch>='1' && ch<='9') {
				ans+=ch;
			}
			if(ch=='0') {
				if(ans.length()==0){
                    continue;
                    
                }
				else if(ans.charAt(ans.length()-1)!='-')ans+=ch;
			}
			if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))break;
            if(ch=='.')break;
			temp=str.charAt(i);
		}
		System.out.println(ans);
        if(ans.length()==0)return 0;
        if(ans.length()==1) {
        	if(ans.charAt(0)>='1' && ans.charAt(0)<='9')return Integer.parseInt(ans);
        	else return 0;
        }
        if(ans.length()>11) {
        	if(ans.charAt(0)=='-')return Integer.MIN_VALUE;
        	else return Integer.MAX_VALUE;
        }
        long ans1=Long.parseLong(ans);
        if(ans1>=Integer.MAX_VALUE && ans1>0)return Integer.MAX_VALUE;
        else if(ans1<Integer.MIN_VALUE)return Integer.MIN_VALUE;
        else return (int)ans1;
	}

}
