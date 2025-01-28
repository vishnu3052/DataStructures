import java.util.Scanner;

public class RomanToInteger {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int ans=romanToInteger(str);

	}

	private static int romanToInteger(String s) {
		int sum = 0,p= 0;
        char v = 0;
        for(int i = 0; i < s.length(); i++){
            p = v;
            v = s.charAt(i);
            switch(v){
                case 'I':
                    sum++;
                    break;
                case 'V':
                    if(p== 'I')
                     sum = sum + 3;
                    else
                     sum = sum + 5;
                    break;
                case 'X':
                    if(p == 'I')
                     sum = sum + 8;
                    else
                     sum = sum + 10;
                    break;
                case 'L':
                    if(p == 'V')
                     sum = sum + 40;
                    if(p == 'X')
                     sum = sum + 30;
                    else
                    sum = sum + 50;
                    break;
                case 'C':
                    if(p == 'I')
                     sum = sum + 98;
                    if(p == 'V')
                     sum = sum + 90;
                    if(p == 'X')
                     sum = sum + 80;
                    else
                    sum = sum + 100;
                    break;
                case 'D':
                    if(p == 'V')
                     sum = sum + 490;
                    if(p == 'X')
                     sum = sum + 480;
                    if(p == 'L')
                     sum = sum + 400;
                    if(p == 'C')
                     sum = sum + 300;
                    else
                    sum = sum + 500;
                    break;
                case 'M':
                    if(p == 'I')
                     sum = sum + 998;
                    if(p == 'V')
                     sum = sum + 990;
                    if(p == 'X')
                     sum = sum + 980;
                    if(p == 'L')
                     sum = sum + 900;
                    if(p == 'C')
                     sum = sum + 800;
                    else
                    sum  = sum + 1000;
                    break;
             }
        }
        return sum;
	}

}
