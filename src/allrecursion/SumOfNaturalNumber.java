package allrecursion;

public class SumOfNaturalNumber {

	public static int sum(int n){
		if(n==1){
			return 1;
		}
		return sum(n-1)+n;
	}
	
	
	public static void main(String[] args) {
	int	n=4;
		
System.out.print(sum(n));
	}

}
