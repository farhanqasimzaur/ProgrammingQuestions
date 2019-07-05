package string;

public class StringReverseRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String toReverse = "Reverse This String if you can";
		
		reverse(toReverse);

	}
	
	public static void reverse(String reverse){
		if(reverse== null || reverse.length() <= 0){
			System.out.print("");
			return;
		}
		System.out.print(reverse.charAt(reverse.length()-1));
		reverse(reverse.substring(0,reverse.length()-1));
	}

}
