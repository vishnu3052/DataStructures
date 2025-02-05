import java.util.Scanner;

public class NthRootUsingBinarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int ans=nthRoot(n,m);
		System.out.println(ans);

	}

	private static int nthRoot(int n, int m) {
		int low=0;
        int high=m;
        while(low<=high){
            int mid=(low+high)/2;
            if(Math.pow(mid,n)==m)return mid;
            else if(Math.pow(mid,n)<m)low=mid+1;
            else high=mid-1;
        }
        return -1;
	}
}
