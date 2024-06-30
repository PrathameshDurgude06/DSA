package defaul;

import java.util.*; 


public class lINERsEARCH {
	
	public static int search(int arr[], int key) {
		int b = 0;
		for(int a =0; a<arr.length;a++) {
			if(arr[a] == key) {
				System.out.println("count : "+ b );
				return a;
			}
			b++;
			
		}
		return -1;
	}
	public static int binSearch(int arr[],int key) {
		int start = 0;
		int end = arr.length -1;
		int b = 0;
		while(start <= end) {
			int mid = (start + end)/2;
			if(arr[mid] == key) {
				System.out.println("count : "+ b );
				return mid;
			}
			else if (arr[mid] < key) {
				start = mid+1;
			}
			else 
			{
				end = mid -1;
			}
			b++;
		}
		
		
		return -1;
	}
	
	public static void main(String[] args) {
	 int arr [] = {11,22,33,44,55};
	 int arr2 [] = {11,22,33,44,55};
        Scanner sc = new Scanner (System.in);
        int key = sc.nextInt();
        System.out.println(search(arr, key));
        System.out.println("Enter second key : ");
        int key2 = sc.nextInt();
        System.out.println(binSearch(arr2, key2));
	}

}
