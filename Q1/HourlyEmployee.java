//class HourlyEmployee extends from class Employee.

public class HourlyEmployee extends Employee{
	//Declare the required variables.
	private double hourly_rate;
	private int hours_worked;
	private double union_dues;

	//Define another parameterized constructor with required values passed to the super class constructor.
	public HourlyEmployee(String name, int ssn, int age, String gender, String address, String tel_nbr, String department, String title, int hire_year, double hourly_rate, int hours_worked, double union_dues) {
		super(name, ssn, age, gender, address, tel_nbr, department,  title,  hire_year);
		this.hourly_rate = hourly_rate;
		this.hours_worked = hours_worked;
		this.union_dues = union_dues;
	}


	//Defining the getter methods

	public double getHourlyRate(){
		return hourly_rate;
	}
	public int getHoursWorked(){
		return hours_worked;
	}
	public double getUnionDues(){
		return union_dues;
	}

}