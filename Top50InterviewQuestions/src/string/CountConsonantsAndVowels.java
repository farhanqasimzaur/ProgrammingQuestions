package string;

public class CountConsonantsAndVowels {

	public static void main(String args[]){
		String toCheck = "Check How many are vowels and how many are consonants? 1234";
		char arr[] = toCheck.toLowerCase().toCharArray();
		int vowelCount = 0;
		int consonantCount = 0;
		for(int i=0;i<arr.length;i++){
			char charToCheck = arr[i];
			if(charToCheck == 'a'
			|| charToCheck == 'e'
			|| charToCheck == 'i'
			|| charToCheck == 'o'
			|| charToCheck == 'u'){
				vowelCount++;
			}else if(charToCheck > 'a' && charToCheck < 'z'){
				consonantCount++;
			}
		}
		
		
		System.out.println(vowelCount);
		
		System.out.println(consonantCount);
	}
}
