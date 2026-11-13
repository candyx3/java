public class EmployeeController
{


public static void main(String[] args)
{
//    EmployeeEntity employee1 = new EmployeeEntity(1,"Rakesh","testing",15000);
//    EmployeeEntity employee2 = new EmployeeEntity(2,"Niju","develop",25000);
//    
//    EmployeeService service = new EmployeeService();
//    service.addEmployee(employee1);
//    service.addEmployee(employee2);
//    
//    service.viewEmployee();
//    EmployeeEntity emp = service.viewEmployeeById(2);
//    System.out.println(emp);


    int i = 10;
    int j = 10;

    String s1 = new String("abc");
    String s2 = new String("abc");
    
    int mem1 = System.identityHashCode(s1);
    int mem2 = System.identityHashCode(s2);
    System.out.println(mem1);
    System.out.println(mem2);

    System.out.println(s1.equals(s2));
}



}
