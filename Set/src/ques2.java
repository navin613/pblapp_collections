import java.util.*;

public class ques2 {
    public static void main(String args[]){
        HashSet<String> h = new HashSet<String>();
        h.add("Ram");
        h.add("Suraj");
        h.add("Gaurav");
        Iterator it = h.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
