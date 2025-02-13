import java.util.Scanner;
import java.util.Stack;

public class NextSamllerUsingStack {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the elements of the array:");
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		int ans[]=nextSmaller(arr);
		for(int e:ans) {
			System.out.print(e+" ");
		}

	}

	private static int[] nextSmaller(int[] arr) {
		Stack<Integer>st=new Stack<>();
        int ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && st.peek()>=arr[i])st.pop();
            ans[i]=st.isEmpty()?-1:st.peek();
            st.push(arr[i]);
        }   
        return ans; 
	}

}
