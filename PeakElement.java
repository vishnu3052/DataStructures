import java.util.Scanner;

public class PeakElement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		int ind=findPeakElement(arr);

	}

	private static int findPeakElement(int[] arr) {
		 if(arr.length==1)return 0;
	        int ind=-1;
	        int max=Integer.MIN_VALUE;
	        for(int i=0;i<arr.length;i++){
	            if(arr[i]>max){
	                max=arr[i];
	                ind=i;
	            }
	        }
	        return ind;
	}

}
