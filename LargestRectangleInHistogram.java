import java.util.Scanner;
import java.util.Stack;

public class LargestRectangleInHistogram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		int ans=largestRectangleArea(arr);
		System.out.println(ans);

	}
	public static int[] previousSmallerindex(int[] arr) {
		 Stack<Integer> s=new Stack<>();
		 int ans[]=new int[arr.length];
		 ans[0]=-1;
		 s.push(0);
		 for(int i=1;i<arr.length;i++) {
			 while(!s.isEmpty() && arr[s.peek()]>=arr[i]) {
				 s.pop();
			 }
			 if(s.isEmpty())ans[i]=-1;
			 else ans[i]=s.peek();
			 s.push(i);
		 }
		return ans;
	}
   public static int[] nextSmallerIndex(int arr[]) {
		 Stack<Integer> s=new Stack<>();
		 int ans[]=new int[arr.length];
		 ans[arr.length-1]=arr.length;
		 s.push(arr.length-1);
		 for(int i=arr.length-2;i>=0;i--) {
			 while(!s.isEmpty() && arr[s.peek()]>=arr[i]) {
				 s.pop();
			 }
			 if(s.isEmpty())ans[i]=arr.length;
			 else ans[i]=s.peek();
			 s.push(i);
		 }
		return ans;
	 }
   public static int largestRectangleArea(int[] a) {
       int l[]=previousSmallerindex(a);
		 int r[]=nextSmallerIndex(a);
		 int ans=0;
		 for(int i=0;i<a.length;i++) {
			 ans=Math.max(ans, ((r[i]-l[i])-1)*a[i]);
		 }
		return ans;
   }
}
