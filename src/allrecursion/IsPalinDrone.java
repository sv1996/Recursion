package allrecursion;
import java.util.*;
public class IsPalinDrone {
public static boolean isPalindrone(String s){
	if(s.length()<=1){
		return true;
	}
	if(s.charAt(0)==s.charAt(s.length()-1)){
		
		return  isPalindrone(s.substring(1,s.length()-1));
	}
	else{
		return false;
	}
	
	
}
	
	
	
	
	public static void main(String[] args) {
		 Scanner s =new Scanner(System.in);
		 String str=s.nextLine();
		 System.out.print(isPalindrone(str));

	}

}
