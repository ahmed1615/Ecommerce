package pages;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;


public class Tahdermo2bla {

	public static void main(String[]args) {
	

	HashMap <String, Integer> happy =new HashMap();
	happy.put("a",10);
	happy.put("b",20);
	
	String hola="i want to leanr java and i hope also i learn java and python also";
	
	HashMap <String, Integer> newhola =new HashMap();
	Integer count=1;
	String[] arr=hola.split(" ");
	for(int i=0;i<arr.length;i++) {
		if(!hola.contains(arr[i])) {
			newhola.put(arr[i], count);
		}
		else {
			newhola.put(arr[i], newhola.get(arr[i]+1));
		}
		
	}
	
	
	

	}
}
	


