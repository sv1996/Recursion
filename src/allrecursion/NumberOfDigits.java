package allrecursion;

import java.util.Scanner;

public class NumberOfDigits {
public static int numDigits(int n)

{
	
	
	 if(n==0)
	 
	
	 
	 {
		 return 0;
	 }
	 
	 
	 
	return 1+numDigits(n/10);
	
	
	
	
}
	
	
	public static void main(String[] args) {
		 Scanner s =new Scanner(System.in);
		 int num=s.nextInt();
		System.out.print(numDigits(num)); 

	}

}
 