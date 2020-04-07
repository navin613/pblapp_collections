import java.util.*;

public class ques2 {
    public static void main(String args[]){
        HashMap<String,String> hm = new HashMap<>();
        hm.put("Sachin", "India");
        hm.put("Adam", "Australia");
        hm.put("Kane","New Zealand");
        hm.put("Dale","Africa");
        if(hm.containsKey("Adam"))
            System.out.println("Found");
        else
            System.out.println("Not Found");
        
        if(hm.containsValue("India"))
            System.out.println("Found");
        else
            System.out.println("Not Found");
        
        Set set = hm.entrySet();
        
        Iterator it = set.iterator();
        while(it.hasNext()){
            Map.Entry m1 = (Map.Entry)it.next();
            System.out.println(m1.getKey() + " : "+m1.getValue());
        }
    }
}
