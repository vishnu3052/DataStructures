import java.util.Scanner;

public class TrappingRainWater {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		int count=countTrappingWater(arr);
		System.out.println(count);

	}

	private static int countTrappingWater(int[] arr) {
		int lmax=0,rmax=0,count=0;
		int l=0;
		int r=arr.length-1;
		while(l<=r) {
			lmax=Math.max(arr[l],lmax);
			rmax=Math.max(rmax,arr[r]);
			if(lmax<=rmax) {
				count+=lmax-arr[l];
				l++;
				
			}else {
				count+=rmax-arr[r];
				r--;
			}
		}
		return count;
	}

}
