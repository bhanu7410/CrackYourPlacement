
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class RemoveDuplicate{
	public static void main(String[] args){
	  try{
	   
		BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter length of list: ");
		int n= obj.read();
		ArrayList<Integer> GivenList=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			GivenList.add(obj.read());
		}
		System.out.println(GivenList);
	   
	  }
	  catch(IOException e){
		System.out.println("Enter valid input");
	  }
}
}