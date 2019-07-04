package array;

public class ArrayReverseJava {

	
	public static void main(String args[]){
		int arr[] = {4,5,3,6,9,7,12,42,534, 1112};
		
		int tempArr[] = new int[arr.length];
		
		for(int i=0;i<arr.length;i++){
			tempArr[arr.length-1-i] = arr[i];
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.println(tempArr[i]);
		}
		
		
		
		System.out.println("******************");
		int temp=0;
		for(int i=0;i<arr.length/2;i++){
			temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		
	}
}
