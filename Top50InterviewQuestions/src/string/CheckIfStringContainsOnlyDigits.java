package string;

public class CheckIfStringContainsOnlyDigits {
	
	public static void main(String args[]){
		String check1 = "1234578945";
		String check2 = "123456asda5";
		
		
		System.out.println(isStringDigitOnly(check1));
		System.out.println(isStringDigitOnly(check2));
	}
	
	public static boolean isStringDigitOnly(String toCheck){
		try{
			Double checker = Double.parseDouble(toCheck);
			return true;
		}catch(Exception e){
			return false;
		}
	}

}
