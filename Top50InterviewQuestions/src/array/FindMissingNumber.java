package array;

public class FindMissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,7,8,9};
		
		int n = 9;
		
		int total = (n*(n+1))/2;
		
		for(int i=0;i<arr.length;i++){
			total = total - arr[i];
		}
		
		System.out.println(total);

	}

}
