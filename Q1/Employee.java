//class Employee extends from class Person.

public class Employee extends Person{
	//Declare the required variables.
	private String department;
	private String title;
	private int hire_year;


	//Constructor
	public Employee(String name, int ssn, int age, String gender, String address, String tel_nbr, String department, String title, int hire_year) {
		super(name, ssn, age, gender, address, tel_nbr);
		this.department = department;
		this.title = title;
		this.hire_year = hire_year;
	}


	//Defining the getter methods

	public String getDepartment(){
		return department;
	}
	public String getTitle(){
		return title;
	}
	public int getHireYear(){
		return hire_year;
	}

}