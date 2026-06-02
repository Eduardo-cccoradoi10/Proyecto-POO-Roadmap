package intruduccion.poo.encapsulacion;

//The Main class to test encapsulated class "Person"
public class Main {
public static void main(String args[]) {
// Objects to Person class
Person per1 = new Person();
Person per2 = new Person();

// Setting the values
per1.setName("Robert");
per1.setAge(21);

per2.setName("Riyan");
per2.setAge(22);

// Printing the values
System.out.println("Person 1: Name : " + per1.getName() + " Age : " + per1.getAge());
System.out.println("Person 2: Name : " + per2.getName() + " Age : " + per2.getAge());

 // Objects to Employee class
 // First object - setting values using constructor
 Employee emp = new Employee("Robert", "EMP001", 75450.00);

 // Printing data
 System.out.println("Employee (Intial Values):");
 System.out.println(emp.getEmpId() + " , " + emp.getEmpName() + " , " + emp.getSalary());

 // Updating values using setter methods
 emp.setEmpName("Riyan");
 emp.setEmpId("EMP002");
 emp.setSalary(90500.00);

 // Printing data
 System.out.println("Employee (Updated Values):");
 System.out.println(emp.getEmpId() + " , " + emp.getEmpName() + " , " + emp.getSalary());
}
}