// PersonManager class for storing and displaying person information
public class PersonManager {
    private Person[] people;

    public PersonManager(Person[] people) {
        this.people = people;
    }

    public void displayPersonInformation() {
        for (Person person : people) {
            System.out.println("Name: " + person.getName());
            System.out.println("Social Security Number: " + person.getSSN());
            System.out.println("Age: " + person.getAge());
            System.out.println("Gender: " + person.getGender());
            System.out.println("Address: " + person.getAddress());
            System.out.println("Phone Number: " + person.getTelNbr());

            if (person instanceof Student) {
                Student student = (Student) person;
                System.out.println("GPA: " + student.getGPA());
                System.out.println("Major: " + student.getMajor());
                System.out.println("Year of Graduation: " + student.getGradYear());
            }

            if (person instanceof Employee) {
                Employee employee = (Employee) person;
                System.out.println("Department: " + employee.getDepartment());
                System.out.println("Job Title: " + employee.getTitle());
                System.out.println("Year of Hire: " + employee.getHireYear());

                if (employee instanceof HourlyEmployee) {
                    HourlyEmployee hourlyEmployee = (HourlyEmployee) employee;
                    System.out.println("Hourly Rate: " + hourlyEmployee.getHourlyRate());
                    System.out.println("Hours Worked: " + hourlyEmployee.getHoursWorked());
                    System.out.println("Union Dues: " + hourlyEmployee.getUnionDues());
                }

                if (employee instanceof SalariedEmployee) {
                    SalariedEmployee salariedEmployee = (SalariedEmployee) employee;
                    System.out.println("Annual Salary: " + salariedEmployee.getSalaryAnnual());
                }
            }

            System.out.println();
        }
    }
}