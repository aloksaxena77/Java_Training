package MyCollections;

import java.util.Objects;

public class Employee implements Comparable {
int emp_id;
String emp_name;

public Employee(int emp_id,String emp_name)
{	this.emp_id = emp_id;
	this.emp_name = emp_name;
	
}

public int getEmp_id() {
	return emp_id;
}

public void setEmp_id(int emp_id) {
	this.emp_id = emp_id;
}

public String getEmp_name() {
	return emp_name;
}

public void setEmp_name(String emp_name) {
	this.emp_name = emp_name;
}

@Override
public int compareTo(Object arg0) {
	
	Employee e2 = (Employee)arg0;
	
	if (e2.emp_id > this.emp_id )
	{return -1;}
	else if (e2.emp_id < this.emp_id)
	{return +1;}
	else
	{return 0;}
}

public String toString()
{		
	return emp_name + emp_id ;
}

//equals Methods
public boolean equals(Object obj)
{	if (obj instanceof Employee)
		{	Employee e2 = (Employee)obj;
			if (e2.emp_id == this.emp_id ) // We r just comparing emp_id
				return true;
			else
				return false;
		}
	else
	
	return false;
}

//HashSet and HashMap uses hashcode to insert object . It puts the objects in bucket based on hashcode.
//In below code even two objects have same values but their hashcodes are different so it will go in two different buckets.
//If we add these two objects in hashset it will have two obejcts because of their hascode values.This will violate the duplicate in hashset.
//To fix this issue when we says two objects are equals then in addition to value their hashcode must be equal too.
//That is the reason when we override equals() methos we must override the hashcode() methods.

//**** When the equals() method is overridden, the hashCode() method must be overridden as well.
//If two objects are equal, their hash codes must be equal as well.
//If two objects are not equal, there’s no constraint on their hash codes (their hash codes can be equal or not).
//If two objects have identical hash codes, there’s no constraint on their equality (they can be equal or not).
//If two objects have different hash codes, they must not be equal.
public int hashCode()
{
	return Objects.hash(this.emp_id);
}



}

