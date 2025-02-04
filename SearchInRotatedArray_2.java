import java.util.Scanner;

public class SearchInRotatedArray_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		int k=sc.nextInt();
		boolean ans=search1(arr,k);
		System.out.println(ans);

	}

	private static boolean search1(int[] arr, int k) {
		int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[mid]==k)return true;
            if (arr[low] == arr[mid] && arr[mid] == arr[high]) {
                low = low + 1;
                high = high - 1;
                continue;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<=k && k<=arr[mid])high=mid-1;
                else low=mid+1;
            }
            else{
                if(arr[mid]<=k && k<=arr[high])low=mid+1;
                else high=mid-1;
            }
        }
        return false;
	}

}
