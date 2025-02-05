import java.util.Scanner;

public class KokoEatingBananas {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		int h=sc.nextInt();
		int ans=bananaEating(arr,h);
		System.out.println(ans);
	}

	private static int bananaEating(int[] arr, int h) {
		int low=1;
		int high=maximum(arr);
		while(low<=high) {
			int mid=(low+high)/2;
			if(requiredTime(arr,mid)<=h)high=mid-1;
			else low=mid+1;
		}
		return low;
	}

	private static int requiredTime(int[] arr, int n) {
		int ans=0;
		for(int e:arr) {
			ans+=Math.ceil((double)(e) / (double)(n));
		}
		return ans;
	}

	private static int maximum(int[] arr) {
		int max=Integer.MIN_VALUE;
		for(int e:arr)max=Math.max(e, max);
		return max;
	}

}
