import java.util.Scanner;
import java.util.Stack;

public class MaximalRectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the row matrix:");
		int r=sc.nextInt();
		System.out.println("Enter the size of the column matrix:");
		int c=sc.nextInt();
		char arr[][]=new char[r][c];
		System.out.println("Enter the elements:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				arr[i][j]=sc.next().charAt(0);
			}
		}
		int count=maximalRectangle(arr);
		System.out.println("Answer:"+count);

	}

	private static int maximalRectangle(char[][] mat) {
		int n=mat.length;
		 int m=mat[0].length;
		 int a[]=new int[m];
		 int ans=0;
		 for(int i=0;i<n;i++) {
			 for(int j=0;j<m;j++) {
				 if(mat[i][j]=='0') {
					 a[j]=0;
				 }
				 else {
					 a[j]++;
				 }
			 }
			 ans=Math.max(ans,histogram(a));
		 }
		return ans;
	}

	private static int histogram(int[] a) {
		int l[]=previousSmallerindex(a);
		 int r[]=nextSmallerIndex(a);
		 int ans=0;
		 for(int i=0;i<a.length;i++) {
			 ans=Math.max(ans, ((r[i]-l[i])-1)*a[i]);
		 }
		return ans;
	}

	private static int[] nextSmallerIndex(int[] arr) {
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

	private static int[] previousSmallerindex(int[] arr) {
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

}
