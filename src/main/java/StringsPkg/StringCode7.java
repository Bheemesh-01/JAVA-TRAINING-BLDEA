package StringsPkg;

import java.util.Scanner;

//input:  We Love RCB
//output: eW evoL BCR
public class StringCode7 {
	public static void main(String[] args) {
		//Step-1
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string:");
		String str = sc.nextLine();
		String str_tmp="";
		//Step-2
		//We Love RCB
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ' || i==str.length()-1) {
				count++;
			}	
		}
		System.out.println("word count : "+count);
		
		//Step-3
		String arr[] = new String[count];
		int tmp=0;
		//Step-4
		for(int i=str.length()-1;i>=0;i--) {
			//step-5
			if(str.charAt(i)!=' ') {
				str_tmp=str_tmp+str.charAt(i);
			}
			else {
				arr[tmp] = str_tmp;
				tmp++;
				str_tmp="";
			}
		}
		arr[tmp] = str_tmp;
		
		//step-6
		for (int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}
}
