package allrecursion;
import java.util.*;
public class FirstIndex {

	public static int firstIndex(int arr[], int number){
		
		
		return firstIndexHelper(arr,number,0);
		
		}
	public static int firstIndexHelper(int arr[], int number , int startIndex){
		if(startIndex==arr.length){
			return -1;
		}
		if(arr[startIndex]==number){
			return startIndex;
		}
		
	return 	firstIndexHelper(arr,number,startIndex+1);
		
		
	}
	
	public static void main(String[] args) {
		 Scanner s= new Scanner(System.in);
		 int n=s.nextInt();
		 int num[]=new int[n];
		 for(int i=0;i<n;i++){
			 num[i]=s.nextInt();
			  }
		    int x=s.nextInt();	 
		    System.out.println(firstIndex(num,x));
		
		
	}

}
