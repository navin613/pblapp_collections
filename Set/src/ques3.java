import java.util.*;

public class ques3 {
    public static void main(String args[]){
        TreeSet s1 = new TreeSet();
        s1.add("Skihar");
        s1.add("Rohit");
        s1.add("Virat");
        s1.add("Rahul");
        s1.add("Shreyas");
        s1.add("Rishabh");
        s1.add("Ravindra");
        s1.add("Hardik");
        s1.add("Jasprit");
        s1.add("Shami");
        s1.add("Kuldeep");
        Iterator it = s1.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        //Collections.reverse((List<TreeSet>) s1);
        NavigableSet<String> s2 = s1.descendingSet();
        Iterator<String> ite = s2.iterator();
        System.out.println("Tree set after reversing its elements : ");
        while(ite.hasNext()){
            System.out.println(ite.next());
        }
        String check = "Virat";
        boolean flag = false;
        Iterator it1 = s1.iterator();
        while(it1.hasNext()){
            if(it1.next().equals(check)){
                flag = true;
                break;
            }
        }
        if(flag)
            System.out.println("Yes it is available in set.");
        else
            System.out.println("No it is not available in set.");
    }
}
