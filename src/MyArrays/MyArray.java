package MyArrays;

import java.util.*;

public class MyArray {
	int [] i = {2,5,6,1,8,5,9};
	char[] c = {'A','Z','B','H','C'};
	
	public void intSortArray()
	{	for (int k : i)
		{System.out.println("int Array before Sorting : " + k);}
		Arrays.sort(i);
		for (int k : i)
		{System.out.println("int Array after Sorting : " + k);}
	}
	
	public void charSortArray()
	{	for (char k : c)
		{System.out.println("Char Array before Sorting : " + k);}
		Arrays.sort(c);
		for (char k : c)
		{System.out.println("Char Array after Sorting : " + k);}
	}

}
