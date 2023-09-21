// Example to test the output
public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[4];

        // Create student, employee, hourly and salaried objects
        Student student1 = new Student("Sunny Sunshine", 123456789, 21, "Female",
                "321 Apple St", "514-515-5555", 3.7, "Biomed Engineer", 2026);
        Employee employee2 = new Employee("Moon Night", 11122333, 35, "Male",
                "543 Orange St", "438-888-2525", "R&D", "Software Engineer", 2015);
        HourlyEmployee hourlyEmployee3 = new HourlyEmployee("Will Waves", 333444555, 24, "Male",
                "765 Banana St", "222-333-4444", "Maintenance", "Janitor", 2020, 15.0, 45, 10.0);
        SalariedEmployee salariedEmployee4 = new SalariedEmployee("Karen Brown", 444444444, 30, "Female",
                "789 Cherry St", "888-888-8888", "Finance", "Accountant", 2015, 60000.0);


        people[0] = student1;
        people[1] = employee2;
        people[2] = hourlyEmployee3;
        people[3] = salariedEmployee4;

        PersonManager personManager = new PersonManager(people);
        personManager.displayPersonInformation();
    }
 
}