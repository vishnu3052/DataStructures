import java.util.HashMap;
import java.util.Scanner;

public class MaximisingCardBoards {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the array elements:");
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		int count=cardBoards(arr);
		System.out.println(count);

	}

	private static int cardBoards(int[] arr) {
		// TODO Auto-generated method stub
		int scount=0,rcount=0,len=0;
		boolean isLength=false;
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int e:arr)map.put(e,map.getOrDefault(e, 0)+1);
		for(Map.Entry<Integer,Integer>e:map.entrySet()) {
			if(e.getValue()>=4) {
				scount+=e.getValue()/4;
				int n=4*(e.getValue()/4);
				int temp=e.getValue()-n;
				if(!isLength && temp>=2) {
					len=temp/2;
					isLength=true;
				}else if(isLength && temp>=2) {
					rcount+=Math.abs(len-(temp/2)+1);
					len=Math.abs(len-(temp/2));
					if(len==0)isLength=false;
					else isLength=true;
				}
			}else if(e.getValue()>=2) {
				if(!isLength) {
					len=e.getValue()/2;
					isLength=true;
				}else {
					rcount+=Math.abs(len-(e.getValue()/2)+1);
					len=Math.abs(len-e.getValue()/2);
					if(len==0)isLength=false;
					else isLength=true;
				}
			}
		}
		return Math.abs(rcount-scount);
	}

}
