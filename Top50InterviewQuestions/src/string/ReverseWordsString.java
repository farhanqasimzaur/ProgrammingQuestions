package string;

import java.util.ArrayList;


public class ReverseWordsString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String toReverse = "This is a good string ";
		char[] arr = toReverse.toCharArray();
		ArrayList<Character> reversedArray = new ArrayList<Character>();
		int prevSpaceAt = 0;
		for(int i=0;i<arr.length;i++){
			if(i+1 >= arr.length || arr[i+1] == ' '){
				int currSpaceAt = i+1;
				while(currSpaceAt>prevSpaceAt){
					reversedArray.add(arr[currSpaceAt-1]);
					currSpaceAt--;
				}
				if(prevSpaceAt == 0) reversedArray.add(' ');
				prevSpaceAt = i+1;
				//reversedArray.add(' ');
			}
		}
		
		for(int i=reversedArray.size() -1 ;i>=0;i--){
			System.out.print(reversedArray.get(i));
		}
	}

}
