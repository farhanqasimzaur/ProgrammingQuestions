package enums;

public class Level {
	
	
	public static void main(String args[]) {
		System.out.println(Difficulty.LOW);
		
		for(Difficulty myDiff : Difficulty.values()) {
			System.out.println(myDiff);
		}
		
		
		
	}
	
	enum Difficulty{
	LOW,
	MEDIUM,
	HIGH,
	YEAHHH;
	}
}
