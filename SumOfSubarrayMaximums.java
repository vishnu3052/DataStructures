import java.util.Scanner;
import java.util.Stack;

public class SumOfSubarrayMaximums {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		int count=sumSubArrayMaxs(arr);
		System.out.println(count);

	}

	private static int sumSubArrayMaxs(int[] arr) {
		int n=arr.length;
		long sum=0;
		long mod=(long)1e9+7;
		Stack<Integer>st=new Stack<>();
		int left[]=new int[arr.length];
		int right[]=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			while(!st.isEmpty() && arr[st.peek()]<arr[i])st.pop();
			left[i]=st.isEmpty()?i+1:i-st.peek();
			st.push(i);
		}
		st.clear();
		for (int i =n-1; i >= 0; i--) {
            while (!st.isEmpty() && arr[st.peek()] >= arr[i]) {
                st.pop();
            }
            right[i] = st.isEmpty() ? n - i : st.peek() - i;
            st.push(i);
        }
		for (int i = 0; i < n; i++) {
            sum = (sum + ((long) left[i] * right[i] % mod * arr[i]) % mod) % mod;
        }
		return (int)sum;
	}

}
