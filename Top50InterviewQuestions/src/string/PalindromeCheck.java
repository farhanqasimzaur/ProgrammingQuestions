package string;

public class PalindromeCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String toCheck = "this i siht";
		boolean isPalindrome = true;
		char arr[] = toCheck.toCharArray();
		for(int i=0;i<toCheck.length()/2;i++){
			if(arr[i] != arr[arr.length-1-i]){
				isPalindrome = false;
				break;
			}
		}
		System.out.println(isPalindrome);

	}

}
