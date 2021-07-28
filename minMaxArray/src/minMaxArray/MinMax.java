package minMaxArray;

import java.util.Scanner;

public class MinMax {
	
	public static void minmax(int arr[],int size) {
		int i;
		int max;
		int min;
		if(size % 2 != 0) {
			max=arr[0];
			min=arr[0];
			i=1;
		}
		else {
			if(arr[0]>arr[1]) {
				max=arr[0];
				min=arr[1];
			}
			else {
				max=arr[1];
				min=arr[0];
			}
			i=2;
		}
		while(i<size) {
			if(arr[i]<arr[i+1]) {
				if(arr[i]<min) {
					min = arr[i];
				}	
				if(arr[i+1]>max) {
					max = arr[i+1];
				}
			}
			else {
				if(arr[i+1]<min) {
					min = arr[i+1];
				}	
				if(arr[i]>max) {
					max = arr[i];
				}
			}
			i=i+2;
		}
		
//		int[] array={max, min};
//		return array;
		
		System.out.print(max);
		System.out.print(",");
		System.out.print(min);
	}	
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of array");
		int size = sc.nextInt();
		int arr[] = new int[size];
		System.out.println("enter each element of array and press enter");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("provided array");
		for(int i=0; i<size; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
		System.out.println("the maximum and minimum element of array are");
		minmax(arr,size);
		sc.close();
	}

}
