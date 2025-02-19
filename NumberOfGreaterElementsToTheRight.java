import java.util.Scanner;
import java.util.Stack;

public class NumberOfGreaterElementsToTheRight {
	

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		System.out.println("Enter the array elements:");
		int arr[]= new int[n];
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		System.out.println("Enter the number of queries:");
		int n1=sc.nextInt();
		int indices[]=new int[n1];
		System.out.println("Enter the indices elements:");
		for(int i=0;i<n1;i++)indices[i]=sc.nextInt();
		int ans[]=count_NGES(n,arr,n1,indices);
		for(int e:ans)System.out.print(e+" ");

	}

	private static int[] count_NGES(int N, int[] arr, int queries, int[] indices) {
		Stack<Integer> gS = new Stack<>();
        Stack<Integer> sS = new Stack<>();
        int n = arr.length;
        int[] count = new int[n];
        for(int i=n-1;i>=0;i--) {
            while(!gS.isEmpty() && gS.peek() <= arr[i]) {
                sS.push(gS.peek());
                gS.pop();
            }
            count[i] = gS.size();
            gS.push(arr[i]);
            while(!sS.isEmpty()) {
                gS.push(sS.peek());
                sS.pop();
            }
        }
        int[] res = new int[queries];
        for(int i=0;i<queries;i++) {
            res[i] = count[indices[i]];
        }
        return res;
	}

}
