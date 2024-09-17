public class LowerBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,5,7,9};
		int ele=4;
		int l=0;
		int r=arr.length-1;
		int ind=-1;
		while(l<=r) {
			int mid=(l+r)/2;
			if(arr[mid]>=ele) {
				ind=mid;
				r=mid-1;
			}
			else {
				l=mid+1;
			}
		}
		System.out.println(ind);

	}

}
