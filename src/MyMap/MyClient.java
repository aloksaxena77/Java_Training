package MyMap;
import java.util.*;

public class MyClient 
{

	public static void main(String[] args) 
	{
		MyMap m = new MyMap();
		
		//Implementing HashMap
		Map<Integer,String> hashmap = m.insertHashMap();
		
		//Using the Iterator Method
		Set set = hashmap.keySet();
		Iterator itr = set.iterator();
		
		while(itr.hasNext())
		{
			Integer key = (Integer)itr.next();
			System.out.println(key);
		}
			
		
		//entry id inner interface of Map so get entry objct we have to use Map.Entry
		Set map = hashmap.entrySet();
		Iterator it = map.iterator();
		while(it.hasNext())
		{	//First entry from inner Entry object
			Map.Entry<Integer,String> entry = (Map.Entry)it.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
		
		
		//For Each loop
		//iterating using Keys
		for (Integer i : hashmap.keySet()) {
		    System.out.println(i);
		}
		
		//iterarting using values
		for (String str : hashmap.values())
		{
			 System.out.println(str);
		}
		
		//iterarting using Entry
		for (Map.Entry<Integer,String> entry : hashmap.entrySet())
		{
			System.out.println(entry);
		}
		
		
		//Iplementing TreeMap
		Map<Student,String> treemap = m.insertTreeMap();
		
		for (Map.Entry<Student,String> entry : treemap.entrySet())
		{
			System.out.println("TreeMap Records " + entry.getKey().std_id + " "+ entry.getKey().std_name + "***" + entry.getValue());
		}
		
		
		
	}

}
