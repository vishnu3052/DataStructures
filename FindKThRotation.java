import java.util.Scanner;

public class FindKThRotation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		int k=sc.nextInt();
		int ind=findRoatation(arr);
		System.out.println(ind);

	}

	private static int findRoatation(int[] arr) {
		int low=0;
        int high=arr.length-1;
        int ind=-1;
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(arr[low]<=arr[high]){
                if(arr[low]<ans){
                    ind=low;
                    ans=arr[low];
                }
                break;
            }
            if(arr[low]<=arr[mid]){
                if(arr[low]<ans){
                    ind=low;
                    ans=arr[low];
                }
                low=mid+1;
            }
            else{
                if(arr[mid]<ans){
                    ind=mid;
                    ans=arr[mid];
                }
                high=mid-1;
            }
        }
        return ind;
	}

}
