import java.util.*;

public class SortCharactersByFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String ans=sortCharactersByFrequency(str);
		System.out.println(ans);

	}

	private static String sortCharactersByFrequency(String str) {
		// TODO Auto-generated method stub
		HashMap<Character,Integer> map=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			map.put(str.charAt(i),map.getOrDefault(str.charAt(i),0)+1);
		}
		System.out.println(map);
		 List<Map.Entry<Character, Integer>> list = new ArrayList<>(map.entrySet());
		 Collections.sort(list, (e1, e2) -> e2.getValue().compareTo(e1.getValue()));
		 str="";
	        for (Map.Entry<Character, Integer> entry : list) {
	            for(int i=1;i<=entry.getValue();i++) {
	            	str+=entry.getKey();
	            }
	        }
		return str;
	}

}
