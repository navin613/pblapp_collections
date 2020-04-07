import java.util.*;

class ques7Employee{
    int Empid;
    String name;
    double salary;
    public ques7Employee(int Empid, String name, double salary){
        this.Empid = Empid;
        this.name = name;
        this.salary = salary;
    }
    
    public String getDetails(){
        return name+" with employee ID : "+ Empid + " "+ " with salary : "+salary;
    }
}

class testques7Employee{
    Vector <ques7Employee> vec = new Vector();
    boolean addques7Employee(ques7Employee e){
        return vec.add(e);
    }
    
    public ques7Employee [] display(){
        ques7Employee[] arr = new ques7Employee[vec.size()];
        for(int i=0;i<vec.size();i++){
            arr[i] = vec.get(i);
        }
        return arr;
    }
}

public class ques7 {
    public static void main(String args[]){
        List<Employee> vec = new Vector<>();
        ques7Employee emp1 = new ques7Employee(1,"Sachin",560000);
        ques7Employee emp2 = new ques7Employee(1,"Virat",550000);
        testques7Employee obj1 = new testques7Employee();
        obj1.addques7Employee(emp1);
        obj1.addques7Employee(emp2);
        for(ques7Employee e : obj1.display())
        System.out.println(e.getDetails());
    }
}
