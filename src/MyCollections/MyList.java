package MyCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

//import Employee;

//Dups are allowed, Insertion order is maintained
public class MyList {
	
	//ArrayList Implementation : Internal data structure is groable array.
	//Implements RandomAccess Interface so retrieve is fast but insert/delete in middle is worst
	public List<String> insertArrayList()
	{
		List<String> list = new ArrayList<String>();
	
			for (int i=1; i<= 10; i++)
				{
					list.add("Alok" + i);
				}
			
			return list;
	}
	
	//Vector Implementation
	//Implements RandomAccess Interface so retrieve is fast but insert/delete in middle is worst
	//All methods are synchronized
	public List<String> insertVectorList()
	{
		List<String> list = new Vector<String>();
	
			for (int i=1; i<= 10; i++)
				{
					list.add("Alok" + i);
				}
			
			return list;
	}
	
	//LinkedList Implementation
	//so retrieve is slow but insert/delete in middle is fast
	public List<Employee> insertLinkedList()
	{
		List<Employee> list = new LinkedList<Employee>();
		
			for (Integer i=1; i<= 10; i++)
				{
					list.add(new Employee(i,"Alok" + i.toString() ));
				}
			
			return list;
	}
		
	//Stack Implementation
	//Last in First Out
	public Stack insertStack()
	{
		Stack<String> list = new Stack<String>();
		
			for (int i=1; i<= 10; i++)
				{
					list.push("Alok" + i);
				}
						
			return list;
	}	
		
		
}










