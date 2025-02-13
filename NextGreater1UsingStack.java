import java.util.Scanner;
import java.util.Stack;

public class NextGreater1UsingStack {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of arr1:");
		int n1=sc.nextInt();
		int arr1[]=new int[n1];
		System.out.println("Enter the elements for arr1:");
		for(int i=0;i<n1;i++)arr1[i]=sc.nextInt();
		System.out.println("Enter the size of arr2:");
		int n2=sc.nextInt();
		int arr2[]=new int[n2];
		System.out.println("Enter the elements for arr2:");
		for(int i=0;i<n2;i++)arr2[i]=sc.nextInt();
		arr1=nextGreaterElement(arr1,arr2);
		for(int e:arr1) {
			System.out.print(e+" ");
		}

	}

	private static int[] nextGreaterElement(int[] nums1, int[] nums2) {
		Stack<Integer>st=new Stack<>();
        int ans[]=new int[nums2.length];
        for(int i=nums2.length-1;i>=0;i--){
             while(!st.isEmpty() && st.peek()<=nums2[i])st.pop();
             if(st.isEmpty())ans[i]=-1;
             else{
                 ans[i]=st.peek();
             }
             st.push(nums2[i]);
        }
        for(int i=0;i<nums1.length;i++){
             int ind=search(nums1[i],nums2);
             nums1[i]=ans[ind];
        } 
        return nums1;
	}

	private static int search(int num, int[] a) {
		for(int i=0;i<a.length;i++){
            if(a[i]==num)return i;
        }
        return -1;
	}

}
