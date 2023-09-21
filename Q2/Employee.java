abstract class Employee {
    protected String name;
    protected int id;
    protected int ssn;
    protected int age;
    protected String gender;


    //Constructor:
    public Employee(String name, int id, int ssn, int age , String gender) {
        this.name = name;
        this.id = id;
        this.ssn = ssn;
        this.age = age;
        this.gender = gender;
    }

    // Defining the getter methods
    
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
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


    //Methods for calculating weekly salary, health contributions and vacation days:
    public abstract double calcWeeklySalary();
    public abstract double calcHealthCareContributions(); //weekly
    public abstract int calcVacationDays(); //weekly
}
