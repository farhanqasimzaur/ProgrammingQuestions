package array;

public class HighestAndLowestNumberArray {
	
	
	public static void main(String args[]){
		//int[] arr = { 1, 5 , 3 , 4 , 7, 9, 23, 24 , 54, 13, 99, 1500 , 1202 , 867, 546 , 99};
		int[] arr = { 10, 80, 30, 90 , 40, 50, 70 };
		QuickSort ob = new QuickSort();
		ob.sort(arr, 0, arr.length-1);
		
		System.out.println(arr[0] + " " + arr[arr.length-1]);
	}
}
