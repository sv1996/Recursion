package allrecursion;

public class CheckSorted {
public static boolean checkSorted(int input[]){
	if(input.length<=1){
		return true;
	}
	int[] smallInput=new int[input.length-1];
	for(int i=1;i<input.length;i++){
		smallInput[i-1]=input[i];
  }
	boolean smallAns=checkSorted(smallInput);
	if(!smallAns){
		return false;
	}
	if(input[0]<=   input[1]){
		return true;
	}
	return false;
}	
public static boolean checkSorted_2(int input[]){
	if(input.length<=1){
		return true;
	}
	if(input[0]>input[1]){
		return false;
	}
	
	int[] smallInput=new int[input.length-1];
	for(int i=1;i<input.length;i++){
		smallInput[i-1]=input[i];
  }
	boolean smallAns=checkSorted_2(smallInput);
	if(smallAns){
		return  true;
	}
	else
	{
		return false;
	}
}

public static boolean checkSortedBetter(int input[], int startIndex){
	
	if(startIndex==input.length-1){
		return true;
	}
	if(input[startIndex]>input[startIndex+1]){
		return false;
	}
boolean smallAns =checkSortedBetter(input,startIndex+1);
return smallAns;
	
	
}






 
 
	public static void main(String[] args) {
		int input[]={5,4,3,2,1};
		System.out.println(checkSorted(input));
		System.out.print(checkSorted_2(input));
		System.out.print(checkSortedBetter(input,0));

	}

}
