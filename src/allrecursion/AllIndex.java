package allrecursion;

import java.util.Scanner;

public class AllIndex {

	public static int[] allIndexes(int [] arr, int x){
		return allIndexesHelper(arr , x, 0);
		
	}
      public static int[] allIndexesHelper(int [] arr, int x , int startIndex){
		if(startIndex==arr.length){
			int output[] =new int[0];
			return output;
		} 
		int smalloutput[]= allIndexesHelper(arr , x , startIndex+1);
		if(arr[startIndex]==x){
			int output[]=new int [smalloutput.length+1];
			output[0]=startIndex;
			for(int i=0;i<smalloutput.length;i++){
				output[i+1]=smalloutput[i];
			}
			return output;
		}
		else{
			
			return smalloutput;
			
			
			
		}
		
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		 Scanner s= new Scanner(System.in);
		 int n=s.nextInt();
		 int num[]=new int[n];
		 for(int i=0;i<n;i++){
			 num[i]=s.nextInt();
			  }
		    int x=s.nextInt();	 
		int answer[]=    allIndexes(num,x);
		for(int i=0;i<answer.length;i++){
			System.out.print(answer[i]+" ");
		}
		    
	}

}
