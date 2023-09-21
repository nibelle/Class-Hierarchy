//Defining the class Person
public class Person{
	private String name;
	private int ssn;
	private int age;
	private String gender;
	private String address;
	private String tel_nbr;

	//Defining the constructor of the class Person

	public Person (String name, int ssn, int age, String gender, String address, String tel_nbr){
		this.name = name; 
		this.ssn = ssn;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.tel_nbr = tel_nbr;

	}

	//Defining the getter methods

	public String getName(){
		return name;
	}
	public int getSSN(){
		return ssn;
	}
	public int getAge(){
		return age;
	}
	public String getGender(){
		return gender;
	}
	public String getAddress(){
		return address;
	}
	public String getTelNbr(){
		return tel_nbr;
	}

}