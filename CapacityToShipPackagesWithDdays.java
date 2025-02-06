import java.util.Scanner;

public class CapacityToShipPackagesWithDdays {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		int days=sc.nextInt();
		int capacity=shipWithinDays(arr,days);
		System.out.println(capacity);

	}

	private static int shipWithinDays(int[] arr, int days) {
		int a[]=maxSum(arr);
		int low=a[0];
		int high=a[1];
		while(low<=high) {
			int mid=(low+high)/2;
			int capacity=requiredDays(arr,days,mid);
			if(capacity<=days)high=mid-1;
			else low=mid+1;
		}
		return low;
	}

	private static int requiredDays(int[] arr, int days,int cap) {
		int d=1;
		int load=0;
		for(int e:arr) {
			if(load+e>cap) {
				d+=1;
				load=e;
			}
			else load+=e;
		}
		return d;
	}

	private static int[] maxSum(int[] arr) {
		int sum=0;
		int max=Integer.MIN_VALUE;
		for(int e:arr) {
			max=Math.max(max,e);
			sum+=e;
		}
		return new int[]{max,sum};
	}

}
