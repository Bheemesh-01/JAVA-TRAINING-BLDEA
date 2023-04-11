package TrainingCodes;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCod6 {
	public static void main(String[] args) {
		int arr[] = {10,30,25,68,40,15,90,78,144,71,54,8};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+", ");
		}
	}
}
