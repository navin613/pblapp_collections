import java.util.*;

class contact{
    HashMap<String,Integer> m1 = new HashMap<>();
    public HashMap<String,Integer> addContact(String name,int num){
        m1.put(name, num);
        return m1;
    }
    
    public void removeContact(String name){
        if(m1.containsKey(name))
            m1.remove(name);
    }
    
    public boolean checkNameExists(String name){
        if(m1.containsKey(name))
            return true;
        return false;
    }
    
    public boolean checkNumberExists(int num){
        if(m1.containsValue(num))
            return true;
        return false;
    }
    
    public void display(){
        Set set = m1.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()){
            Map.Entry me = (Map.Entry)it.next();
            System.out.println(me.getKey()+" : "+me.getValue());
        }
    }

}

public class ques4 {
    public static void main(String args[]){
        contact obj = new contact();
        obj.addContact("Sachin", 89562356);
        obj.addContact("Virat", 23568942);
        obj.addContact("Adam", 23455285);
        obj.removeContact("Adam");
        if(obj.checkNameExists("Virat"))
            System.out.println("Contact Name Found in List");
        else
            System.out.println("Contact Name Not Found in List");
        
        if(obj.checkNumberExists(89562356))
            System.out.println("Contact Number Found in List");
        else
            System.out.println("Contact Number Not Found in List");
        
        obj.display();
    }
}
