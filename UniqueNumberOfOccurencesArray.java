import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class UniqueNumberOfOccurences {

	public static void main(String[] args) {
		int arr[]= {1,2,2,1,1,3};
		boolean ans=uniqueOccurences(arr);
		System.out.println(ans);

	}

	private static boolean uniqueOccurences(int[] arr) {
		HashMap<Integer,Integer>map=new HashMap<>();
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
		}
		System.out.println(map);
		int ans[]=new int[map.size()];
		int i=0;
		for(Map.Entry<Integer,Integer> e:map.entrySet()) {
			ans[i++]=e.getValue();
		}
		Arrays.sort(ans);
		i=0;
		int j=1;
		boolean flag=true;
		while(j<ans.length) {
			if(ans[i]==ans[j]) {
				return false;
			}
			j++;
            i++;
		}
		return true;
	}

}
