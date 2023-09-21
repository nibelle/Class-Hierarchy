public class Nonprofessional extends Employee {
    private double hourly_Rate;
    private int hours_Worked; //per week
    private double healthcare_contributions;
    
    public Nonprofessional(String name, int id, int ssn, int age, String gender, double hourly_Rate, int hours_Worked, double healthcare_contributions) {
        super(name, id, ssn, age, gender);
        this.hourly_Rate = hourly_Rate;
        this.hours_Worked = hours_Worked; 
        this.healthcare_contributions = healthcare_contributions;
    }

    // calculating weekly salary, health contributions and vacation days:
    
    public double calcWeeklySalary() {
        return hourly_Rate * hours_Worked;
    }
    
    public double calcHealthCareContributions() {
        return healthcare_contributions; //weekly
    }
    
    public int calcVacationDays() {
        return hours_Worked / 35; //1 day of vacation for every 35 hours/week worked
    }
}