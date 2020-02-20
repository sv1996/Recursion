package allrecursion;
import java.util.*;
public class PrintNumbers {
public static void printnum(int n){
	if(n==1){
		System.out.print(n+" ");
		return;
	}
	printnum(n-1);
	System.out.print(n+" ");
	
	
	
}
	
	
	
	public static void main(String[] args) {
		 Scanner s =new Scanner(System.in);
		 int num=s.nextInt();
		 printnum(num);
		 
		 

	}

}
