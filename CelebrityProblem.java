import java.util.Scanner;

public class CelebrityProblem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the square matix:");
		int r=sc.nextInt();
		int arr[][]=new int[r][r];
		System.out.println("Enter the elements:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<r;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		int count=celebrity(arr);
		System.out.println(count);

	}

	private static int celebrity(int[][] arr) {
		int top=0;
		int down=arr.length-1;
		while(top<down) {
			if(arr[top][down]==1)top++;
			else if(arr[down][top]==1)down--;
			else {
				top--;
				down--;
			}
		}
		if(top>down)return -1;
		for(int i=0;i<arr.length-1;i++) {
			if(i==top)continue;
			if(arr[top][i]==0 && arr[i][top]==1)continue;
			else return -1;
		}
		return top;
	}

}
