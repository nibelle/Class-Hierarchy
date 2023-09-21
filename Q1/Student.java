public class Student extends Person{
	//Declare the required variables.
	private double gpa;
	private String major;
	private int grad_year;

	//constructor
	public Student(String name, int ssn, int age, String gender, String address, String tel_nbr, double gpa, String major, int grad_year) {
		super(name, ssn, age, gender, address, tel_nbr);
		this.gpa = gpa;
		this.major = major;
		this.grad_year = grad_year;
	}

	//Defining the getter methods

	public double getGPA(){
		return gpa;
	}
	public String getMajor(){
		return major;
	}
	public int getGradYear(){
		return grad_year;
	}

}