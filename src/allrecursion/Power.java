 package allrecursion;
import java.util.*;
public class Power {

 

	public static int powernum(int a,int b){
		if(b==0){
			return 1;
		}
		
		return a*powernum(a,b-1);
		
	}
	
	
	public static void main(String[] args) {
		 
		
	Scanner	s = new Scanner(System.in);
		int m=s.nextInt();
		int n=s.nextInt();
		System.out.print(powernum(m,n));
		
		
		
		
		
		
	}

}
