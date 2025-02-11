import java.util.Scanner;

public class SpecialArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		System.out.println(isArraySpecial(arr));

	}

	private static boolean isArraySpecial(int[] arr) {
		for(int i=1;i<arr.length;i++){
            if((arr[i-1]%2==0 && arr[i]%2==0) || (arr[i-1]%2!=0 && arr[i]%2!=0))return false;
        }
        return true;
	}

}
