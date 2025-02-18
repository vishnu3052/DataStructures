import java.util.Scanner;
import java.util.Stack;

public class SumOfSubArrayRanges {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		long ans=subArrayRanges(arr);
		System.out.println(ans);

	}

	private static long subArrayRanges(int[] nums) {
		long sum = 0;
        int N = nums.length;
        int[] pse = new int[N];
        int[] nse = new int[N];
        Stack<Integer> st = new Stack<>();
        for(int i=N-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]>=nums[i])
                st.pop();
            nse[i] = st.isEmpty()?N:st.peek();
            st.push(i);
        }
        st = new Stack<>();
        for(int i=0;i<N;i++){
            while(!st.isEmpty() && nums[st.peek()]>nums[i])
                st.pop();
            pse[i] = st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        long sumOfSubarrayMinimums = 0;
        for(int i=0;i<N;i++){
            long cnteleleft = i-pse[i];
            long cnteleright = nse[i]-i;
            sumOfSubarrayMinimums+=cnteleleft*cnteleright*nums[i];
        }
        int[] pge = new int[N];
        int[] nge = new int[N];
        st = new Stack<>();
        for(int i=N-1;i>=0;i--){
            while(!st.isEmpty() && nums[st.peek()]<=nums[i])
                st.pop();
            nge[i] = st.isEmpty()?N:st.peek();
            st.push(i);
        }
        st = new Stack<>();
        for(int i=0;i<N;i++){
            while(!st.isEmpty() && nums[st.peek()]<nums[i])
                st.pop();
            pge[i] = st.isEmpty()?-1:st.peek();
            st.push(i);
        }
        long sumOfSubarrayMaximums = 0;
        for(int i=0;i<N;i++){
            long cnteleleft = i-pge[i];
            long cnteleright = nge[i]-i;
            sumOfSubarrayMaximums+=cnteleleft*cnteleright*nums[i];
        }
        return sumOfSubarrayMaximums-sumOfSubarrayMinimums;
	}
}
