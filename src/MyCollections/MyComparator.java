package MyCollections;

import java.util.Comparator;

public class MyComparator implements Comparator {

	@Override
	public int compare(Object arg1, Object arg2) {
		Employee e1 = (Employee)arg1;
		Employee e2 = (Employee)arg2;
		
		String str1 = e1.getEmp_name();
		String str2 = e2.getEmp_name();
		
		if (str1.compareTo(str2) < 0 )
			{
				return 1;
			}
		else if (str1.compareTo(str2) > 0)
			{
				return -1;
			}
		else
			{	return 0;}
	}

}
