import java.text.ParseException;

class Employee extends Person1 {
    String empId;
    double salary;

   public Employee(String name, String dateOfBirth, String empId, double salary) throws ParseException {
       super(name, dateOfBirth);
       this.empId = empId;
       this.salary = salary;
   }

   public void displayEmployeeDetails() {
       displayPersonName();
       displayAge();
       System.out.println("Employee ID: " + empId);
       System.out.println("Salary: $" + salary);
   }
}
