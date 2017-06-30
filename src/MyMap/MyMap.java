package MyMap;
import java.util.*;

public class MyMap {
	
	//HashMap Object
	Map<Integer,String> hashmap = new HashMap<Integer,String>();
	
	public Map insertHashMap()
	{	hashmap.put(1, "Alok");
		hashmap.put(2, "Suresh");
		hashmap.put(3, "Vicki");
		hashmap.put(4, "Jom");
		return hashmap;
	}
	
	//LinkedHashMap Object
	Map<Integer,String> linkedhashmap = new LinkedHashMap<Integer,String>();
		
	public Map insertLinkedHashMap()
	{	linkedhashmap.put(1, "Alok");
		linkedhashmap.put(2, "Suresh");
		linkedhashmap.put(3, "Vicki");
		linkedhashmap.put(4, "Jom");
		return linkedhashmap;
	}
	
	//TreehMap Object
	Map<Student,String> treemap = new TreeMap<Student,String>(new MyComparator());
		
	public Map<Student,String> insertTreeMap()
	{	treemap.put(new Student(1, "Alok"), "First Student");
		treemap.put(new Student(2, "Suresh"),"Second Student");
		treemap.put(new Student(3, "Vicki"),"Third Student");
		treemap.put(new Student(4, "Jom"),"Fourth Student");
		return treemap;
	}
	
	
	
	
	
}
