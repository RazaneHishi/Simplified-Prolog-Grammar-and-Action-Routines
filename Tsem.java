import java.util.*;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;


public class Tsem
{
	static HashMap<String, ArrayList<Object>> prolog= new HashMap<String, ArrayList<Object>>();
	
	ArrayList<Object> list = new ArrayList<Object>();
	
	public static void input(String ID, String key, String val) {
		
		prolog.put(ID, new  ArrayList<Object>());
		
		//create a list 'value' containing the key and val, and add it to the ArrayList inside prolog
		ArrayList<Object> list = prolog.get(ID);
		List value = new ArrayList();
		value.add(key);
		value.add(val);
		list.add(value);	
		
	
		
	}
	
	public static void query(String ID, String key, String val) {
		
		List value = new ArrayList();
		value.add(key);
		value.add(val);
		
		if(prolog.get(ID) ==  null) {
			System.out.println("Null input");
			
		}else {
		
		//check if inputed key val array 'value' matches any stored one for the same ID
		if(prolog.get(ID) !=  value) {
			System.out.println("No");
			
			
		} else {
			System.out.println("Yes");
		}
		}
		
		
		
		
		
	}
	
	

	
	
	
}