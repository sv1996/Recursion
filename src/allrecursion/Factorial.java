package allrecursion;

public class Factorial {
 public static  int fact(int n){
	  if(n==0){
		  return 1;
	  }
	  int smallans=fact(n-1);
	  return n *smallans;
  }
	public static void main(String[] args) {
		 int n=3;
		 int ans=fact(n);
		 System.out.println(ans);
		
		

	}

}
