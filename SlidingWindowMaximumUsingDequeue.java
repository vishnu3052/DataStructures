import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;

public class SlidingWindowMaximumUsingDequeue {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array length:");
		int n=sc.nextInt();
		int arr[]= new int[n];
		System.out.println("Enter the array Elements:");
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		System.out.println("Enter the k size for window length:");
		int k=sc.nextInt();
		int ans[]=maxSlidingWindow(arr,k);
		for(int e:ans)System.out.print(e+" ");

	}

	private static int[] maxSlidingWindow(int[] arr, int k) {
		ArrayList<Integer>list=new ArrayList<>();
		Deque<Integer>dq=new ArrayDeque<>();
		for(int i=0;i<arr.length;i++) {
			if (!dq.isEmpty() && dq.peek() == i - k) {
                dq.poll();
            }
			while (!dq.isEmpty() && arr[dq.peekLast()] < arr[i]) {
                dq.pollLast();
            }
			dq.offer(i);
			if(i>=k-1)list.add(arr[dq.peek()]);
		}
		return list.stream().mapToInt(i -> i).toArray();
	}

}
