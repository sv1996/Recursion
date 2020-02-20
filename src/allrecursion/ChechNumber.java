package allrecursion;

import java.util.Scanner;

public class ChechNumber {
	public static boolean checkNumberHelper(int[] input,int x, int startIndex ){
		if(startIndex==input.length){
			return false;
		}
		if(input[startIndex]==x){
			return true;
		}
	return	checkNumberHelper(input,x, startIndex+1);
	}
	
	public static boolean checkNumber(int[] arr, int x ){
		 
		return checkNumberHelper(arr,x,0);
		
		
		
	}
	
	

	public static void main(String[] args) {
		 Scanner s= new Scanner(System.in);
		 int n=s.nextInt();
		 int num[]=new int[n];
		 for(int i=0;i<n;i++){
			 num[i]=s.nextInt();
			  }
		 int x=s.nextInt();
		 	System.out.println(checkNumber(num,x));

	}

}
