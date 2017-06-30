package MyMap;

import java.util.Comparator;

public class MyComparator implements Comparator{

	@Override
	public int compare(Object arg1, Object arg2) {
		Student e1 = (Student)arg1;
		Student e2 = (Student)arg2;
		
		return e1.std_name.compareTo(e2.std_name);
		
	}

}
