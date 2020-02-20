package allrecursion;
import java.util.Scanner;

public class LastIndex {

	public static int lastIndexHelper(int [] arr , int number , int startIndex){
		if(startIndex==arr.length){
			return -1;
		}
		
      int smallAns=lastIndexHelper(arr,number,startIndex+1);
			if(smallAns!=-1){
				return smallAns;
			} 
			if(arr[startIndex]==number){
				System.out.println(startIndex+1);
				return startIndex;
				
			}
			else{
				return -1;
			}
		
		
		
	}
	
public static int lastIndex(int[] arr, int number  ){
		return lastIndexHelper(arr , number, 0);
	}
	
	
	public static void main(String[] args) {
		 
		 Scanner s= new Scanner(System.in);
		 int n=s.nextInt();
		 int num[]=new int[n];
		 for(int i=0;i<n;i++){
			 num[i]=s.nextInt();
			  }
		    int x=s.nextInt();	 
		 System.out.println(lastIndex(num,x));
		
		
		
		

	}

}
