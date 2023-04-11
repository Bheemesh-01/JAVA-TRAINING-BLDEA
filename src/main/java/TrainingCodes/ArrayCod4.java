package TrainingCodes;

import java.util.Scanner;

public class ArrayCod4 {
	public static void main(String[] args) {
		System.out.println("Enter the count of Movie House :");
		Scanner sc = new Scanner(System.in);
		int mov_hou = sc.nextInt();
		System.out.println("Enter the count of theaters in each Movie House:");
		int thr = sc.nextInt();
		System.out.println("Enter the count of screens in each theaters of the Movie House:");
		int scr = sc.nextInt();
		
		int arr[][][] = new int[mov_hou][thr][scr];
		
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside the Movie House no: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside the theater no: "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("Enter the capacity of screen no: "+(k+1));
					arr[i][j][k] = sc.nextInt();
				}
			}
		}
		System.out.println("---------------------");
		for(int i=0;i<arr.length;i++) {
			System.out.println("inside the Movie House no: "+(i+1));
			for(int j=0;j<arr[i].length;j++) {
				System.out.println("inside the theater no: "+(j+1));
				for(int k=0;k<arr[i][j].length;k++) {
					System.out.println("the funds collected from screen no: "+(k+1));
					int fund = arr[i][j][k] * 350;
					System.out.println(fund);
				}
			}
		}
	}
}
