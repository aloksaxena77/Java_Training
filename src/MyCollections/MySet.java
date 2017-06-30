package MyCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


//Dups are not allowed and insertion order is not maintained
public class MySet {
	
	//HashSet Implementation
	public Set insertHashSet()
		{
			Set<String> set = new HashSet<String>();
		
				for (int i=1; i<= 10; i++)
					{
						set.add("Alok" + i);
					}
				return set;
		}
	
	//LinkedHashSet Implementation
	public Set insertLinkedHashSet()
		{
			Set<String> set = new LinkedHashSet<String>();
			
			for (int i=1; i<= 10; i++)
				{
					set.add("Alok" + i);
				}
			return set;
		}
	
	//TreeSet Implementation
		public TreeSet insertTreeSet()
			{
				//TreeSet<Employee> set = new TreeSet<Employee>();
				TreeSet<Employee> set = new TreeSet<Employee>(new MyComparator());
				set.add(new Employee(1,"Ravi"));
				set.add(new Employee(2,"Alok"));
				set.add(new Employee(3,"Sudha"));
				set.add(new Employee(4,"Deva"));
				return set;
			}
	
	

}
