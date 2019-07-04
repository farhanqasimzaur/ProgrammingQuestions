package array;

import java.util.Arrays;

public class RemoveDuplicates {

	
	public static void main(String args[]){
		int arr[] = { 1, 2, 2, 3, 4, 4, 4, 5,5,5,5}; 
		int temparr[] = new int[arr.length];
		Arrays.sort(arr);
		int temp=arr[0];
		int j=0;
		for(int i=1;i<arr.length;i++){
			
			if(arr[i] != temp){
				temparr[j] = temp;
				temp = arr[i];
				j++;
			}
		}
		temparr[j++] = arr[arr.length-1];
		
		for(int i=0;i<j;i++){
			System.out.println(temparr[i]);
		}
	}
}
