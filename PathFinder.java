import java.util.Scanner;

public class PathFinder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char[][] grid=new char[5][5];
		System.out.println("Enter F for free or B for blocked");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				grid[i][j]=sc.next().charAt(0);
				Character.toLowerCase(grid[i][j]);
			}
		}
		boolean isPath=isPathFinder(grid);
		System.out.println(isPath);
		

	}

	private static boolean isPathFinder(char[][] grid) {
		if(grid[0][0]=='b' && grid[4][4]=='b')return false;
		boolean dp[][]=new boolean[5][5];
		dp[0][0]=true;
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(grid[i][j]=='b')continue;
				if(i>0 && dp[i-1][j])dp[i][j]=true;
				if(j>0 && dp[i][j-1])dp[i][j]=true;
			}
		}
		return dp[4][4];
	}

}
