package allrecursion;

import java.util.Scanner;

public class SumOfDigits {

	public static int sumOfDigits(int number){
		if(number==0){
			return 0;
		}
		int count=0;
		return count=   (number%10)+sumOfDigits(number/10);
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		 Scanner s =new Scanner(System.in);
		 int num=s.nextInt();
		 System.out.print(sumOfDigits(num));

	}

}
