public class Professional extends Employee {
    private double monthly_Salary;
    private int vacation_Days;
    private double healthcare_contributions;
    
    public Professional(String name, int id, int ssn, int age, String gender, double monthly_Salary, int vacation_Days, double healthcare_contributions) {
        super(name, id, ssn, age, gender);
        this.monthly_Salary = monthly_Salary;
        this.vacation_Days = vacation_Days;
        this.healthcare_contributions = healthcare_contributions;
    }
    
    // calculating weekly salary, health contributions and vacation days:
    public double calcWeeklySalary() {
        return monthly_Salary / 4; // Montly salary divided by 4 weeks in a month
    }
    
    public double calcHealthCareContributions() {
        return healthcare_contributions; //weekly
    }
    
    public int calcVacationDays() {
        return vacation_Days; //vacay days yearly divided by 48 weeks in the year
    }
}