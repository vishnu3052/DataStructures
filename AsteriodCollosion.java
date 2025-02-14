import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class AsteriodCollosion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		int ans[]=asteriodCollosionUsingList(arr);
		int ans1[]=asteriodCollosionUsingStack(arr);
		for(int e:ans)System.out.print(e+" ");
		for(int e:ans1)System.out.print(e+" ");
	}

	private static int[] asteriodCollosionUsingStack(int[] arr) {
		Stack<Integer>st=new Stack<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0)st.push(arr[i]);
			else {
				while(!st.isEmpty() && st.peek()<Math.abs(arr[i]) && st.peek()>0) {
					st.pop();
				}
				if(!st.isEmpty() && st.peek()==Math.abs(arr[i]))st.pop();
				else if(st.isEmpty() || st.peek()<0) {
					st.push(arr[i]);
				}
			}
		}
		int ans[]=new int[st.size()];
		for(int i=ans.length-1;i>=0;i--)ans[i]=st.pop();
		return ans;
		
	}

	private static int[] asteriodCollosionUsingList(int[] arr) {
		ArrayList<Integer>list=new ArrayList<>();
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>0)list.add(arr[i]);
			else {
				while(!list.isEmpty() && list.get(list.size()-1)<Math.abs(arr[i]) && list.get(list.size()-1)>0) {
					list.remove(list.size()-1);
				}
				if(!list.isEmpty() && list.get(list.size()-1)==Math.abs(arr[i]))list.remove(list.size()-1);
				else if(list.isEmpty() || list.get(list.size()-1)<0) {
					list.add(arr[i]);
				}
			}
		}
		return list.stream().mapToInt(i -> i).toArray();
	}

}
