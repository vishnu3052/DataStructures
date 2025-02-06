import java.util.Scanner;

public class KthMissingPositiveNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		int k=sc.nextInt();
		int missing=findKthPositive(arr,k);
    System.out.println(missing);

	}

	private static int findKthPositive(int[] nums, int k) {
		int n=nums.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int missing = nums[mid] - (mid + 1);
            if (missing < k) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return k + high + 1;
	}

}
