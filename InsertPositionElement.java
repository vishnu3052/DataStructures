public class InsertPositionElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,3,5,6,7,9};
		int ele=4;
		int ind=-1;
		int l=0;
		int r=arr.length-1;
		while(l<=r) {
			int mid=(l+r)/2;
			if(arr[mid]>=ele) {
				ind=mid;
				r=mid-1;
			}
			else
				l=mid+1;
			
		}
		System.out.println("Element insert at "+ind);

	}

}
