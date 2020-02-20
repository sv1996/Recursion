package allrecursion;
import java.util.Scanner;
public class GeometricSum {

	
	public static double geometricSum(int number){
		if(number==0){
			return 1;
		}
		
		return geometricSum(number-1) + 1/ Math.pow(2,number);
		
		
	}
	
	
	public static void main(String[] args) {
	
		Scanner s =new Scanner (System.in);
		
		int num=s.nextInt();
		
		System.out.print(geometricSum(num));
		
		
		
		

	}

}
