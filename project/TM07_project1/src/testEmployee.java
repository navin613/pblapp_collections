import java.util.*;

class employee implements Comparable<employee>{
    String FirstName;
    String LastName;
    int mob_num;
    String email;
    String add;
    
    employee(){};
    
    employee(String fname,String lname,int num,String eml,String address){
        FirstName=fname;
        LastName=lname;
        mob_num=num;
        email=eml;
        add = address;
    }
    
    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }
    public String getFirstName(){
        return FirstName;
    }
    
    public void setLastName(String LastName){
        this.LastName = LastName;
    }
    public String getLastName(){
        return LastName;
    }
    
    public void setemail(String email){
        this.email = email;
    }
    public String getemail(){
        return email;
    }
    
    public void setadd(String add){
        this.add = add;
    }
    public String getadd(){
        return add;
    }
    
    public void setmob(int mob_num){
        this.mob_num = mob_num;
    }
    public int getmob(){
        return mob_num;
    }
    
    @Override
    public int compareTo(employee emp) {
	return this.FirstName.compareTo(emp.getFirstName());
    }
}

public class testEmployee {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        employee obj = new employee();
        System.out.println("Enter the Number of Employees : ");
        int emp_num = sc.nextInt();
        String fname,lname,email,add;
        int num;
        List<employee> al = new ArrayList<>(); 
        for(int i=0;i<emp_num;i++){
            System.out.println("Enter Employee "+(i+1)+" Details :");
            System.out.println("Enter the Firstname : ");
            fname = sc.next();
            System.out.println("Enter the Lastname : ");
            lname = sc.next();
            System.out.println("Enter the Mobile : ");
            num = sc.nextInt();
            System.out.println("Enter the Email : ");
            email = sc.next();
            System.out.println("Enter the Address : ");
            add = sc.next();
            al.add(new employee(fname,lname,num,email,add));
        }
        Collections.sort(al);
        
        System.out.println("Employee List : ");
        System.out.format("%-15s %-15s %-15s %-30s %-15s\n", "Firstname", "Lastname", "Mobile", "Email", "Address");
        
       	Iterator<employee> it = al.iterator();
	while (it.hasNext()) {
            employee emp = it.next();
            System.out.format("%-15s %-15s %-15s %-30s %-15s\n",emp.getFirstName(), emp.getLastName(), emp.getmob(),emp.getemail(), emp.getadd());
        }
        
        
    }
}
