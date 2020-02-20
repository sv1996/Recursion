package allrecursion;
import java.util.Scanner;
public class SumOfArray {
	
	public static int  sumOfArray(int number[]){
		if(number.length==0){
			return 0;
		}
		int val=number[0];
		int newArray[]=new int [number.length-1];
		for(int i=0;i<newArray.length;i++){
				newArray[i]=number[i+1];
		}
		return val + sumOfArray(newArray);
		
	}
	

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		 int n=s.nextInt();
		 int num[]=new int[n];
		 for(int i=0;i<n;i++){
			 num[i]=s.nextInt();
			 
			 
		 }
		 System.out.println(sumOfArray(num));
		 
	}

}
