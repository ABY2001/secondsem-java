package javalab;

import java.util.Scanner;

public class twodarraybiggestvalue {

	public static void main(String[] args) {
		int arr[][] = new int[3][3];
		int biggestvalue = arr[0][0];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println("enter values");
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println(" ");
		}
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				if(biggestvalue < arr[i][j]) {
					biggestvalue = arr[i][j];
				}
			}
		}
		System.out.println("biggest value is :"+ biggestvalue);
	}

}