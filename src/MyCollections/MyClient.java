package MyCollections;

import java.util.*;


public class MyClient {

	
	//Implementation of List class Methods Starts here
	public static void main(String[] args) 
	{	
		
		MyList mc = new MyList();
				
		//ArrayList
		List list = mc.insertArrayList() ;
		Iterator list_itr = list.listIterator();
		
		while (list_itr.hasNext())
		{
			System.out.println("Array List Elements " + list_itr.next());
			
		}
		
		//Vector
		List list_vector = mc.insertVectorList() ;
		Iterator vector_itr = list_vector.iterator();
		
		while (vector_itr.hasNext())
		{
			System.out.println("Vector Elements " + vector_itr.next());
			
		}
		
		//LinkedList
		List<Employee> list_linked = mc.insertLinkedList();
		Iterator<Employee> linkedlist_itr = list_linked.iterator();
		
		
		while (linkedlist_itr.hasNext())
		{
			Employee emp = linkedlist_itr.next();
			//System.out.println("LinkedList Elements " + emp.emp_id + " " + emp.emp_name);
			System.out.println("LinkedList Elements " + Objects.toString(emp));
			
		}
		
		
		for (Employee emp : list_linked)
		{
			System.out.println("LinkedList Elements " + emp.emp_id + " " + emp.emp_name);
		}
		
		//Stack
		Stack<String> list_stack = mc.insertStack() ;
		for (String str : list_stack)
		{
			
			System.out.println("Stack Elements are " + str);
		}						
	
	
	//  ************  Implementation of List class Methods Ends here
	
		
	//Implementation of Set class Methods Starts here	
	
		MySet ms = new MySet();	
		
		//HashSet Implementaion
		Set<String> hashset = ms.insertHashSet() ;
		
		for (String myset : hashset)
		{
			System.out.println("My Hasset Elements are " + myset);
		}
		
		//LinkedHashSet Implementaion
		Set<String> linkedhashset = ms.insertLinkedHashSet();
		for (String myset : linkedhashset)
			{
				System.out.println("My Linked HashSet Elements are " + myset);
			}
	
		//TreeSet Implementaion
		TreeSet<Employee> treeset = ms.insertTreeSet() ;
			
		for (Employee myset : treeset)
			{	System.out.println("My Treeset Elements are " + myset.emp_id + " " + myset.emp_name);
			}
		
		
		//checking equals() method of employee class
		//We have overridden our own equals() method on employee class that just compares the emp_id . so if emp_id matches but emp_name does not match it still returns true.
		// We are using List and List has a method called contains() that internally uses equals() method.
		List<Employee> emplist = new ArrayList<Employee>();
		emplist.add(new Employee(1,"Alok"));
		emplist.add(new Employee(2,"Mona"));
		emplist.add(new Employee(1,"Ravi"));
		emplist.add(new Employee(3,"Sonu"));
		
		Employee em = new Employee(1,"Alo");
		
		System.out.println("Employee Matches " + emplist.contains(em)); //will return true as we have overridden equals methos that just compares ID.
		
		//HashSet and HashMap uses hashcode to insert object . It puts the objects in bucket based on hashcode.
		//In below code even two objects have same values but their hashcodes are different so it will go in two different buckets.
		//If we add these two objects in hashset it will have two obejcts because of their hascode values.This will violate the duplicate in hashset.
		//To fix this issue when we says two objects are equals then in addition to value their hashcode must be equal too.
		//That is the reason when we override equals() methos we must override the hashcode() methods.
		//When the equals() method is overridden, the hashCode() method must be overridden as well.
		//If two objects are equal, their hash codes must be equal as well.
		//If two objects are not equal, there’s no constraint on their hash codes (their hash codes can be equal or not).
		//If two objects have identical hash codes, there’s no constraint on their equality (they can be equal or not).
		//If two objects have different hash codes, they must not be equal.
		
		Employee s1 = new Employee(1,"Alok");
		Employee s2 = new Employee(1,"Alo");
		System.out.println(s1.equals(s2));
		System.out.println(s1.hashCode() + "and " + s2.hashCode());
		
		
		
		
		
		
		
		
		
		
		
		
		
	//  ************  Implementation of Set class Methods Ends here
	
	}

//Class End here
}
