import java.util.ArrayList;
import java.util.List;

public class SnakeInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=3;
		List<String>list=new ArrayList<>();
		list.add("DOWN");
		list.add("RIGHT");
		list.add("UP");
		int ans=finalPositionOfSnake(n,list);
		System.out.println("Final answer:"+ans);

	}

	private static int finalPositionOfSnake(int n, List<String> list) {
		int ans=0;
		for(int i=0;i<list.size();i++) {
			String temp=list.get(i);
			switch(temp) {
			case "UP":ans=ans-n;
			          break;
			case "DOWN":ans=ans+n;
			           break;
			case "LEFT":ans=ans-1;
			           break;
			case "RIGHT":ans=ans+1;
						break;
			}
			System.out.println(ans);
		}
		return ans;
	}

}
