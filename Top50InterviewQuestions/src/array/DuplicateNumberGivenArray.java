package array;

import java.util.HashMap;
import java.util.Map;

public class DuplicateNumberGivenArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1 , 3, 6 , 3, 7, 9 , 19, 1 , 5 , 9};
		
		HashMap<Integer,Integer> freq = new HashMap<Integer,Integer>();
		
		for(int i=0;i<arr.length;i++){
			if(freq.containsKey(arr[i])){
				int count = freq.get(arr[i]);
				count++;
				freq.put(arr[i], count);
			}else{
				freq.put(arr[i], 1);
			}
		}
		
		boolean dup = false;
		for(Map.Entry<Integer, Integer> entry : freq.entrySet()){
			if(entry.getValue() > 1){
				System.out.println(entry.getKey());
				dup = true;
			}
		}
		
		if(dup == false){
			System.out.println("No duplicate.");
		}
	}

}
