import java.util.Scanner;

public class SmallestDivisorGivenAThreshhold {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		int t=sc.nextInt();
		int ans=smallestDivisior(arr,t);
		System.out.println(ans);

	}

	private static int smallestDivisior(int[] arr, int t) {
		// TODO Auto-generated method stub
		int a[]=minmax(arr);
		int low=1;
		int high=a[0];
		while(low<=high) {
			int mid=(low+high)/2;
			if(Divisior(arr,mid,t))high=mid-1;
			else low=mid+1;
		}
		return low;
	}

	private static  boolean Divisior(int[] arr, int n, int t) {
		int count=0;
		for(int e:arr) {
			count+=Math.ceil((double)(e)/(double)(n));
		}
		if(count<=t)return true;
		return false;
	}

	private static int[] minmax(int[] arr) {
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int e:arr) {
			max=Math.max(max, e);
			min=Math.min(e, min);
		}
		return new int[]{max,min};
	}

}
