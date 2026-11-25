
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        EmployeeDAO dao=new EmployeeDAO();
        int choice;
        do {
            System.out.println("\n===== EMPLOYEE MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View All Employees");
            System.out.println("3. Search Employee");
            System.out.println("4. Update Employee");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            choice=sc.nextInt();
            sc.nextLine();
            switch(choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name=sc.nextLine();
                    System.out.print("Enter Email: ");
                    String email=sc.nextLine();
                    System.out.print("Enter Department: ");
                    String department=sc.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary=sc.nextDouble();
                    sc.nextLine();
                    Employee emp=new Employee(name,email,department,salary);
                    dao.addEmployee(emp);
                    break;
                case 2:
                    dao.viewEmployees();
                    break;
                case 3:
                    System.out.print("Enter Employee ID: ");
                    int searchId=sc.nextInt();
                    dao.searchEmployee(searchId);
                    break;
                case 4:
                    System.out.print("Enter Employee ID: ");
                    int updateId=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter New Name: ");
                    String newName=sc.nextLine();
                    System.out.print("Enter New Email: ");
                    String newEmail=sc.nextLine();
                    System.out.print("Enter New Department: ");
                    String newDepartment=sc.nextLine();
                    System.out.print("Enter New Salary: ");
                    double newSalary=sc.nextDouble();
                    sc.nextLine();
                    dao.updateEmployee(updateId,newName,newEmail,newDepartment,newSalary);
                    break;
                case 5:
                    System.out.print("Enter Employee ID: ");
                    int deleteId=sc.nextInt();
                    dao.deleteEmployee(deleteId);
                    break;
                case 6:
                    System.out.println("Thank you for using EMS!");
                    break;
                default:
                    System.out.println("Invalid Choice! Try Again.");
            }
        } while(choice!=6);
        sc.close();
    }
}

