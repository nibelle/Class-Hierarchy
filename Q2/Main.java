public class Main {
    public static void main(String[] args) {
        Professional proffesionalEmployee = new Professional("Rose White", 4567, 2345678,27, "Female", 8000.0, 2, 150.0);
        Nonprofessional nonproffesionalEmployee = new Nonprofessional("Will Right",7896, 987543, 33, "Male", 17.5, 45, 40.0);
        
        System.out.println();

        System.out.println("Professional Employee:");
        System.out.println("Name: " + proffesionalEmployee.getName());
        System.out.println("ID: " + proffesionalEmployee.getId());
        System.out.println("SSN: " + proffesionalEmployee.getSSN());
        System.out.println("Age: " + proffesionalEmployee.getAge());
        System.out.println("Gender: " + proffesionalEmployee.getGender());
        System.out.println("Weekly Salary: $" + proffesionalEmployee.calcWeeklySalary());
        System.out.println("Health Insurance Contributions: $" + proffesionalEmployee.calcHealthCareContributions());
        System.out.println("Vacation Days Earned: " + proffesionalEmployee.calcVacationDays());
        
        System.out.println();
        
        System.out.println("Nonprofessional Employee:");
        System.out.println("Name: " + nonproffesionalEmployee.getName());
        System.out.println("ID: " + nonproffesionalEmployee.getId());
        System.out.println("SSN: " + nonproffesionalEmployee.getSSN());
        System.out.println("Age: " + nonproffesionalEmployee.getAge());
        System.out.println("Gender: " + nonproffesionalEmployee.getGender());
        System.out.println("Weekly Salary: $" + nonproffesionalEmployee.calcWeeklySalary());
        System.out.println("Health Insurance Contributions: $" + nonproffesionalEmployee.calcHealthCareContributions());
        System.out.println("Vacation Days Earned: " + nonproffesionalEmployee.calcVacationDays());
    }
}