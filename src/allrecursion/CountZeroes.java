package allrecursion;

import java.util.Scanner;

public class CountZeroes {
public static int countZeroes(int num){
	int count=0;
	if(num==0){
		return 1;
	}
	 if(num%10==0){
		 count++;
	 }
	 if(num/10!=0){
		 return count+ countZeroes(num/10);
		 
	 }
	 else return count;
	
	
	
	
	
	
}
	public static void main(String[] args) {
	 Scanner s =new Scanner(System.in);
	 int number= s.nextInt();
	 System.out.print(countZeroes(number));

	}

}
