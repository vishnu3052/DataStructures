public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="thequickbrownfoxjumpsoverthelazydog";
		boolean ans=isPangram(str);
		System.out.println("Pangram :"+ans);

	}

	private static boolean isPangram(String s) {
		int arr[]=new int[26];
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-'a']++;
        }
        boolean flag=false;
        for(int i=0;i<26;i++){
            if(arr[i]==0){
                return false;
            }
        }
        return true;
	}

}
