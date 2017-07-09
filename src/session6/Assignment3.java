package session6;

import java.util.Arrays;
import java.util.Scanner;

public class Assignment3 {

	private static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.println("Enter the size of Integer Array");
		int size=sc.nextInt();
		int[] binary_arr=new int[size];
		System.out.println("Please enter Integer Numbers");
		for(int i=0;i<size;i++){
			binary_arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the element to search");
		int num_entered = sc.nextInt();
		
		
		
		//Binary Search
		Arrays.sort(binary_arr);
		int result=searchElement(binary_arr,num_entered);
		if(result==-1){
			System.out.println("Element is not present in the array");
		}
		else{
			System.out.println("Element found at position "+result);
		}
	}
	
	private static int searchElement(int[] binary, int element) {
		int start=0;
		int end=binary.length-1;
		do{
			int mid=(start+end)/2;
			if(element==binary[mid]){
				
				return mid;
			}
			if(element<binary[mid]) {
				
				end=end-1;
			}
			if(element>binary[mid]){
				start=start+1;
			}
			
			
		}while(start<=end);
		return -1;
	}

}
