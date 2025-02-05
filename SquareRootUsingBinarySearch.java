import java.util.Scanner;

public class SquareRootUsingBinarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=squareRoot(n);
		System.out.println(ans);

	}

	private static int squareRoot(int n) {
		int low=0;
		int high=n;
		while(low<=high) {
			int mid=(low+high)/2;
			if(mid*mid<=n) {
				low=mid+1;
			}else high=mid-1;
		}
		return high;
	}

}
