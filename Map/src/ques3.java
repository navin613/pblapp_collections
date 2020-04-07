import java.util.Map.Entry;
import java.util.*;


public class ques3 {
    public static void main(String args[]){
        Properties p1 = new Properties();
        p1.setProperty("Karnataka", "Bengaluru");
        p1.setProperty("Tamil nadu", "Chennai");
        p1.setProperty("Rajasthan", "Jaipur");
        
        Set<Entry<Object,Object>> set = p1.entrySet();
        Iterator<Entry<Object,Object>> it = set.iterator();
        
        while(it.hasNext()){
            Entry me = it.next();
            System.out.println(me);
        }
    }
}
