package string;

import java.util.HashMap;
import java.util.Map;


class NonRepeatingElement{
	int firstIndex;
	int count;
}





public class FirstNonRepeating {

	public static void main(String args[]){
		
		String nonRepeatingFind = "GeexkfsxGeeks";
		
		HashMap<Character,NonRepeatingElement> hashMapString = new HashMap<Character,NonRepeatingElement>();
		
		char[] arr = nonRepeatingFind.toCharArray();
		
		for(int i=0;i<arr.length;i++){
			if(hashMapString.containsKey(arr[i])){
				NonRepeatingElement count = hashMapString.get(arr[i]);
				count.count++;
				hashMapString.put(arr[i], count);
			}else{
				NonRepeatingElement newCount = new NonRepeatingElement();
				newCount.firstIndex = i;
				newCount.count = 1;
				hashMapString.put(arr[i], newCount);
			}
		}
		
		int min=Integer.MAX_VALUE;
		char firstNonR = Character.MIN_VALUE;
		for(Map.Entry<Character, NonRepeatingElement> entry : hashMapString.entrySet()){
			if(entry.getValue().count == 1 && entry.getValue().firstIndex < min){
				firstNonR = entry.getKey();
				min = entry.getValue().firstIndex;
			}
		}
		if(min!=Integer.MAX_VALUE){
			System.out.println(firstNonR);
		}else{
			System.out.println("No non repeating element found");
		}
		
		
	}
	
}
