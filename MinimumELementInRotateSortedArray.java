import java.util.Scanner;

public class MinimumELementInRotateSortedArray {

	public static void main(String[] args) {
		// The array is not duplicate elememts
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		int min=Integer.MAX_VALUE;
		int l=0;
		int r=arr.length-1;
		while(l<=r) {
			int mid=(l+r)/2;
			if(arr[l]<=arr[r]) {
				min=Math.min(arr[l], min);
				break;
			}
			if(arr[l]<=arr[mid]) {
				min=Math.min(arr[l], min);
				l=mid+1;
			}
			else {
				min=Math.min(arr[mid], min);
				r=mid-1;
			}
		}
		System.out.println(min);

	}

}
