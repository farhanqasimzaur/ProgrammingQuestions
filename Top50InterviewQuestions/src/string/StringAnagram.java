package string;

import java.util.Arrays;

public class StringAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Pokemon is very good";
		String s2 = "KemonoP is very godo";
		
		char arr1[] = s1.toLowerCase().toCharArray();
		char arr2[] = s2.toLowerCase().toCharArray();
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		if(Arrays.equals(arr1, arr2)){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		
		
		arr1 = s1.toLowerCase().toCharArray();
		arr2 = s2.toLowerCase().toCharArray();
		
		int count = 0;
		for(int i=0;i<arr1.length;i++){
			count= count+arr1[i];
		}
		for(int i=0;i<arr2.length;i++){
			count= count-arr2[i];
		}
		if(count==0) System.out.println("YES ANAGRAM");
		else System.out.println("NO ANAGRAM");

	}

}
