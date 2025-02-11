import java.util.Scanner;

public class StringCompression {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		char ch[]= new char[n];
		for(int i=0;i<n;i++)ch[i]=sc.next().charAt(0);
		int count=compress(ch);
		System.out.println(count);
		for(int i=0;i<count;i++) {
			System.out.print(ch[i]+" ");
		}

	}

	private static int compress(char[] chars) {
		//int ans=0;
        int count=0;
        int i=0;
        int j=0;
        int ind=0;
        while(j<chars.length){
            if(chars[i]==chars[j]){
                j++;
                count++;
            }else if(chars[i]!=chars[j]){
            	System.out.println(chars[i]+" "+count);
                if(count>9){
                    chars[ind++]=chars[i];
                    String str=String.valueOf(count);
                    System.out.println("In if case:"+str);
                    for(int temp=0;temp<str.length();temp++)chars[ind++]=str.charAt(temp);
                }
                else if(count==1)chars[ind++]=chars[i];
                else {
                	chars[ind++]=chars[i];
                	chars[ind++]=(char)(48+count);
                }
                count=0;
                i=j;
            }
        }
        if(count>9){
        	chars[ind++]=chars[i];
            String str=String.valueOf(count);
            System.out.println("In if case:"+str);
            for(int temp=0;temp<str.length();temp++)chars[ind++]=str.charAt(temp);
        }else if(count==1)chars[ind++]=chars[i];
        else {
        	chars[ind++]=chars[i];
        	chars[ind++]=(char)(48+count);
        }
        return ind;
	}

}
