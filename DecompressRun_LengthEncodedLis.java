import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DecompressRun_LengthEncodedList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		int ans[]=decompressRLElist(arr);
	}

	private static int[] decompressRLElist(int[] nums) {
		List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length-1;i+=2){
            for(int count=1;count<=nums[i];count++)list.add(nums[i+1]);
        }

        return list.stream().mapToInt(i->i).toArray();
	}

}
