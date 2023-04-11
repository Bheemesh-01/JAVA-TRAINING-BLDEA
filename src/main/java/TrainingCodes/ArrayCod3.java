package TrainingCodes;

import java.util.Scanner;

/*
 * class	student
 *   0			3
 *   1			4
 *   2			5
 */
public class ArrayCod3 {
	public static void main(String[] args) {
		System.out.println("Enter the count of classes :");
		Scanner sc = new Scanner(System.in);
		int cls = sc.nextInt();
		
		
		int arr[][] = new int[cls][];
		//collecting student count inside each class
		for(int i=0;i<arr.length;i++) {
			System.out.println("enter the student count inside class : "+(i+1));
			arr[i] = new int[sc.nextInt()];
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside the class "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("enter the marks of student "+(j+1));
				arr[i][j] = sc.nextInt();
			}
		}
		System.out.println("---------------------");
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside the class "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("The marks of student "+(j+1)+" is : "+arr[i][j]);
			}
		}

	}
}
