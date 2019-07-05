package string;

public class CheckRotation {

	public static void main(String args[]){
		String first = "ABCSD";
		String second = "CSDAB";
		
		System.out.println(checkRotation(first, second));
	}
	
	
	public static boolean checkRotation(String first, String second){
		String temp = first+first;
		if(temp.contains(second)){
			return true;
		}
		return false;
	}
}
