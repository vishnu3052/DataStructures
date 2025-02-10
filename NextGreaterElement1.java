import java.util.HashMap;
import java.util.Scanner;

public class NextGreaterElement1 {

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
		 HashMap<Integer,Integer>map=new HashMap<>();
	        map.put(nums2[nums2.length-1],-1);
	        for(int i=nums2.length-2;i>=0;i--){
	            int temp=nums2[i];
	            int max=Integer.MIN_VALUE;
	            boolean flag=false;
	            for(int j=i+1;j<nums2.length;j++){
	                max=Math.max(max,nums2[j]);
	                if(max>temp){
	                    map.put(nums2[i],max);
	                    flag=true;
	                    break;
	                }
	            }
	            if(!flag)map.put(nums2[i],-1);
	        }
	        for(int i=0;i<nums1.length;i++){
	            nums1[i]=map.get(nums1[i]);
	        }
	        return nums1;
	}

}
