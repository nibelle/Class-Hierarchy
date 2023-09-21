//class SalariedEmployee extends from class Employee.

public class SalariedEmployee extends Employee{
	//Declare the required variables.
	private double salary_annual;

	//Define another parameterized constructor with required values passed to the super class constructor.
	public SalariedEmployee(String name, int ssn, int age, String gender, String address, String tel_nbr, String department, String title, int hire_year, double salary_annual) {
		super(name, ssn, age, gender, address, tel_nbr, department,  title,  hire_year);
		this.salary_annual = salary_annual;

	}

	//Defining the getter methods

	public double getSalaryAnnual(){
		return salary_annual;
	}

}