import java.util.*;

class display{
    public static void printAll(ArrayList<String> a){
        Iterator <String> it = a.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}

public class ques3 {
    public static void main(String args[]){
        ArrayList <String> al = new ArrayList<String>();
        al.add("Hello");
        al.add("Java");
        al.add("and");
        al.add("Arraylist");
        display.printAll(al);
    }
}
