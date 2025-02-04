import java.util.Scanner;

public class CeilTheFloor {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		int k=sc.nextInt();
		int ans[]=getFloorAndCeil(arr,n,k);
		for(int e:ans) {
			System.out.print(e+" ");
		}
	}

	private static int[] getFloorAndCeil(int[] arr, int n, int x) {
		int low=0;
	      int high=arr.length-1;
	      int ind=-1;
	      while(low<=high){
	        int mid=(low+high)/2;
	        if(arr[mid]<=x){
	          ind=arr[mid];
	          low=mid+1;
	        }else{
	          high=mid-1;
	          
	        }
	      }
	      low=0;
	      high=arr.length-1;
	      int ind1=-1;
	      while(low<=high){
	        int mid=(low+high)/2;
	        if(arr[mid]>=x){
	          ind1=arr[mid];
	          high=mid-1;
	        }else low=mid+1;
	      }
	      int a[]={ind,ind1};
	      return a;
	}

}
