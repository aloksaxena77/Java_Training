package MyMap;

public class Student implements Comparable{
	int std_id;
	String std_name;
	
	public Student(int std_id,String std_name)
	{
		this.std_id = std_id;
		this.std_name = std_name;
	}

	public int getStd_id() {
		return std_id;
	}

	public void setStd_id(int std_id) {
		this.std_id = std_id;
	}

	public String getStd_name() {
		return std_name;
	}

	public void setStd_name(String std_name) {
		this.std_name = std_name;
	}

	@Override
	public int compareTo(Object arg0) {
		Student st = (Student)arg0;	
		if (this.std_id < st.std_id)
			{
				return -1;
			}
		else if (this.std_id > st.std_id)
		{
			return +1;
		}
		return 0;
	}

}
