import java.util.Scanner;
import java.util.Stack;

public class NextGreater2UsingStack {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		int ans[]=nextGreater2(arr);
		for(int e:ans) {
			System.out.print(e+" ");
		}

	}

	private static int[] nextGreater2(int[] arr) {
		int n=arr.length;
        int ans[]=new int[n];
        Stack<Integer>st=new Stack<>();
        for(int i=(2*n)-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i%n])st.pop();
            if(i<n){
                ans[i]=st.isEmpty()?-1:st.peek();
            }
            st.push(arr[i%n]);
        }
        return ans;
	}

}
