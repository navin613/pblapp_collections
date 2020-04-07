import java.util.*;

class Employee{
    int empId;
    String empName;
    String email;
    String gender;
    float salary;
    Employee(){
    }
    Employee(int empId, String empName, String email, String gender, float salary){
        this.empId = empId;
        this.empName = empName;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }
    
    public int getEmpId(){
        return empId;
    }
    
    public String getName(){
        return empName;
    }
    
    public float getSalary(){
        return salary;
    }
    
    public void getEmployeeDetails(){
        System.out.println("Employee details : ");
        System.out.println(empId+" "+empName+" "+email+" "+gender+" "+salary);
    }
}

class EmployeeDB{
    ArrayList<Employee> al = new ArrayList();
    
    boolean addEmployee(Employee e){
        return al.add(e);
    }
    
    boolean deleteEmployee(int empId){
        boolean flag = false;
        Iterator<Employee> it = al.iterator();
        while(it.hasNext()){
            Employee e = it.next();
            if(e.getEmpId()==empId){
                flag = true;
                it.remove();
            }
        }
        return flag;
    }
    
    public String showPaySlip(int empId){
        Iterator<Employee> it = al.iterator();
        String s = "Not found";
        while(it.hasNext()){
            Employee e = it.next();
            if(e.getEmpId()==empId){
                s = e.getName()+" payslip : "+ e.getSalary();
            }
        }
        return s;
    }
    
    public Employee[] display(){
        Employee[] arr = new Employee[al.size()];
        for(int i=0;i<al.size();i++){
            arr[i] = al.get(i);
        }
        return arr;
    }
}

public class testEmployee {
    public static void main(String[] args) {
        Employee e = new Employee();
        EmployeeDB e1 = new EmployeeDB();
        Employee emp1 = new Employee(1, "Mandana", "smiriti@gmail.com", "Female", 4500000);
        Employee emp2 = new Employee(2, "Rahane", "rahane@gmail.com", "Male", 700000);
    	Employee emp3 = new Employee(3, "Pujara", "pujara@gmail.com", "Male", (float) 200000.5);
	Employee emp4 = new Employee(4, "Sachin", "ram@w3epic.com", "Male", 5000300);
        
        e1.addEmployee(emp1);
        e1.addEmployee(emp2);
        e1.addEmployee(emp3);
        e1.addEmployee(emp4);
        
        e1.deleteEmployee(2);
        System.out.println(e1.showPaySlip(1));
        for(Employee e2 : e1.display())
            e2.getEmployeeDetails();
    }
}
