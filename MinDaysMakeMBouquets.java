import java.util.Scanner;

public class MinDaysMakeMBouquets {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		int m=sc.nextInt();
		int k=sc.nextInt();
		int ans=minDays(arr,m,k);
		System.out.println(ans);

	}

	private static int minDays(int[] arr, int m, int k) {
		long val = (long) m * k;
        int n = arr.length; 
        if (val > n) return -1;
		int a[]=maxMin(arr);
		int low=a[1];
		int high=a[0];
		System.out.println(low+" "+high);
		while(low<=high) {
			int mid=(low+high)/2;
			if(possible(arr,mid,m,k)) {
				high=mid-1;
			}else low=mid+1;
		}
		return low;
	}

	private static boolean possible(int[] arr, int day,int m, int k) {
		int count=0;
		int bouquets=0;
		for(int e:arr) {
			if(e<=day) {
				count++;
			}else {
				bouquets+=(count/k);
				count=0;
			}
		}
		bouquets+=(count/k);
		return bouquets>=m;
	}

	private static int[] maxMin(int[] arr) {
		// TODO Auto-generated method stub
		int max=Integer.MIN_VALUE;
		int min=Integer.MAX_VALUE;
		for(int e:arr) {
			max=Math.max(max, e);
			min=Math.min(e, min);
		}
		return new int[]{max,min};
	}

}
