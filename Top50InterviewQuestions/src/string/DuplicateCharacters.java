package string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String stringWithDuplicates = "aaabcdefgbhijkllmnoplmcnopqrstxuvwxyz";
		HashMap<Character,Integer> charCount = new HashMap<Character,Integer>();
		char charArr[] = stringWithDuplicates.toCharArray();
		
		for(int i=0;i<charArr.length;i++){
			if(charCount.containsKey(charArr[i])){
				int count = charCount.get(charArr[i]);
				count++;
				charCount.put(charArr[i],count);
			}
			else charCount.put(charArr[i], 1);
		}
		
		for(Map.Entry<Character,Integer> entry : charCount.entrySet()){
			if(entry.getValue() > 1) System.out.println(entry.getKey());
		}
		
	}

}
